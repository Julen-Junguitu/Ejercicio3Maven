package facturaclase;
/**
 * Aplicaci�n de productos y sus precios
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
	 * Funci�n para devolver el coste del producto multiplciado por las unidades
	 * @return valor resultado
	 */
	public float precioTotal() {
		return this.precio * this.cantidad;
	}
}
