import java.util.Scanner;
	/*
	 * 4) Em linguagem de programa��o Java, implemente um algoritmo que retorne o valor da
	fun��o abaixo ap�s receber um valor qualquer de entrada:
	
	 */
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o valor de A:");
        double a = sc.nextDouble();
        System.out.println("Escreva o valor de B:");
        double b = sc.nextDouble();
        System.out.print("Escreva o valor de C:");
        double c = sc.nextDouble();
        if (a == 0 | b == 0){
            System.out.println("Numeros informados incorretamente");
        } else if ( (a != 0) & (b!= 0) & (c == 0)){
            System.out.println("Igualdade confirmada 0 = 0");
        } else if (a == 0 | b != 0){
            System.out.println("Esta � uma equa��o de primeiro grau");
        }
      double delta = ((b * b) - (4 * a * c));
       double x1 = 0;
      double x2 = 0;
        if (delta > 0) {
            System.out.println("Essa equa��o possui duas raizes reais diferentes");
           x1 = ((-b + (Math.sqrt(delta))) / (2 * a));
           x2 = ((-b + (Math.sqrt(delta))) / (2 * a));
            System.out.printf("x1 vale: " + x1);
            System.out.println("");
            System.out.printf("x2 vale: " + x2);
            System.out.println("");
        } else if (delta < 0){
            System.out.println("Essa equa��o n�o possui raizes reais");
        } else if (delta == 0){
            System.out.println("Essa equa��o possui duas raizes reais iguais");
        }
        sc.close();
    }

	}

