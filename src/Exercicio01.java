import java.util.Locale;
import java.util.Scanner;

	/* 1) Em linguagem de programação Java, escreva um algoritmo que leia os três lados de um
	triângulo e imprima o tipo de triângulo:
	a. Equilátero: os três lados são iguais.
	b. Isósceles: 2 lados são iguais.
	c. Escaleno: 3 lados diferentes
	*/

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os três lados do triangulo: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x == z && y == z) {
			System.out.println("Triangulo Equilátero");
		}
		else if (x == z || x == y) {
			System.out.println("Triangulo Isósceles");
		}
		else {
			System.out.println("Triangulo Escaleno");
		}
		sc.close();
	}

}
