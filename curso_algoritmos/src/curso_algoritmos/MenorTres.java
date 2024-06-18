package curso_algoritmos;

import java.util.Scanner;

public class MenorTres {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro valor: ");
		n1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		n2 = sc.nextInt();
		System.out.print("Terceiro valor: ");
		n3 = sc.nextInt();
		
		if(n1 < n2 && n1 < n3) {
			System.out.println("MENOR = " + n1);
		} else if (n2 < n1 && n2 < n3) {
			
				System.out.println("MENOR = " + n2);
		} else {
			System.out.println("MENOR = " + n3);
		}
		
		sc.close();
		
	}

}
