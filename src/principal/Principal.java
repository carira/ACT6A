package principal;


import java.util.Calendar;
import java.util.Date;
import org.hibernate.Session;


public class Principal {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creando");
		
		Calendar fecha=Calendar.getInstance();

		
		Session session = HibernateUtilities.getSessionFactory().openSession();		
		session.beginTransaction();
		
		Empresa emp = new Empresa("B21000760N", "C/ canovas, 40", 25, "Carles S.L");
			
		Item item = new Item("carles", 23000);
		
		Date time= new Date(fecha.getTimeInMillis());
		Pedido ped = new Pedido(time);
		
		
		session.save(emp);
		session.save(item);
		session.save(ped);
		
		session.getTransaction().commit();
		
		/*
		session.beginTransaction();
		
		
		
		session.getTransaction().commit();
*/
		session.close();	
		HibernateUtilities.getSessionFactory().close();
		
		
		
	}

}
