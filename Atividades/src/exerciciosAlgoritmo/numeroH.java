package exerciciosAlgoritmo;

import java.util.Scanner;

public class numeroH {
	
public static void executarPrograma() {
		
		Scanner sc = new Scanner(System.in);
		
		double n=sc.nextDouble();
		
		System.out.println("Numero h: " + somaH((int) n));
	}

	public static double somaH(int n) {
	    return somaRecursivo(1, n);
	}

	private static double somaRecursivo(int i, int n) {
	  if (n == i) {
	    return 1.0/i;
	  }
	  return 1.0/i + somaRecursivo(i + 1, n);
	}
}
