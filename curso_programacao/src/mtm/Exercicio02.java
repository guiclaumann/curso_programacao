package mtm;

import java.util.Scanner;

public class Exercicio02 {

	// 02: Faça um programa para ler dois valores inteiros,
	// e depois mostrar na tela a soma desses
	// números com uma mensagem explicativa, conforme exemplos.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, soma;
		
		System.out.println("Digite 2 valores");
		a = sc.nextInt();
		b = sc.nextInt();

		soma = a + b;

		System.out.println("soma = " + soma);

		sc.close();
	}

}
