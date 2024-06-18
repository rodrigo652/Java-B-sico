package application;

import entities.enums.Trasacoes;

import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Trasacoes trasacoes;


        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n): ");
        char r = sc.next().charAt(0);
        if(r == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            trasacoes = new Trasacoes(number, holder, initialDeposit);
        } else {
            trasacoes = new Trasacoes(number, holder);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(trasacoes);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        trasacoes.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(trasacoes);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        trasacoes.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(trasacoes);

        sc.close();
    }
}
