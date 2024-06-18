package exerciciosAlgoritmo;

import java.util.Scanner;

public class maiorMenor {

	    public static void executarPrograma() {
	        Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[5];
	        
	        for (int i=0; i<5; i++) {
	            numeros[i] = scanner.nextInt();
	        }

	        int maior = calcularMaiorValor(numeros);
	        int menor = calcularMenorValor(numeros);

	        System.out.println("O maior valor fornecido é: " + maior);
	        System.out.println("O menor valor fornecido é: " + menor);

	        scanner.close();
	    }

	    private static int calcularMaiorValor(int[] numeros) {
	        int maior = numeros[0];
	        for (int numero : numeros) {
	            if (numero > maior) {
	                maior = numero;
	            }
	        }
	        return maior;
	    }

	    private static int calcularMenorValor(int[] numeros) {
	        int menor = numeros[0];
	        for (int numero : numeros) {
	            if (numero < menor) {
	                menor = numero;
	            }
	        }
	        return menor;
	    }
}
