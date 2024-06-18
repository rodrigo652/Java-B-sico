package exerciciosAlgoritmo3;

public class Diferenca {
	
	public static void calc() {
		double a=1.50, f=1.10;
		int aux=0;
		
		while(f <= a) {
			a += 0.02;
			f += 0.03;
			aux++;
		}
		
		System.out.println("Será necessários " +aux+ " anos para que Felisberto seja maior que Anacleto");
	}
	
	public static void main(String[] args) {
		calc();
	}

}
