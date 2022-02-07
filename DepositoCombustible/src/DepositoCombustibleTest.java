import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	@Disable
	@Test
	void testgetDepositoNivel () {	
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0); //Poner los litros de la gasolina inicial
		DepositoCombustible.getDepositoNivel();
		double actual = DepositoCombustible.getDepositoNivel();
		double esperado = 0; //Litros esperados de gasolina inicial
		assertEquals(esperado, actual);
	}
	
	@Disable
	@Test
	void testgetDepositoMax () {	
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		DepositoCombustible.getDepositoMax();
		double actual = DepositoCombustible.getDepositoMax();
		double esperado = 0;
		assertEquals(esperado, actual);
	}
	
	@Disable
	@Test
	void testestaVacio () {	
		
		DepositoCombustible.estaVacio();
		boolean actual = DepositoCombustible.estaVacio();
		boolean esperado = true;
		assertEquals(esperado, actual);
	}
	
	@Disable
	@Test
	void testestaLleno () {	
		
		DepositoCombustible.estaLleno();
		boolean actual = DepositoCombustible.estaLleno();
		boolean esperado = false;
		assertEquals(esperado, actual);
	}
	
	@Disable
	@Test
	void testfill () {
		
		DepositoCombustible.fill(5);
		double actual = DepositoCombustible.getDepositoNivel();
		double esperado = 5;
		assertEquals(esperado, actual);	
	}
	
	@Test
	void tesconsumir () {
		
		DepositoCombustible.consumir(5);
		double actual = DepositoCombustible.getDepositoNivel();
		double esperado = 5;
		assertEquals(esperado, actual);
	
	}
}
