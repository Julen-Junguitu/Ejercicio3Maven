

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import facturaclase.Producto;
import junit.extensions.ActiveTestSuite;
import junit.extensions.RepeatedTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ProductoTest extends TestCase  {

	public ProductoTest(String testMethodName) {
		super(testMethodName);
	}

	public void comprobacion() {
		Producto target = new Producto("pan",0.50f, 1);
		String expected = "pan";
		String actual = target.nombre;
		assertEquals("comprobacion de que se inician bien las propiedades",expected, actual);
	}
	
	public void testPrecioTotal() {
	Producto target = new Producto("pan",0.50f, 3);
	float expected = target.precio * target.cantidad ;
	float actual = target.precioTotal();
	assertEquals("comprobacion de que la funcion precio total funciona correctamente",expected, actual);
	}
	
	@Test
	public static TestSuite suite() {
		
		TestSuite mySuite = new ActiveTestSuite();
		
		mySuite.addTest(new RepeatedTest(new ProductoTest("comprobacion"), 1));
		mySuite.addTest(new RepeatedTest(new ProductoTest("testPrecioTotal"), 1));
		return mySuite;
		
	}
}
