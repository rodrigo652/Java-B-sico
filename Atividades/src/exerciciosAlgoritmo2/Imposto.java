package exerciciosAlgoritmo2;

import java.util.Scanner;

public class Imposto {
	
	private static void calcImposto() {
		
		Scanner sc = new Scanner(System.in);
		
		double salmin;
		
		System.out.print("Digite o valor do salario minimo: ");
		salmin = sc.nextDouble();
		
		String cpf[] = new String[2];
		int dep[] = new int[2];
		double renda[] = new double[2];
		double desc[] = new double[2];
		double vPagar[] = new double[2];
		
		
		for(int i=0;i<2;i++) {
			System.out.print("Digite seu cpf: ");
			cpf[i] = sc.nextLine();
			sc.next();
			System.out.print("Quantos dependentes: ");
			dep[i] = sc.nextInt();
			System.out.print("Renda mensal: ");
			renda[i] = sc.nextDouble();
		}
		
		for(int i=0;i<2;i++) {
			desc[i] = renda[i] - renda[i] * (dep[i] * 5 / 100);
			if(desc[i] <= salmin*2) {
				System.out.println("Contribuinte: " + cpf[i] + " isento");
			} else if(desc[i] > salmin*2 && desc[i] <= salmin*3) {
				vPagar[i] = desc[i] * 0.05;
				System.out.println("Contribuinte: " + cpf[i] + "valor a pagar: " + vPagar[i]);
			} else if(desc[i] > salmin*3 && desc[i] <= salmin*5) {
				vPagar[i] = desc[i] * 0.1;
				System.out.println("Contribuinte: " + cpf[i] + "valor a pagar: " + vPagar[i]);
			} else if(desc[i] > salmin*5 && desc[i] <= salmin*7) {
				vPagar[i] = desc[i] * 0.15;
				System.out.println("Contribuinte: " + cpf[i] + "valor a pagar: " + vPagar[i]);
			} else if(desc[i] > salmin*7) {
				vPagar[i] = desc[i] * 0.2;
				System.out.println("Contribuinte: " + cpf[i] + "valor a pagar: " + vPagar[i]);
			}
		}
		
		sc.close();
		
	}
	
	public static void main(String[] args) {
		calcImposto();
	}

}
