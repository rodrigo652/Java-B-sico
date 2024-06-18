package exerciciosAlgoritmo;

import java.util.Scanner;

public class Primo {
	
	public static void executarPrograma() {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		if(verificaPrimo(n) == 1) System.out.println("É primo");
		else System.out.println("Não é primo");

	}
	
	private static int verificaPrimo(int numero) {
		   int d;
		   if(numero <= 1) return 0;
		   for (d = 2; d*d <= numero; d++) { //se o número tiver um divisor maior que a raiz quadrada de n, seu divisor correspondente será menor que a raiz quadrada e já verificado no loop.
		     if (numero%d == 0)   // d divide n
		       return 0;
		    }
		   return 1;

	}
}
