package principal;

public class Item {

			
			private int Id;
			private String nombre;
			private int cantidad;
			
			
			
			public Item(String nombre, int cantidad) {
				super();
				this.nombre = nombre;
				this.cantidad = cantidad;
			}
			public int getId() {
				return Id;
			}
			public void setId(int id) {
				Id = id;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public int getCantidad() {
				return cantidad;
			}
			public void setCantidad(int cantidad) {
				this.cantidad = cantidad;
			}
}
