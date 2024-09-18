
package curso_programacao;

import java.util.Locale;

public class Main {

	
	public static void main(String[] args) {
		int idade = 31;
		double altura = 1.6898;
		char sexo = 'F';
		String nome = "maria";
		double renda = 4000.0;
		
			System.out.println(idade);
			System.out.printf("%.2f%n", altura);
			System.out.printf("%.4f%n", altura);
			Locale.setDefault(Locale.US);
			System.out.printf("%.4f%n", altura);
			System.out.println("resultado = " + altura + " METROS");
			System.out.printf("RESULTADO = %.2f metros%n", altura);
			System.out.printf("%s tem %d anos e ganha R$: %.2f por mês", nome, idade, renda);
			
			
	}

}