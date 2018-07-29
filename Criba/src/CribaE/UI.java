package CribaE;

public class UI {

	public static void main(String[] args) {
		
		
		//CribaE criba = new CribaE();
		int tope=32;
		int[] primos;
		primos = CribaE.generaCriba(tope);
		
		
		for ( int primo : primos) {
	         System.out.println(primo);
	}
	}

}
