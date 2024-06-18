package exerciciosAlgoritmo3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Elevador {
    A, B, C
}

enum Periodo {
    M, V, N
}

public class Predio {
    public static void calc() {
        Scanner sc = new Scanner(System.in);

       
        List<Integer> usoElevador = new ArrayList<>();
        List<Integer> usoPeriodo = new ArrayList<>();

        
        for (int i = 0; i < Elevador.values().length; i++) {
            usoElevador.add(0);
        }
        for (int i = 0; i < Periodo.values().length; i++) {
            usoPeriodo.add(0);
        }

        
        int[][] matrizUso = new int[Elevador.values().length][Periodo.values().length];
        int totalUso = 0;

        
        System.out.print("Digite o número de usuários: ");
        int usuarios = sc.nextInt();
        for (int i = 0; i < usuarios; i++) {
            System.out.print("Digite o elevador utilizado (A/B/C): ");
            char elevadorChar = sc.next().toUpperCase().charAt(0);
            System.out.print("Digite o período de uso (M/V/N): ");
            char periodoChar = sc.next().toUpperCase().charAt(0);

            Elevador elevador = Elevador.valueOf(String.valueOf(elevadorChar));
            Periodo periodo = Periodo.valueOf(String.valueOf(periodoChar));

            int elevadorIndex = elevador.ordinal();
            int periodoIndex = periodo.ordinal();

            matrizUso[elevadorIndex][periodoIndex]++;
            usoElevador.set(elevadorIndex, usoElevador.get(elevadorIndex) + 1);
            usoPeriodo.set(periodoIndex, usoPeriodo.get(periodoIndex) + 1);
            totalUso++;
        }

        
        int elevadorMaisFrequente = 0, periodoMaisFrequente = 0;
        for (int i = 1; i < usoElevador.size(); i++) {
            if (usoElevador.get(i) > usoElevador.get(elevadorMaisFrequente)) {
                elevadorMaisFrequente = i;
            }
        }
        for (int i = 1; i < usoPeriodo.size(); i++) {
            if (usoPeriodo.get(i) > usoPeriodo.get(periodoMaisFrequente)) {
                periodoMaisFrequente = i;
            }
        }


        int periodoMaisUsadoParaElevadorMaisFrequente = 0;
        for (int j = 1; j < Periodo.values().length; j++) {
            if (matrizUso[elevadorMaisFrequente][j] > matrizUso[elevadorMaisFrequente][periodoMaisUsadoParaElevadorMaisFrequente]) {
                periodoMaisUsadoParaElevadorMaisFrequente = j;
            }
        }

        int usoMinimoPeriodo = usoPeriodo.get(0);
        for (int uso : usoPeriodo) {
            if (uso < usoMinimoPeriodo) {
                usoMinimoPeriodo = uso;
            }
        }
        double diferencaPercentual = ((double) usoPeriodo.get(periodoMaisFrequente) - usoMinimoPeriodo) / totalUso * 100;

        
        List<Integer> usoElevadorOrdenado = new ArrayList<>(usoElevador);
        usoElevadorOrdenado.sort(Integer::compareTo);
        int usoMedio = usoElevadorOrdenado.get(1); // O valor do meio na lista ordenada
        int elevadorMedio = usoElevador.indexOf(usoMedio);
        double percentualUsoMedio = (double) usoElevador.get(elevadorMedio) / totalUso * 100;
        
        
        sc.close();
        
        System.out.println("Elevador mais frequente: " + Elevador.values()[elevadorMaisFrequente]);
        System.out.println("Período com maior fluxo: " + Periodo.values()[periodoMaisUsadoParaElevadorMaisFrequente]);
        System.out.println("Período mais usado: " + Periodo.values()[periodoMaisFrequente] + " pelo elevador " + Elevador.values()[elevadorMaisFrequente]);
        System.out.println("Diferença percentual entre o período mais e menos usado: " + String.format("%.2f", diferencaPercentual) + "%");
        System.out.println("Percentual de uso do elevador de média utilização: " + String.format("%.2f", percentualUsoMedio) + "%");
    }
    
    public static void main(String[] args) {
    	calc();
    }
}
