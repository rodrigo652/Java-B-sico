package application;

import entities.enums.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered: ");
        int n = sc.nextInt();

        List<Employees> list = new ArrayList<>();

        for(int i=0;i<n;i++) {
            System.out.println("Employee #"+(i+1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employees emp = new Employees(id, name, salary);

            list.add(emp);

        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int idEmp = sc.nextInt();
        Integer pos = position(list, idEmp);
        if(pos == null) {
            System.out.println("This id does not exist.");
        } else {
            System.out.print("Enter the percentage: ");
            double p = sc.nextDouble();
            list.get(pos).increaseSalary(p);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(Employees emp: list) {
            System.out.println(emp);
        }


        sc.close();

    }
    public static Integer position(List<Employees> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
