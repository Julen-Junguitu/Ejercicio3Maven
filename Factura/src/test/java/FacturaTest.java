

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import facturaclase.Factura;
import facturaclase.Producto;
import junit.extensions.ActiveTestSuite;
import junit.extensions.RepeatedTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FacturaTest extends TestCase  {


	public FacturaTest(String testMethodName) {
		super(testMethodName);
	}

	public void testTotalFactura() {
		Factura target = new Factura();
		Producto cocacola = new Producto("cocacola", 1f, 3);
		Producto pan = new Producto("pan", 2f, 1);
		target.meterProducto(cocacola);
		target.meterProducto(pan);
		float expected = cocacola.precioTotal() + pan.precioTotal();
		float actual = target.totalFactura();
		assertEquals("comprobacion de que la funcion total factura funciona correctamente",expected, actual);
	}
	
	public void testAplicarIva() {
		Factura target = new Factura();
		Producto cocacola = new Producto("cocacola", 1f, 3);
		Producto pan = new Producto("pan", 2f, 1);
		target.meterProducto(cocacola);
		target.meterProducto(pan);
		float expected = 1.21f*(cocacola.precioTotal() + pan.precioTotal());
		float actual = target.aplicarIva(21);
		assertEquals("comprobacion de que la funcion aplicar iva funciona correctamente",expected, actual);
	}
	
	@Test
	public static TestSuite suite() {
		
		TestSuite mySuite = new ActiveTestSuite();
		
		mySuite.addTest(new RepeatedTest(new FacturaTest("testTotalFactura"), 1));
		mySuite.addTest(new RepeatedTest(new FacturaTest("testAplicarIva"), 1));
		return mySuite;
		
	}
}
