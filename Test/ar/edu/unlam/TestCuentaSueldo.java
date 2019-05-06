package ar.edu.unlam;

import org.junit.Assert;
import org.junit.Test;

public class TestCuentaSueldo {

	@Test
	public void test() {
		CuentaSueldo c1 = new CuentaSueldo(0110, "Brie", "Larson");

		c1.depositar(400.0);
		c1.extraer(200.0);

		Double esperado = 200.0;
		Double actual;
		actual = c1.consultarSaldo();
		
		Assert.assertEquals(esperado, actual);
		
		
		
		
		
		 

	}

}
