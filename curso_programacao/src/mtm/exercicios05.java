package mtm;

import java.util.Locale;
import java.util.Scanner;

public class exercicios05 {
	// Fazer um programa que leia o número de um funcionário, seu número de horas
	// trabalhadas, o valor que recebe por
	// hora e calcula o salário desse funcionário. A seguir, mostre o número e o
	// salário do funcionário, com duas casas
	// decimais.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, hora;
		double valorHora, salario;
		
		System.out.println("digite o numero do funcionario: ");
		numero = sc.nextInt();
		System.out.println("digite as horas do funcionario: ");
		hora = sc.nextInt();
		System.out.println("digite o valor da hora: ");
		valorHora = sc.nextDouble();
		
		salario = hora * valorHora;
		
		System.out.println();
		System.out.println("DADOS DO FUNCIONARIO!");
		System.out.println("Number = " + numero);
		System.out.printf("salary = U$: %.2f%n", salario);
		
		sc.close();
	}
}