package exerciciosAlgoritmo;

import java.util.Scanner;

public class animal {
	
	    static void classificarAnimal(char tipoAnimal) {
	        switch (tipoAnimal) {
	            case 'M': // Mamífero
	                classificarMamifero();
	                break;
	            case 'R': // Réptil
	                classificarReptil();
	                break;
	            case 'A': // Ave
	                classificarAve();
	                break;
	            default:
	                System.out.println("Tipo de animal inválido.");
	        }
	    }

	    private static void classificarMamifero() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("É quadrúpede? (s/n): ");
	        char quadrupede = sc.next().charAt(0);

	        if (quadrupede == 's') {
	            System.out.print("É carnívoro? (s/n): ");
	            char carnivoro = sc.next().charAt(0);

	            if (carnivoro == 's') {
	                System.out.println("O animal escolhido foi o leão!");
	            } else {
	                System.out.println("O animal escolhido foi o cavalo!");
	            }
	        } 
	        else if (quadrupede == 'n'){
	        	System.out.print("É bípede? (s/n): ");
	        	char bipede = sc.next().charAt(0);
	            if (bipede == 's') {
	            	System.out.print("É onívoro? (s/n): ");
	            	
	            	char onivoro = sc.next().charAt(0);
	            	if(onivoro == 's') {
	            		 System.out.println("O animal escolhido foi o homem!");
	            	} else {
	            		System.out.println("O animal escolhido foi o macaco!");
	            	}
	            }
	        } else {
	        	System.out.println("É voador? (s/n)");
	        	char voador = sc.next().charAt(0);
	        	if(voador == 's') {
	        		System.out.println("O animal escolhido foi o morcego");
	        	} else {
	        		System.out.println("O animal escolhido foi a baleia");
	        	}
	        }
	    }
	    private static void classificarReptil() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("É com casco? (s/n): ");
	        char casco = sc.next().charAt(0);
	        
	        if(casco == 's') {
	        	System.out.println("O animal escolhido foi a tartaruga");
	        } else if (casco == 'n') {
	        	System.out.print("É carnivoro? (s/n): ");
	        	char carnivoro = sc.next().charAt(0);
	        	if(carnivoro == 's') {
	        		System.out.println("O animal escolhido foi o crocodilo");
	        	} else if(carnivoro == 'n') {
	        		System.out.print("É sem patas? (s/n): ");
	     	        char patas = sc.next().charAt(0);
	    	        if(patas == 's') {
	    	        	System.out.println("O animal escolhido foi a cobra");
	    	        }
	        	}
	        }
	    }
	    
	    private static void classificarAve() {
	    	
	    	Scanner sc = new Scanner(System.in);

	        System.out.print("É não voador? (s/n): ");
	        char nvoador = sc.next().charAt(0);
	        
	        if (nvoador == 's') {
	            System.out.print("É tropical? (s/n): ");
	            char tropical = sc.next().charAt(0);

	            if (tropical == 's') {
	                System.out.println("O animal escolhido foi o avestruz!");
	            } else {
	                System.out.println("O animal escolhido foi o pinguim!");
	            }
	        } else if (nvoador == 'n') {
	        	System.out.print("É não nadador? (s/n): ");
		        char nadador = sc.next().charAt(0);
		        
		        if(nadador == 's') {
		        	System.out.println("O animal escolhido foi o pato!");
		        } else {
		        	System.out.println("O animal escolhido foi a águia!");
		        }
	        }
	    }
	        
	    public static void executarPrograma() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o tipo de animal (M/R/A): ");
	        char tipoAnimal = sc.next().charAt(0);

	        classificarAnimal(tipoAnimal);
	    }
}
