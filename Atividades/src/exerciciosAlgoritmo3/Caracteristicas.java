package exerciciosAlgoritmo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Caracteristicas {

	public static void pesquisa() {

		Scanner sc = new Scanner(System.in);

		int r = 0;

		ArrayList<Character> sexo = new ArrayList<>();
		ArrayList<Olhos> olho = new ArrayList<>();
		ArrayList<Cabelo> cabelo = new ArrayList<>();
		ArrayList<Integer> idade = new ArrayList<>();

		System.out.println("Começar a pesquisa: ");
		r = sc.nextInt();
		while (r != -1) {
			System.out.print("Sexo (M/F): ");
			char s = sc.next().charAt(0);
			sexo.add(s);
			System.out.print("Cor dos olhos (A/V/C): ");
			String ol = sc.next();
			olho.add(Olhos.valueOfCodigo(ol));
			System.out.print("Cor do cabelo (L/C/P): ");
			String cab = sc.next();
			cabelo.add(Cabelo.valueOfCodigo(cab));
			System.out.print("Idade: ");
			int i = sc.nextInt();
			idade.add(i);
			System.out.print("Deseja continuar? (Digite -1 para encerrar, qualquer outro número para continuar): ");
			r = sc.nextInt();
		}

		int max = Collections.max(idade);

		System.out.println("Maior idade dos habitantes: " + max);

		int hCount = 0, hEntre = 0, fCount = 0, fEntre = 0;

		for (int i = 0; i < sexo.size(); i++) {
			char s = sexo.get(i);
			int idades = idade.get(i);

			if (s == 'm') {
				hCount++;
				if (idades >= 18 && idades <= 35) {
					hEntre++;
				}
			} else if (s == 'f') {
				fCount++;
				if (idades >= 18 && idades <= 35) {
					fEntre++;
				}
			}
		}
		double hPorcentagem = (hCount > 0) ? ((double) hEntre / hCount) * 100 : 0;
		double fPorcentagem = (fCount > 0) ? ((double) fEntre / fCount) * 100 : 0;

		System.out.println("Porcentagem de indivíduos do sexo masculino cuja idade está entre 18 e 35 anos: "
				+ hPorcentagem + "%");
		System.out.println("Porcentagem do total de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos: "
				+ fPorcentagem + "%");

		sc.close();
	}
	
	public static void main(String[] args) {
		pesquisa();
	}
}
