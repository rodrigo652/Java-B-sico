package exerciciosAlgoritmo;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class aniversario {

    public static void calcularIdade() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua data de nascimento (dia/mês/ano):");
        int diaNascimento = scanner.nextInt();
        int mesNascimento = scanner.nextInt();
        int anoNascimento = scanner.nextInt();

        // Obter data atual
        Calendar dataAtual = Calendar.getInstance();
        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
        int mesAtual = dataAtual.get(Calendar.MONTH) + 1; // Janeiro é 0 em Calendar
        int anoAtual = dataAtual.get(Calendar.YEAR);

        // Calcular idade em anos
        int idadeEmAnos = anoAtual - anoNascimento;

        // Calcular meses restantes do ano atual em relação à data de nascimento
        int mesesRestantesAnoAtual = 12 - mesNascimento;
        if (diaAtual < diaNascimento) {
            mesesRestantesAnoAtual--;
        }

        // Calcular meses completos de idade
        int mesesCompletosIdade = idadeEmAnos * 12 + mesesRestantesAnoAtual;

        // Calcular dias restantes do mês atual em relação à data de nascimento
        int diasRestantesMesAtual = diaAtual - diaNascimento;
        if (diasRestantesMesAtual < 0) {
            diasRestantesMesAtual = 30 + diasRestantesMesAtual;
            mesesCompletosIdade--;
        }

        int diasCompletosIdade = mesesCompletosIdade * 30 + diasRestantesMesAtual;

        System.out.println("Sua idade em anos: " + idadeEmAnos);
        System.out.println("Sua idade em meses: " + mesesCompletosIdade);
        System.out.println("Sua idade em dias: " + diasCompletosIdade);
    }
}


