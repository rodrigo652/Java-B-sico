package exerciciosAlgoritmo;

import java.util.Scanner;

public class comerciante {
	
    public static void executarPrograma() {
        Scanner sc = new Scanner(System.in);
        
        double valor = sc.nextDouble();
        
        System.out.println("Valor final: " + calc(valor));
        System.out.println("Valor do prejuizo: " + calc(valor)*0.1);
        
        sc.close();
    }
    
    private static double calc(double valor) {
    	double vt = valor + (valor*0.1);
    	return vt;
    	
    }

}
