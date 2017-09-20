package Model;

public class Bebida extends Producto{
	Double litros;
	
	public Bebida(String nombre, Double precio,Double litros) {
		super(nombre, precio);
		this.litros=litros;
	}

	public String getDescripcion()
	{
		return "Nombre: ".concat(this.getNombre()).concat(" /// Litros: ").concat(String.valueOf(this.getLitros())).concat(" /// Precio: $").concat(String.valueOf(this.getPrecio()));
		
	}
	
	public Double getLitros() {
		return litros;
	}

	public void setLitros(Double litros) {
		this.litros = litros;
	}

}
