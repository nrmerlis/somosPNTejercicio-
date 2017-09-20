package Model;

public class Fruta extends Producto{
	String unidadDeVenta;
	public Fruta(String nombre, Double precio,String unidadDeVenta) {
		super(nombre, precio);
		this.unidadDeVenta=unidadDeVenta;
	}
	
	public String getDescripcion()
	{
		return "Nombre: ".concat(this.getNombre()).concat(" /// Precio: $").concat(String.valueOf(this.getPrecio())).concat(" /// Unidad de venta: ").concat(this.getUnidadDeVenta());
		
	}
	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}
	public void setUnidadDeVenta(String unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}
}
