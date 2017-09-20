package main;


import Model.Bebida;
import Model.Fruta;
import Model.Higiene;
import Model.Producto;
import Model.RepositoriosYHandlers.RepositorioProducto;

public class Main{
	
	public static void main(String[] args) {
		
		
		Producto cocaZero = new Bebida("Coca-Cola Zero",20.0, 1.5);
		Producto coca = new Bebida("Coca-Cola",18.0, 1.5);
		Producto shampooSedal = new Higiene("Shampoo Sedal", 19.0, 500);
		Producto frutillas = new Fruta("Frutillas", 64.0, "kilo");
		
		RepositorioProducto.productos.addProducto(cocaZero);
		RepositorioProducto.productos.addProducto(coca);
		RepositorioProducto.productos.addProducto(shampooSedal);
		RepositorioProducto.productos.addProducto(frutillas);
		
		
		RepositorioProducto.productos.imprimirDescripcionProductos();
		RepositorioProducto.productos.imprimirProductoMasBarato();
		RepositorioProducto.productos.imprimirProductoMasCaro();
		
	}
}
