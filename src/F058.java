import java.util.Scanner;
import java.util.Locale;
import entities.Calculator2;

public class F058 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator2 calc = new Calculator2();

		System.out.print("Digite o valor do raio: ");

		double radius = sc.nextDouble();

		double c = calc.circumference(radius);

		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", calc.PI);

		sc.close();
	}

}
