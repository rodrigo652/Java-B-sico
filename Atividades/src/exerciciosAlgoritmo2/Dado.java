package exerciciosAlgoritmo2;

public class Dado {

    private static void verificarPossibilidade(int[] dados1, int[] dados2) {
        for (int i = 0; i < dados1.length; i++) {
            for (int j = 0; j < dados2.length; j++) {
                int soma = dados1[i] + dados2[j];
                if (soma == 7) {
                    System.out.println(dados1[i] + "+" + dados2[j] + " = " + soma);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] dados1 = {1, 2, 3, 4, 5, 6};
        int[] dados2 = {1, 2, 3, 4, 5, 6};

        verificarPossibilidade(dados1, dados2);
    }
}