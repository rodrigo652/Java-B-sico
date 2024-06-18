package exerciciosAlgoritmo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pesquisa {
    
    private static void dados() {
        
        Scanner sc = new Scanner(System.in);
        
        int p = 0, pMasc = 0, pFemn = 0, soma = 0;
        
        ArrayList<Character> sexo = new ArrayList<>();
        ArrayList<Integer> dias = new ArrayList<>();
        
        System.out.print("Digite o número de crianças nascidas nesse período: ");
        int n = sc.nextInt();
        
        while (true) {
            System.out.print("Digite o sexo da crianca (ou 'x' para sair): ");
            char r = sc.next().charAt(0);
            if (r == 'x') {
                break;
            }
            System.out.print("Digite o número de dias que este foi mantido na incubadora: ");
            int d = sc.nextInt();
            
            sexo.add(r);
            dias.add(d);
            
            if (r == 'f') {
                pFemn++;
            } else if (r == 'm') {
                pMasc++;
            }
            soma += d;
            p++;
        }
        
        double porcentagem = (double) p / n * 100;
        double pMen = (double) pMasc / p * 100;
        double pFem = (double) pFemn / p * 100;
        
        double media = (double) soma / dias.size();
        int max = Collections.max(dias);
        
        System.out.println("A porcentagem de recém-nascidos prematuros: " + porcentagem + "%");
        System.out.println("A porcentagem de recém-nascidos meninos do total de prematuros: " + pMen + "%");
        System.out.println("A porcentagem de recém-nascidos meninas do total de prematuros: " + pFem + "%");
        System.out.println("A média de dias de permanência dos recém-nascidos prematuros na incubadora: " + media);
        System.out.println("O maior número de dias que um recém-nascido prematuro permaneceu na incubadora: " + max);
        
        sc.close();
    }
    
    public static void main(String[] args) {
        dados();
    }
}





