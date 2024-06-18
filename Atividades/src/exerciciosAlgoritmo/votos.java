package exerciciosAlgoritmo;

import java.util.Scanner;

public class votos {
	
	 static String classe(int idade) {
		 
		String clas="";
		
		if(idade < 16) {
			clas = "Não votante";
		} else if (idade >= 16 && idade <= 18) {
			clas = "Voto opcional";
		} else if (idade > 18 && idade <= 64) {
			clas = "Eleitor obrigatório";
		} else if (idade > 65) {
			clas = "Eleitor facultativo";
		}
		
		return clas;
	}
	
	public static void executarPrograma() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		String classificacao = classe(idade);
		
		System.out.println(classificacao);
		
		sc.close();
	}
	
}
