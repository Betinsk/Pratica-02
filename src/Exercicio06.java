import java.util.Scanner;
/*
 * 6) Em linguagem de programação Java, implemente um algoritmo que resolva uma
equação de segundo grau, realizando consistências dos valores dos coeficientes (“a”, “b”
e “c”) e do discriminante (delta), conforme descrito abaixo.
a. Se os coeficientes “a” e “b” forem iguais a zero e o coeficiente “c” for
diferente de zero, apresentar a mensagem “Coeficientes informados
incorretamente”. Se o coeficiente “c” for zero, apresentar a mensagem
"Igualdade confirmada: 0 = 0".
b. Caso o coeficiente “a” seja igual a zero e o coeficiente “b” for diferente de
zero, deverá ser impressa a mensagem: “Esta é uma equação de primeiro
grau” e deverá ser apresentado o valor da raiz real da equação.
c. Caso o discriminante seja negativo, deverá ser impressa a mensagem: “Esta
equação não possui raízes reais”.
d. Caso o discriminante seja zero, apresentar a mensagem “Esta equação possui
duas raízes reais iguais”. Em seguida, apresentar o valor das raízes da
equação.
e. Caso o discriminante seja maior que zero, apresentar a mensagem “Esta
equação possui duas raízes reais diferentes”. Em seguida, apresentar o valor
das raízes da equação.
 Equação do segundo grau: ax2 + bx + c = 0
 Discriminante:  = b2 – 4ac
 */
public class Exercicio06 {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				double a, b, c, r, r2, delta;

				System.out.println("Insira o valor de a ");
				a = sc.nextDouble();

				System.out.println("Insira o valor de b ");
				b = sc.nextDouble();

				System.out.println("Insira o valor de c ");
				c = sc.nextDouble();

				delta = Math.pow(b, 2) - 4 * a * c;

				if ((a == 0 && b == 0) && (c != 0)) {
					System.out.println("Coeficientes informados incorretamente");

				} else if (c == 0) {
					System.out.println("Igualdade confirmada: 0 = 0 ");
				}

				if (a == 0 && b != 0) {
					System.out.println("Esta é uma equação do primeiro grau ");
					r = -c / b;
					System.out.println("A raíz da equação de primeiro grau é r = " + r);
					System.exit(0);
				}

				if (delta < 0) {
					System.out.println("Esta equação não possui raízes reais");
				} else if (delta > 0) {
					System.out.println("Esta equação possui duas raizes reais diferentes");
					r = ((-b + Math.sqrt(delta)) / (2 * a));
					r2 = ((-b - Math.sqrt(delta)) / (2 * a));

					System.out.println("Primeira raiz da equação de segundo grau e r = " + r);
					System.out.println("Primeira raiz da equação de segundo grau e r2 = " + r2);
				} else if (delta == 0) {
					System.out.println("Esta equação possui duas raizes reais iguais");
					r = ((-b + Math.sqrt(delta)) / (2 * a));
					r2 = ((-b - Math.sqrt(delta)) / (2 * a));

					System.out.println("Primeira raiz da equação de segundo grau e r = " + r);
					System.out.println("Primeira raiz da equação de segundo grau e r2 = " + r2);
				}
			}
		}

