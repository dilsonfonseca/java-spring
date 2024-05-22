import java.util.Locale;
import java.util.Scanner;

import entities.Product4;

public class F074 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product4[] vect = new Product4[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product4(name, price);
		}

		double sum = 0.00;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;
		System.out.printf("Média do preço = %.2f%n", avg);

		sc.close();
	}

}
