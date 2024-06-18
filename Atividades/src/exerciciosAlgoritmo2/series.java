package exerciciosAlgoritmo2;

public class series {
	
	private static void h() {
		double h=0.0;
		int a=1;
		
		for(int i=1;i<=50;i++) {
			h += (double)a/i;
			System.out.println(a + "/" + i);
			a += 2;
		}
		
		System.out.println("H = " + String.format("%.2f", h));
	}
	
	private static void s() {
		double s=0.0;
		int troca=1;
		
		for(int i=1;i<=10;i++) {
			s += troca * (double) i/(i*i);
			troca *= -1;
		}
		System.out.println("S = " + String.format("%.2f", s));
		
	}
	
	private static void t() {
        double t = 0.0;
        int numerator;
        int denominator = 500;
        boolean isPositive = true;

        for (int i = 1; i <= 10; i++) {
            if (isPositive) {
                numerator = 2;
            } else {
                numerator = 5;
            }

            if (isPositive) {
                t += (double) numerator / denominator;
            } else {
                t -= (double) numerator / denominator;
            }

            isPositive = !isPositive;

            // Decrementa o denominador a cada dois termos
            if (i % 2 == 0) {
                denominator -= 50;
            }
        }

        System.out.println("T = " + String.format("%.2f", t));

	}
	
	public static void main(String[] args) {
		h();
		s();
		t();
	}
	


	    
	

	
	
}
