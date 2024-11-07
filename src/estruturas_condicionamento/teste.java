package estruturas_condicionamento;
import java.util.Scanner;

public class teste {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        boolean continuar = true;

	        while (continuar) {
	            // Seu código principal aqui
	            System.out.println("Digite um número: ");
	            int numero = sc.nextInt();
	            System.out.println("Você digitou: " + numero);

	            // Pergunta se o usuário quer reiniciar
	            System.out.print("Deseja reiniciar o programa? (s/n): ");
	            String resposta = sc.next();

	            // Verifica se o usuário quer continuar
	            if (resposta.equalsIgnoreCase("n")) {
	                continuar = false;
	            }
	        }

	        sc.close();
	        System.out.println("Programa encerrado.");
	    }
	}