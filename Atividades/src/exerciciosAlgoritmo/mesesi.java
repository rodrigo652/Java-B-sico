package exerciciosAlgoritmo;

import java.util.Scanner;

public class mesesi {

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Digite o número do mês (1 a 12): ");
	        int numeroMes = entrada.nextInt();

	        Mes mes = Mes.fromNumero(numeroMes);

	        if (mes != null) {
	            System.out.println("O mês é: " + mes.getNome());
	        } else {
	            System.out.println("Mês inválido!");
	        }
	        
	        entrada.close();
	    }
}

