package exerciciosAlgoritmo;

import java.util.Scanner;

public class circulo {
	
	public static void executarPrograma() {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
    
        System.out.println("Area: " + calc(a));
    }
	
	private static double calc(double a) {
		return a*a*3.14;
	}
}
