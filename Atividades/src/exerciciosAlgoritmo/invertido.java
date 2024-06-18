package exerciciosAlgoritmo;

import java.util.Scanner;

public class invertido {
	
	public static void executarPrograma() {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
    
        System.out.println("Invertido: " + invert(a));
    }
	
	private static int invert(int a) {
		int inv = 0;
		while(a != 0) {
			int sobra = a%10;
			inv = inv * 10 + sobra;
			a = a / 10;
		}
		return inv;
	}
	
	//numero = 123
	//sobra = 123 % 10 = 3
	//invertido = 0 * 10 + 3 = 3 
	//numero = 123 / 10 = 12
	//repete ate ser 0

}
