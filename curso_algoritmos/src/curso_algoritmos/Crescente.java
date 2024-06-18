package curso_algoritmos;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println("Crescente");
		} else {
			System.out.println("Decrescente");
		}
		
		while(n1 != n2) {
			System.out.print("Digite outro primeiro numero: ");
			n1 = sc.nextInt();
			System.out.print("Digite outro segundo numero: ");
			n2 = sc.nextInt();
			
			if(n1 > n2) {
				System.out.println("Crescente");
			} else if (n1 < n2) {
				System.out.println("Decrescente");
			} else {
				System.out.println("");
			}
		}
		
		sc.close();
	}

}
