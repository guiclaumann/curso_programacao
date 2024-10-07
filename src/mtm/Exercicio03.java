package mtm;

import java.util.Scanner;

public class Exercicio03 {

	// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
	// valor da área deste círculo com quatro
	// casas decimais conforme exemplos.
	// Fórmula da área: area = π . raio2
	// Considere o valor de π = 3.14159

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double pi = 3.14159, r, a;

		System.out.println("digite o Raio:");
		r = sc.nextDouble();

		a = pi * r * r;

		System.out.printf("A= %.4f%n ", a);

		sc.close();
	}
}
