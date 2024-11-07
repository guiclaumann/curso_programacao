package estruturas_condicionamento;

import java.util.Scanner;

public class exercicios {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		
		while (continuar) {
			System.out.println("Digite um Numero para verificar se ele é positivo ou negativo: ");
			int n = sc.nextInt();
			
		if(n < 0) {
			System.out.println("negativo");
		}
		else {
			System.out.println("positivo");
		}
		
		
		System.out.print("Deseja reiniciar o programa? (s/n): ");
        String resposta = sc.next();
		
        if (resposta.equalsIgnoreCase("n")) {
             continuar = false;
         	}
		}
		
		sc.close();
		System.out.println("Programa encerrado");
	}
}
