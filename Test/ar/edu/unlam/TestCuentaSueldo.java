package ar.edu.unlam;

import org.junit.Assert;
import org.junit.Test;

public class TestCuentaSueldo {

	@Test
	public void test() {
		CuentaSueldo c1 = new CuentaSueldo(2019, "Carol", "Danvers");

		c1.depositar(10000.0);
		c1.extraer(200.0);

		Double esperado = 9800.0;
		Double actual;
		actual = c1.consultarSaldo();
		
		Assert.assertEquals(esperado, actual);
		
		
		
		
		
		 

	}

}
