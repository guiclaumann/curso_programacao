package mtm;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	// 01: Fazer um programa para ler as medidas de largura e comprimento de um
	// terreno retangular com uma casa decimais
	// Em seguinda, o programa deve mostrar o valor de área do terreno, bem como o
	// valor de preço do terreno,
	// ambos com duas casa decimas, conforme exemplo.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double l = sc.nextDouble();
		double h = sc.nextDouble();
		double metroQ = sc.nextDouble();

		double area = l * h;
		double preco = area * metroQ;

		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);

		sc.close();
	}
}
