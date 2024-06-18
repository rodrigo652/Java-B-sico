package exerciciosAlgoritmo2;

public class potenciacao {
	
	public static int calc(int a, int b) {
		int sum=1;
		
		for(int i=0; i<b; i++) {
			sum *= a;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		int a=3, b=5;
		
		calc(a,b);
		
		System.out.println("Resultado de uma exponenciação: " + calc(a, b));
	}

}
