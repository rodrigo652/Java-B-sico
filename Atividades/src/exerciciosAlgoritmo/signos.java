package exerciciosAlgoritmo;

import java.util.Scanner;

class signos { 
	
	static void zodiac_sign(int dia, int mes) 
	{ 
		String sign=""; 
		
		if (mes == 12){ 
			
			if (dia < 22) 
			sign = "Sagitário"; 
			else
			sign ="Capricórnio"; 
		} 
			
		else if (mes == 1){ 
			if (dia < 20) 
			sign = "Capricórnio"; 
			else
			sign = "Aquário"; 
		} 
			
		else if (mes == 2){ 
			if (dia < 19) 
			sign = "Aquário"; 
			else
			sign = "Peixes"; 
		} 
			
		else if(mes == 3){ 
			if (dia < 21) 
			sign = "Peixes"; 
			else
			sign = "Áries"; 
		} 
		else if (mes == 4){ 
			if (dia < 20) 
			sign = "Áries"; 
			else
			sign = "Touro"; 
		} 
			
		else if (mes == 5){ 
			if (dia < 21) 
			sign = "Touro"; 
			else
			sign = "Gêmeos"; 
		} 
			
		else if( mes == 6){ 
			if (dia < 21) 
			sign = "Gêmeos"; 
			else
			sign = "Câncer"; 
		} 
			
		else if (mes == 7){ 
			if (dia < 23) 
			sign = "Câncer"; 
			else
			sign = "Leão"; 
		} 
			
		else if(mes == 8){ 
			if (dia < 23) 
			sign = "Leão"; 
			else
			sign = "Virgem"; 
		} 
			
		else if (mes == 9){ 
			if (dia < 23) 
			sign = "Virgem"; 
			else
			sign = "Libra"; 
		} 
			
		else if (mes == 10){ 
			if (dia < 23) 
			sign = "Libra"; 
			else
			sign = "Escorpião"; 
		} 
			
		else if (mes == 11){ 
			if (dia < 22) 
			sign = "Escorpião"; 
			else
			sign = "Sagitário"; 
		} 
			
		System.out.println("Seu signo é " + sign); 
	} 
		

	public static void executarPrograma() { 
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Qual dia do seu nascimento: ");
		int dia = sc.nextInt(); 
		System.out.print("Qual o mes do seu nascimento: ");
		int mes = sc.nextInt();
		System.out.println();
		zodiac_sign(dia, mes); 
		
		sc.close();
			
	} 
} 
