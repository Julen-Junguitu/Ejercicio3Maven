package facturaclase;
/**
 * Aplicación de productos y sus precios
 * @author Julen
 *
 */
public class Producto {

	public String nombre;
	
	public float precio;
	
	public int cantidad;
	
	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	/**
	 * Función para devolver el coste del producto multiplciado por las unidades
	 * @return valor resultado
	 */
	public float precioTotal() {
		return this.precio * this.cantidad;
	}
}
