package exerciciosAlgoritmo2;

import java.util.Locale;

public class Fahrenheit {
	
	
	private static void tabela() {
		
		Locale.setDefault(Locale.US);
		
		double c=0.0;
		System.out.println("Tabela de graus Fahrenheit para Celsius\n");
		for(double i=50;i<150;i++) {
			c = (i-32)*5/9;
			System.out.println(i + " Fahrenheit = " + String.format("%.2f", c) + " Cº");
		}
	}
	
	public static void main(String[] args) {
		
		tabela();
	}

}
