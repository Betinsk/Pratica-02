import java.util.Locale;
import java.util.Scanner;

	/* 1) Em linguagem de programa��o Java, escreva um algoritmo que leia os tr�s lados de um
	tri�ngulo e imprima o tipo de tri�ngulo:
	a. Equil�tero: os tr�s lados s�o iguais.
	b. Is�sceles: 2 lados s�o iguais.
	c. Escaleno: 3 lados diferentes
	*/

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os tr�s lados do triangulo: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x == z && y == z) {
			System.out.println("Triangulo Equil�tero");
		}
		else if (x == z || x == y) {
			System.out.println("Triangulo Is�sceles");
		}
		else {
			System.out.println("Triangulo Escaleno");
		}
		sc.close();
	}

}
