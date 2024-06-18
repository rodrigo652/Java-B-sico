package application;

import entities.enums.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        double percentage;

        System.out.println("Name: ");
        funcionario.name = sc.nextLine();
        System.out.println("Gross salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: "+ funcionario);
        System.out.println("Which percentage to increase salary: ");
        percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: "+funcionario);
        sc.close();

    }
}
