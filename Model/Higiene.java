package Model;

public class Higiene extends Producto{
	

	int contenido; //En ml
	public Higiene(String nombre, Double precio, int contenido) {
		super(nombre, precio);
		this.contenido=contenido;
	}
	public String getDescripcion()
	{
		return "Nombre: ".concat(this.getNombre()).concat(" /// Contenido: ").concat(String.valueOf(this.getContenido())).concat("ml").concat(" /// Precio: $").concat(String.valueOf(this.getPrecio()));
		
	}
	public int getContenido() {
		return contenido;
	}
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
}
