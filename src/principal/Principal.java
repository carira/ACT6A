package principal;


import java.util.Calendar;
import java.util.Date;
import org.hibernate.Session;


public class Principal {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creando");
		
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
	
	
	cargarTablas(session);
	recuperarDatos(session);
	
	session.close();
	HibernateUtilities.getSessionFactory().close();
	
}

private static void cargarTablas(Session session) {
	
	session.beginTransaction();
	Empresa emp = new Empresa("21000760-N", "Carles S.L", 25, "C/ canovas, 40");

	Calendar fecha=Calendar.getInstance();
	Date time= new Date(fecha.getTimeInMillis());
	Pedido ped = new Pedido(time);
	
	Item item = new Item("Pepinos", 23000);
	
	session.saveOrUpdate(emp);
	session.saveOrUpdate(ped);
	session.saveOrUpdate(item);
	session.getTransaction().commit();
	
}

private static void recuperarDatos(Session session) {
	session.beginTransaction();
	Empresa emp = session.get(Empresa.class, "21000760-N");
	Pedido ped = session.get(Pedido.class, 1);
	Item item = session.get(Item.class, 1);
	session.getTransaction().commit();
	
	
	
	
	
	System.out.println("\n"+"\n"+"\n" );
	System.out.println("-----------------------------------------------------------------------------" );
	System.out.println("Empresa recuperada: "+emp.getNombre()+"\n Direccion: "+emp.getDireccion()+"\n CIF: "+emp.getCif()+"\n Empleados: "+emp.getEmleados());
	System.out.println("Pedido recuperado Dia: "+ped.getFecha());
	System.out.println("Item recuperado: "+item.getNombre()+"\n  Cantidad: "+item.getCantidad()+" unidades");
	System.out.println("-----------------------------------------------------------------------------" );
	System.out.println("\n"+"\n"+"\n" );
	
}

}