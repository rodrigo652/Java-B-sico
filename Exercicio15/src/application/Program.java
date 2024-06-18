package application;

import entities.Account;
import exceptions.BusinessException;

import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta: ");
        System.out.print("Numero: ");
        int num = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double sal = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double limit = sc.nextDouble();

        Account acc = new Account(num, titular, sal, limit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double quant = sc.nextDouble();

        try {
            acc.withdraw(quant);
            System.out.println("Novo saldo: " + String.format("%.2f", acc.getBalance()));
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
