import java.util.Scanner;
import java.util.Locale;
import entities.CurrencyConverter;

public class F060 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a cotação do dólar?");
		System.out.println(CurrencyConverter.COTACAO);
		
		System.out.println("Quantos doláres vão ser comprados?");
		double quantidade = sc.nextDouble();
		
		System.out.println(String.format("Valor a ser pago em reais: R$%.2f", CurrencyConverter.ConverterReais(quantidade)));

		
		
		sc.close();
	}
}
