package curso_algoritmos;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
	
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		int[] vet2 = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
			
			if(vet[i] < 0)
			{
				vet2[i] = vet[i];
			}
		}
		
		System.out.println("Numeros negativos: ");
		for(int i=0;i<n;i++) {
			if(vet2[i] != 0) {
				System.out.println(vet2[i]);
			}
		}
		
		sc.close();
		
	}

}
