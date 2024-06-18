package exerciciosAlgoritmo2;

import java.util.Scanner;

public class altura {
	
	private static void alturas() {
		
		Scanner sc = new Scanner(System.in);
		
		double minAltura=1000, maxAltura=0, nMulheres=0, aMulheres=0, altura, diff, mediaMulheres;
		int nHomens=0;
		char s;
		
		for(int i=0;i<5;i++) {
			System.out.print("Altura: ");
			altura = sc.nextDouble();

			System.out.print("Sexo: ");
			s = sc.next().charAt(0);
			if(s == 'f') {
				aMulheres = aMulheres + altura;
				nMulheres++;
			}
			if(altura > maxAltura) {
				maxAltura = altura;
			}
			if(altura < minAltura) {
				minAltura = altura;
			}
			if(s == 'm') {
				nHomens++;
			}
		}
		
		mediaMulheres = aMulheres/nMulheres;
		diff = ((nMulheres*100)/5) - ((nHomens*100)/5);
		
		System.out.println("Maior altura = " + maxAltura);
		System.out.println("Menor altura = " + minAltura);
		System.out.println("Media altura das mulheres = " + String.format("%.2f", mediaMulheres));
		System.out.println("Numero de homens = " + nHomens);
		System.out.println("Diferença porcentual entre homens e as mulheres = " + diff + "%");
		
		sc.close();
	}
	
	public static void main(String[] args) {
		
		alturas();
		
	}

}
