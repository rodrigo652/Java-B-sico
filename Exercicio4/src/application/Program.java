package application;

import entities.enums.Conversor;
import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought: ");
        double quantity = sc.nextDouble();

        double t = Conversor.currencyConverter(dollar, quantity);

        System.out.println("Amount to be paid in reais = " + String.format("%.2f", t));

        sc.close();

    }

}
