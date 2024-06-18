package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeCliente;
        double saldo, saque, limite, limitec;
        int operacoes = 0, idade;
        char sexo;

        System.out.print("Informe seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.print("Informe sua idade: ");
        idade = sc.nextInt();
        System.out.print("Informe seu sexo: ");
        sexo = sc.next().charAt(0);
        System.out.print("Informe seu saldo atual: ");
        saldo = sc.nextDouble();

        System.out.println();

        String menu = """
                Operações:
                1 - Consultar atual
                2 - Limite de credito
                3 - Taxas a serem pagas
                4 - Valor permitido para o saque diario
                5 - Informações do cliente
                6 - Sair

                Digite a opção desejada:  """;
        	
        while(operacoes != 6) {
            System.out.println(menu);
            operacoes = sc.nextInt();
            switch (operacoes) {
            case 1: {
            	System.out.println();
                System.out.println(String.format("O seu saldo atual é de R$%.2f", saldo));
                System.out.println();
                break;
            }
            case 2: {
            	System.out.println();
            	limitec = saldo + (saldo*0.45);
                System.out.print(String.format("Limite de credito: R$%.2f", limitec));
                System.out.println();
                break;
            }
            case 3: {
            	System.out.println();
            	System.out.println("Nossa taxa para saque é de 5%");
                System.out.println();
                break;
            }
            case 4: {
            	System.out.println();
            	System.out.print("Informe o valor para saque: ");
            	saque = sc.nextDouble();
            	limite = saldo*0.85;
            	if(saque > limite) {
            		System.out.println("Valor de saque nao permitido");
            	} else {
            		saldo = saldo - saque;
            		System.out.println("Saque Realizado");
            		System.out.print(String.format("Saldo atualizado: R$%.2f", saldo));
            	}
            	System.out.println();
            	break;
            }
            case 5: {
            	System.out.println();
            	System.out.println("Informações do cliente: ");
            	System.out.println("Nome: " + nomeCliente);
            	System.out.println("Idade: " + idade);
            	if(sexo == 'M') {
            		System.out.println("Sexo Masculino");
            	} else {
            		System.out.println("Sexo Feminino");
            	}
            	System.out.println();
            	break;
            }
            case 6: {
            	System.out.println("Saindo...");
            	System.exit(0);
            	
            }
            default:
                System.out.print("Operação inválida");
                System.out.println();
                break;
            }
        }
        sc.close();
    }
}
