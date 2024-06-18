package curso_algoritmos;

import java.util.Locale;
import java.util.Scanner;


public class Retangulo {
	
	public static void main(String[] args) {
		
		double baseRetangulo, alturaRetangulo, area, perimetro, diagonal;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base do retangulo: ");
		baseRetangulo = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		alturaRetangulo = sc.nextDouble();
		
		area = baseRetangulo * alturaRetangulo;
		perimetro = (2*baseRetangulo) + (2*alturaRetangulo);
		diagonal = Math.sqrt(Math.pow(baseRetangulo, 2) + Math.pow(alturaRetangulo, 2));
		
		System.out.println("Area = " + String.format("%.4f", area));
		System.out.println("Perimetro = " + String.format("%.4f", perimetro));
		System.out.println("Diagonal = " +String.format("%.4f", diagonal));
		
		sc.close();
	}

}
