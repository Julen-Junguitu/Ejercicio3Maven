package facturaclase;

import java.util.ArrayList;
/**
 * Aplicación la factura total de los productos
 * @author Julen
 *
 */
public class Factura {

	ArrayList<Producto> productos = new ArrayList<Producto>();
	
	/**
	 * Función para añadir productos al array
	 * @param producto
	 */
	public void meterProducto(Producto producto) {
		productos.add(producto);
	} 
	/**
	 * Función para devolver el coste total de la factura
	 * @return valor resultado
	 */
	public float totalFactura() {
		float total = 0f;
		Producto producto;
		for(int i=0;i<productos.size();i++) {
			producto = productos.get(i);
			total = total + producto.precioTotal();
		}
		return total;
	}
	/**
	 * Función para devolver el coste total de la factura con iva
	 * @param iva
	 * @return valor resultado
	 */
	public float aplicarIva(float iva) {
		//Hago entre 100 para que si pones 21 de iva multiplique por 0.21
		iva = iva / 100;
		float precioIva = totalFactura() * iva;
		
		return totalFactura() + precioIva;
	}
}
