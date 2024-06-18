package application;

import entities.enums.Area;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Area area = new Area();

        System.out.println("Enter rectangle width and height");
        area.largura = sc.nextDouble();
        area.altura = sc.nextDouble();

        System.out.println("Area = " + String.format("%.2f",area.area()));
        System.out.println("Perimeter = " + String.format("%.2f", area.perimeter()));
        System.out.println("Diagonal = " + String.format("%.2f", area.diagonal()));
    }

}
