package exerciciosAlgoritmo;

import java.util.Scanner;

public class media {
	
    public static void executarPrograma() {
        Scanner scanner = new Scanner(System.in);
        double[] media = new double[5];
        
        for (int i=0; i<5; i++) {
        	media[i] = scanner.nextDouble();
        }
        
        System.out.println("Media: " + calc(media));
        
        scanner.close();
    }
	
	private static double calc(double[] media) {
		double res=0;
		int p=1;
		for(int i=0;i<5;i++) {
			res = res + p * media[i];
			p++;
		}
		return res/15;
	}

}
