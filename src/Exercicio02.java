import java.util.Locale;
import java.util.Scanner;
	/* 
	 * 2) Em linguagem de programação Java, escreva um algoritmo que receba 3 notas no
	intervalo [0, 10] de um aluno, calcule e apresente uma mensagem de acordo com sua
	média:
	MÉDIA MENSAGEM
	>= 0 e < 3 REPROVADO
	>= 3 e < 7 EXAME
	>= 7 e <= 10 APROVADO
	 */
public class Exercicio02 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite três notas de um aluno no intervalo [0, 10]: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			int media = x + y + z / 3;
			
			System.out.println("Media: "+ media);
			System.out.println();
			
			if(media >=0 && media < 3) {
				System.out.println("REPROVADO");
			}
			else if (media >=3  && media <7) {
				System.out.println("EXAME");
			}
			else {
				System.out.println("APROVADO");
			}
			sc.close();

	}

}
