import java.util.Scanner;

	/*
	 * 7) Em linguagem de programa��o Java, escreva um algoritmo que informe o pre�o dos
	produtos de uma loja, conforme indicado na tabela abaixo. O algoritmo deve receber o
	c�digo do produto como entrada
	 */
public class Exercicio07 {

	public static void main(String[] args) {

	        Scanner sc =new Scanner(System.in);
	         System.out.println("digite o c�digo do produto");
	       int cod = sc.nextInt();
	        
	        switch(cod) {
	        case 1: System.out.println("Sapato: R$ 99,99");
	        break;
	        case 2: System.out.println("Bolsa R$ 103,89");
	        break;
	        case 3: System.out.println("Camisa R$ 49,98");
	        break;
	        case 4: System.out.println("Cal�a R$ 89,72");
	        break;
	        case 5: System.out.println("Blusa R$ 97,35");
	        break;
	        default: System.out.println("produto inexistente");
	        }
	            
	        sc.close(); 
	    }
	  
	}
