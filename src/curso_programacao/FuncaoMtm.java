package curso_programacao;

public class FuncaoMtm {
	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		System.out.println("Raiz quadra:");

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Rais quadrada de " + y + " = " + B);
		System.out.printf("Raiz quadrada de 25 = " + C + "%n" + "%n");

		System.out.println("Potencia:");

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.printf("5 elevado ao quadrado = " + C + "%n" + "%n");

		System.out.println("Absoluto:");

		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("valor absoluto de " + y + " = " + A);
		System.out.println("valor absoluto de " + z + " = " + B);

	}
}