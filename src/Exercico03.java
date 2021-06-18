import java.util.Locale;
import java.util.Scanner;
	/*
	 * 3) Em linguagem de programa��o Java, escreva um algoritmo que determine a situa��o de
	peso de um indiv�duo determinada atrav�s do IMC (�ndice de Massa Corp�rea). O IMC �
	definido como a rela��o entre o peso (em kg) e o quadrado da Altura (em m) do
	indiv�duo: IMC = PESO / ALTURA2
	. A situa��o do peso � indicada na tabela ao lado:
	Condi��o Situa��o
	IMC abaixo de 20 Abaixo do Peso
	IMC de 20 at� 25 Normal
	IMC de 25 at� 30 Sobrepeso
	IMC de 30 at� 40 Obesidade
	IMC acima de 40 Obesidade M�rbida
	 */

public class Exercico03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso do indiv�duo: ");
		double peso = sc.nextDouble();
		System.out.println("Digite a altura do indiv�duo: ");
		double altura = sc.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		if(imc <20) {
			System.out.println("Situa��o Abaixo do Peso");
		}
		else if (imc >=20 && imc <25) {
			System.out.println("Situa��o Normal");
		}
		
		else if (imc >=25 && imc <30) {
			System.out.println("Situa��o Sobrepeso");
		}
		
		else if (imc >=30 && imc <40) {
			System.out.println("Situa��o Obesidade");
		}
		
		else {
			System.out.println("Obesidade M�rbida");
		}
		
		sc.close();

	}

}
