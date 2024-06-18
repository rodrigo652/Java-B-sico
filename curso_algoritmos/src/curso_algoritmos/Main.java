package curso_algoritmos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá Mundo!");
		
		System.out.print("Escreva o dia de hoje: ");
		String s = sc.nextLine();
		sc.close();
		
		System.out.println("Hoje é " + s);
	}

}
