package curso_algoritmos;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		double soma=0, media;
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
			soma = soma + vet[i];
		}
		
		System.out.print("Valores = ");
		for(int i=0;i<n;i++)
		{
			System.out.print(vet[i] + " ");
			
		}
		
		media = soma/n;
		
		System.out.println("\nSoma = " + soma);
		System.out.println("Media = " + media);
		
		sc.close();
	}

}
