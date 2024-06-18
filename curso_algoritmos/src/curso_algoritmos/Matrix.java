package curso_algoritmos;

import java.util.Scanner;

public class Matrix {
	
	public static void main(String[] args) {
		
		int m, n, i, j;
		
		Scanner sc = new Scanner(System.in);
		
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int p = sc.nextInt();		
		
		for(i=0;i<mat.length;i++) {
			for(j=0;j<mat[i].length;j++) {
				if(mat[i][j] == p) {
					System.out.println("Position"+i+","+j+":");
					if(j>0) {
						System.out.println("Left: "+ mat[i][j-1]);
					}
					if(j<mat[i].length-1) {
						System.out.println("Right: "+ mat[i][j+1]);
					}
					if(i < mat.length-1) {
						System.out.println("Down: "+ mat[i+1][j]);
					}
					if(i > 0) {
						System.out.println("Up: "+ mat[i+1][j]);
					} 
				}
			}
		}
		sc.close();
	}

}
