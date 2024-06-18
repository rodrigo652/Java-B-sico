package exerciciosAlgoritmo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

    private static void opiniao() {

        Scanner sc = new Scanner(System.in);

        int qtdo = 0, qtdb = 0, qtdc = 0, qtdd = 0, qtde = 0;
        int maxIdadeOtimo = 0, maxIdadeRuim = 0, maxIdadePessimo = 0;
        double total = 100.0;

        ArrayList<Integer> idadesRuim = new ArrayList<>();
        ArrayList<Integer> idadesOtimo = new ArrayList<>();
        ArrayList<Integer> idadesPessimo = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite sua idade: ");
            int id = sc.nextInt();

            System.out.print("Digite sua opinião (a, b, c, d, e): ");
            char o = sc.next().charAt(0);

            Notas nota = Notas.valueOfCodigo(o);

            if (nota == Notas.OTIMO) {
                qtdo++;
                idadesOtimo.add(id);
                maxIdadeOtimo = Math.max(maxIdadeOtimo, id);
            } else if (nota == Notas.BOM) {
                qtdb++;
            } else if (nota == Notas.REGULAR) {
                qtdc++;
            } else if (nota == Notas.RUIM) {
                qtdd++;
                idadesRuim.add(id);
                maxIdadeRuim = Math.max(maxIdadeRuim, id);
            } else if (nota == Notas.PESSIMO) {
                qtde++;
                idadesPessimo.add(id);
                maxIdadePessimo = Math.max(maxIdadePessimo, id);
            }
        }

        double pb = (qtdb / total) * 100;
        double pr = (qtdc / total) * 100;
        double prr = (qtdd > 0) ? idadesRuim.stream().mapToInt(Integer::intValue).average().orElse(0.0) : 0;
        double pp = (qtde / total) * 100;
        int idadeDiferencaOtimoRuim = Math.abs(maxIdadeOtimo - maxIdadeRuim);

        System.out.println("A quantidade de respostas Ótimas: " + qtdo);
        System.out.printf("A diferença porcentual entre respostas Bom e Regular: %.2f%%\n", pr - pb);
        System.out.printf("A média de idade das pessoas que responderam Ruim: %.2f\n", prr);
        System.out.printf("A porcentagem de respostas Péssimo: %.2f%% e a maior idade que utilizou essa opção: %d\n", pp, maxIdadePessimo);
        System.out.printf("A diferença de idade entre a maior idade que respondeu Ótimo e a maior idade que respondeu Ruim: %d\n", idadeDiferencaOtimoRuim);

        sc.close();
    }

    public static void main(String[] args) {
        opiniao();
    }
}
