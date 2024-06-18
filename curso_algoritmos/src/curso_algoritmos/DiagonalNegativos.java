package curso_algoritmos;

import java.util.Scanner;

public class DiagonalNegativos {

	public static void main(String[] args) {
		
		int n, soma=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz: ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		int[] vet = new int[n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				System.out.print("Elemento [" + i+ "," +j+ "]: ");
				mat[i][j] = sc.nextInt(); 
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				if(mat[i][j] < 0)
				{
					soma++;
				}
				if(i == j)
				{
					vet[i] = mat[i][j];
				}
			}
		}
		
		System.out.println("Diagonal principal: ");
		for(int i=0;i<n;i++) {
			System.out.print(vet[i] + " ");
		}
		
		System.out.println("Quantidade de negativos = " + soma);
		
		sc.close();
		
	}

}
