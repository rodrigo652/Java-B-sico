package exerciciosAlgoritmo;

import java.util.Scanner;

public class olimpiada {
	
	    public static void executarPrograma() {
	        Scanner sc = new Scanner(System.in);

	        Pais pais1 = coletaDadosPais(sc, "País 1");
	        Pais pais2 = coletaDadosPais(sc, "País 2");
	        Pais pais3 = coletaDadosPais(sc, "País 3");

	        int pontuacao1 = calculaPontuacao(pais1);
	        int pontuacao2 = calculaPontuacao(pais2);
	        int pontuacao3 = calculaPontuacao(pais3);


	        exibeClassificacao(pais1, pontuacao1, pais2, pontuacao2, pais3, pontuacao3);

	        sc.close();
	    }

	    private static Pais coletaDadosPais(Scanner sc, String titulo) {
	        System.out.println("\n" + titulo + ":");
	        System.out.print("Nome: ");
	        String nome = sc.nextLine();
	        System.out.print("Ouro: ");
	        int ouro = sc.nextInt();
	        System.out.print("Prata: ");
	        int prata = sc.nextInt();
	        System.out.print("Bronze: ");
	        int bronze = sc.nextInt();
	        sc.nextLine(); 

	        return new Pais(nome, ouro, prata, bronze);
	    }

	    private static int calculaPontuacao(Pais pais) {
	        return (pais.ouro * 3) + (pais.prata * 2) + (pais.bronze * 1);
	    }

	    private static void exibeClassificacao(Pais pais1, int pontuacao1, 
	                                           Pais pais2, int pontuacao2, 
	                                           Pais pais3, int pontuacao3) {
	        System.out.println("\nClassificação Final:");
	        Pais[] paises = {pais1, pais2, pais3};
	        int[] pontuacoes = {pontuacao1, pontuacao2, pontuacao3};

	        
	        for (int i = 0; i < paises.length - 1; i++) {
	            for (int j = i + 1; j < paises.length; j++) {
	                if (pontuacoes[j] > pontuacoes[i]) {
	                    Pais tempPais = paises[i];
	                    int tempPontuacao = pontuacoes[i];

	                    paises[i] = paises[j];
	                    pontuacoes[i] = pontuacoes[j];

	                    paises[j] = tempPais;
	                    pontuacoes[j] = tempPontuacao;
	                }
	            }
	        }

	        
	        for (int i = 0; i < paises.length; i++) {
	            System.out.println((i + 1) + "º lugar: " + paises[i].nome + " (" + pontuacoes[i] + " pontos)");
	        }
	    }
	}

class Pais {
	    String nome;
	    int ouro;
	    int prata;
	    int bronze;

	    public Pais(String nome, int ouro, int prata, int bronze) {
	        this.nome = nome;
	        this.ouro = ouro;
	        this.prata = prata;
	        this.bronze = bronze;
	    }
}


