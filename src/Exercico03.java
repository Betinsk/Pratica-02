import java.util.Locale;
import java.util.Scanner;
	/*
	 * 3) Em linguagem de programação Java, escreva um algoritmo que determine a situação de
	peso de um indivíduo determinada através do IMC (Índice de Massa Corpórea). O IMC é
	definido como a relação entre o peso (em kg) e o quadrado da Altura (em m) do
	indivíduo: IMC = PESO / ALTURA2
	. A situação do peso é indicada na tabela ao lado:
	Condição Situação
	IMC abaixo de 20 Abaixo do Peso
	IMC de 20 até 25 Normal
	IMC de 25 até 30 Sobrepeso
	IMC de 30 até 40 Obesidade
	IMC acima de 40 Obesidade Mórbida
	 */

public class Exercico03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso do indivíduo: ");
		double peso = sc.nextDouble();
		System.out.println("Digite a altura do indivíduo: ");
		double altura = sc.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		if(imc <20) {
			System.out.println("Situação Abaixo do Peso");
		}
		else if (imc >=20 && imc <25) {
			System.out.println("Situação Normal");
		}
		
		else if (imc >=25 && imc <30) {
			System.out.println("Situação Sobrepeso");
		}
		
		else if (imc >=30 && imc <40) {
			System.out.println("Situação Obesidade");
		}
		
		else {
			System.out.println("Obesidade Mórbida");
		}
		
		sc.close();

	}

}
