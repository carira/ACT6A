package principal;

import java.util.Date;

public class Pedido {
	private int Id;
		private Date fecha;	
		
		
		
		public Pedido(Date fecha) {
			super();
			
			this.fecha = fecha;
			
			
		}
		public int getId() {
		return Id;
		
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
		
		
}
		