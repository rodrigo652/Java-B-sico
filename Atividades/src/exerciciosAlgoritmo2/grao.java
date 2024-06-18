package exerciciosAlgoritmo2;

import java.math.BigInteger;

public class grao {
	
	private static void grao() {
		BigInteger r = BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
		System.out.println("O número de grãos que o monge esperava receber: "+r);
		
	}
	
	public static void main(String[] args) {
		grao();
	}
}
