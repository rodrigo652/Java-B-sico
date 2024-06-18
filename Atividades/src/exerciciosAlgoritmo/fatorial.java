package exerciciosAlgoritmo;

import java.util.Scanner;

public class fatorial {
	
public static void executarPrograma() {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		System.out.println("Fatorial do numero " + n + ": " + calc(n));
	}
	
	private static int calc(int numero) {
		if(numero <= 1) return 1;
		else return calc(numero-1) * numero;
	}

}
