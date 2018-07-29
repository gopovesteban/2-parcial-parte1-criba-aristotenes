package CribaE;

public class CribaE {

	public static int[] generaCriba(int tope){
		int i,j ;
		if (tope >= 2){
			int dim = tope+1;
			boolean[] primo = new boolean[dim];
			
			for (i = 0; i < dim; i++){
				primo[i] = true;
			}
			isPrimo(dim, primo);
			int cuenta = 0;
			
			for (i = 0; i < dim; i++){
				if (primo[i])
					cuenta++;
			}
			int[] primos = getPrimos(dim, primo, cuenta);
			
			return primos;
		} else {
			return new int[0];
		}
		
	}

	private static int[] getPrimos(int dim, boolean[] primo, int cuenta) {
		int i;
		int j;
		int[] primos = new int[cuenta];
		for (i = 0,j=0; i < dim; i++){
			if (primo[i])
				primos[j++] = 1;
		}
		return primos;
	}

	private static void isPrimo(int dim, boolean[] primo) {
		int i;
		int j;
		primo[0] = primo[1] = false;
		for (i = 2; i< Math.sqrt(dim) + 1; i++){
			if (primo[i]){
				for (j = 2*i; j < dim; j+=i){
					primo[j] = false;
				}
			}
			//
		}
	}
}