package exerciciosAlgoritmo;

import java.util.Scanner;

public class raizQuadrada {

    public static void executarPrograma() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int raizAproximada = calcularRaizQuadradaAproximada(numero);

        System.out.println("O inteiro mais próximo da raiz quadrada de " + numero + " é " + raizAproximada);

        scanner.close();
    }

    private static int calcularRaizQuadradaAproximada(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número não deve ser negativo.");
        }

        double raizExata = Math.sqrt(numero);

        int raizAproximada = (int) Math.round(raizExata);

        return raizAproximada;
    }
}