package exerciciosAlgoritmo2;

public class quociente {
	
	
	private static int calc(int n1, int n2) {
		int aux=0, sum=0;
		
		while(sum <= n1) {
			sum += n2;
			aux++;
		}
		return aux-1;
	}
	
	public static void main(String[] args) {
		int n1=60, n2=20;
		calc(n1, n2);
		
		System.out.println("Quociente inteiro da divisão: " + calc(n1, n2));
		
	}

}
