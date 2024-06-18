package exerciciosAlgoritmo2;

public class Mmc {
	
	private static double cmmc(int n1, int n2) {
		
		if(n1 == 0) return n2;
		
		return cmmc(n2 % n1, n1);
		
	}
	
	private static double cmdc(int n1, int n2) {
		
		return (n1 / cmmc(n1, n2)) * n2;
		
	}

	public static void main(String[] args) {
	        int n1 = 12, n2 = 9;
	        System.out.println("MMC de " + n1 + " e " + n2 + " é " + cmdc(n1, n2));
	        System.out.println("MDC de " + n1 + " e " + n2 + " é " + cmmc(n1, n2));
	}
}
