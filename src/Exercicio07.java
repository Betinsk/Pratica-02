import java.util.Scanner;

	/*
	 * 7) Em linguagem de programação Java, escreva um algoritmo que informe o preço dos
	produtos de uma loja, conforme indicado na tabela abaixo. O algoritmo deve receber o
	código do produto como entrada
	 */
public class Exercicio07 {

	public static void main(String[] args) {

	        Scanner sc =new Scanner(System.in);
	         System.out.println("digite o código do produto");
	       int cod = sc.nextInt();
	        
	        switch(cod) {
	        case 1: System.out.println("Sapato: R$ 99,99");
	        break;
	        case 2: System.out.println("Bolsa R$ 103,89");
	        break;
	        case 3: System.out.println("Camisa R$ 49,98");
	        break;
	        case 4: System.out.println("Calça R$ 89,72");
	        break;
	        case 5: System.out.println("Blusa R$ 97,35");
	        break;
	        default: System.out.println("produto inexistente");
	        }
	            
	        sc.close(); 
	    }
	  
	}
