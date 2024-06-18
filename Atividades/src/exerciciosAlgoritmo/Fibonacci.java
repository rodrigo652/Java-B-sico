package exerciciosAlgoritmo;

import java.util.Scanner;

public class Fibonacci {
	
public static void executarPrograma() {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<20;i++) {
            System.out.print(Fibonacci.calc(i) + " ");
        }
	}

	private static long calc(int numero) {
	        if (numero < 2) return numero; // Se numero for menor que 2 (significando que é 0 ou 1),
	        return calc(numero - 1) + calc(numero - 2);
	}
}

	

