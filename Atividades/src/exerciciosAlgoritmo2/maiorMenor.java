package exerciciosAlgoritmo2;

import java.util.Scanner;

public class maiorMenor {
	
	private static int maior(int v[]) {
		int max = v[0];
		
		for(int i=0;i<v.length;i++) {
			if(v[i] > max) {
				max = v[i];
			}
		}
		return max;
	}
	
	private static int menor(int v[]) {
		int min = v[0];
		
		for(int i=0;i<v.length;i++) {
			if(v[i] < min) {
				min = v[i];
			}
		}
		
		return min;
	}
	
	public static void executarPrograma() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros para o conjunto de valores: ");
		int n = sc.nextInt();
		
		int v[] = new int[n];
		
		
		for(int i=0;i<v.length;i++) {
			v[i] = sc.nextInt();
		}
		
		System.out.println("Maior = " + maior(v));
		System.out.println("Menor = " + menor(v));
		
		sc.close();
	}

}
