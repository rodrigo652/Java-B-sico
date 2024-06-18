package application;

import entities.enums.Estudantes;

import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudantes estudante = new Estudantes();


        estudante.name = sc.nextLine();
        estudante.grade1 = sc.nextDouble();
        estudante.grade2 = sc.nextDouble();
        estudante.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + estudante.finalGrade());
        if(estudante.finalGrade() > 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING "+ estudante.missingPoints()+" POINTS");
        }
        sc.close();


    }

}
