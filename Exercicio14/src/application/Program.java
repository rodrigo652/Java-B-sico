package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Pessoa> list = new ArrayList<Pessoa>();

        System.out.print("Entre com o numero de contribuintes: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println("Contribuinte #" + i + ": ");
            System.out.print("Pessoa fisica ou juridica (f/j): ");
            char ch = sc.next().charAt(0);
            if(ch == 'f') {
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda anual: ");
                double renda = sc.nextDouble();
                System.out.print("Gastos de saude: ");
                double gastos = sc.nextDouble();
                list.add( new PessoaFisica(nome, renda, gastos));
            } else if (ch == 'j') {
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda anual: ");
                double renda = sc.nextDouble();
                System.out.print("Numero de funcionarios: ");
                int func = sc.nextInt();
                list.add(new PessoaJuridica(nome, renda, func));

            }
        }
        double soma = 0.0;
        System.out.println();
        System.out.println("IMPOSTOS PAGO: ");
        for(Pessoa p : list) {
            soma += p.imposto();
            System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.imposto()));
        }
        System.out.println();
        System.out.println("IMPOSTO TOTAL: $ " + soma);
        sc.close();
    }
}
