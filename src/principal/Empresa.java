package principal;

public class Empresa {
		
		private String cif;
		private String nombre;
		private int emleados;
		private String direccion;
		
		
		public Empresa(String cif, String nombre, int emleados, String direccion) {
			super();
			this.cif = cif;
			this.nombre = nombre;
			this.emleados = emleados;
			this.direccion = direccion;
		}
	
		
		
		
		public String getCif() {
			return cif;
		}

		public void setCif(String cif) {
			this.cif = cif;
		}

		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEmleados() {
			return emleados;
		}
		public void setEmleados(int emleados) {
			this.emleados = emleados;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		
		
}
