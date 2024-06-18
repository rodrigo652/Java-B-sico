package exerciciosAlgoritmo2;

import java.util.Scanner;

public class primo {
	
	
	private static int verificaPrimo(int numero) {
		   int d;
		   if(numero <= 1) return 0;
		   for (d = 2; d*d <= numero; d++) { //se o número tiver um divisor maior que a raiz quadrada de n, seu divisor correspondente será menor que a raiz quadrada e já verificado no loop.
		     if (numero%d == 0)   // d divide n
		       return 0;
		    }
		   return 1;
	}
	
	public static void executaPrograma() {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for(int i=n1;i<n2;i++) {
			if(verificaPrimo(i) == 1) {
				System.out.println(i);
			}
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		executaPrograma();
	}
}
