package Model.RepositoriosYHandlers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Model.Producto;



public class HandlerProducto {
	List<Producto> listaDeProductos = new ArrayList<Producto>();

	public List<Producto> getListaDeProductos() {
		return listaDeProductos;
	}

	public void addProducto (Producto producto) {
		this.listaDeProductos.add(producto);
	}
	
	public void imprimirDescripcionProductos() {
		this.listaDeProductos.stream().forEach(pro->System.out.println(pro.getDescripcion()));
		System.out.println("=============================");
	}
	
	public void imprimirProductoMasCaro() {
		System.out.println("Producto más caro: "+ordenarListaPorPrecioAscendente().get(ordenarListaPorPrecioAscendente().size()- 1).getNombre());
	}
public void imprimirProductoMasBarato() {
		
		
		System.out.println("Producto más barato: "+ordenarListaPorPrecioAscendente().get(0).getNombre());
		
	}
	public List<Producto> ordenarListaPorPrecioAscendente()
	{
		return this.listaDeProductos.stream().sorted(Comparator.comparing(Producto::getPrecio)).collect(Collectors.toList());
	}
}
