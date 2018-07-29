package CribaETest;

import static org.junit.Assert.*;

import org.junit.Test;

import CribaE.CribaE;

public class CribaETest {
	CribaE criba = new CribaE();
	@Test
	public void test() {
		
		
		int tope=32;
		int[] primos;
		
		
		primos = CribaE.generaCriba(tope);
		
		
		for (final int primo : primos) {
	         System.out.println(primo);
	         
	         assertEquals(6,CribaE.generaCriba(tope).length);
		
	}

}
	
}
