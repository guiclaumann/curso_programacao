package curso_programacao;

public class Fixacao {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double prince1 = 2100.0;
		double prince2 = 650.50;
		double measure = 53.234567;

		System.out.printf("%s, whitch prince is $:%.2f %n", product1, prince1);
		System.out.printf("%s, Which price is $:%.2f %n %n", product2, prince2);

		System.out.printf("Record: %s years old, code %d  and gender: %s %n %n", age, code, gender);

		System.out.printf("Measu with eight decimal places: %.8f %n", measure);
		System.out.printf("Rounded (three deciaml places): %.3f %n", measure);
		System.out.printf("US decimal point: %.3f %n", measure);
		System.out.print(code);
	}

}
