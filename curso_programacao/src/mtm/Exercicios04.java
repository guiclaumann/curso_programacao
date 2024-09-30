package mtm;

import java.util.Scanner;

public class Exercicios04 {

	// Fazer um programa para ler quatro valores inteiros A, B, C e D.
	// A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C
	// e D segundo a fórmula:DIFERENCA=(A*B-C*D).

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a, b, c, d, diferente;

		System.out.println("digite os valores");

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();

		diferente = a * b - c * d;

		System.out.println("Diferença: " + diferente);

		sc.close();
	}

}
