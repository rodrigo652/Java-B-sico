package exerciciosAlgoritmo2;

import java.util.Scanner;

public class eleicao {

	private static void stats() {

		Scanner sc = new Scanner(System.in);

		int v[] = new int[10];
		int p = 0, s = 0, t = 0, q = 0, b = 0, n = 0, tv = 0;


		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite 1, 2, 3, 4 voto para os respectivos candidatos\n" + "Digite 5 para voto nulo\n"
					+ "Digite 6 para voto em branco");
			System.out.println();
			
			System.out.print("Digite sua opcao: ");
			v[i] = sc.nextInt();

			if (v[i] == 1) {
				p++;
			} else if (v[i] == 2) {
				s++;
			} else if (v[i] == 3) {
				t++;
			} else if (v[i] == 4) {
				q++;
			} else if (v[i] == 5) {
				n++;
			} else if (v[i] == 6) {
				b++;
			} else if (v[i] == 0) {
				break;
			}
			tv++;
		}
		double pp = (p * 100) / tv;
		double sp = (s * 100) / tv; 	
		double tp = (t * 100) / tv;
		double qp = (q * 100) / tv;
		double bp = (b * 100) / tv;
		double np = (n * 100) / tv;
		
		System.out.println("O total de votos para o candidato 1: " + p + " e seu porcentual sobre o total: " + pp + "%");
		System.out.println("O total de votos para o candidato 2: " + s + " e seu porcentual sobre o total: " + sp + "%");
		System.out.println("O total de votos para o candidato 3: " + t + " e seu porcentual sobre o total: " + tp + "%");
		System.out.println("O total de votos para o candidato 4: " + q + " e seu porcentual sobre o total: " + qp + "%");
		System.out.println("O total de votos em branco: " + b + " e seu porcentual sobre o total: " + bp + "%");
		System.out.println("O total de votos nulo: " + n + " e seu porcentual sobre o total: " + np + "%");
		
		sc.close();
	}
	
	public static void main(String[] args) {
		
		stats();
	}

}
