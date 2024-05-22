import java.util.Locale;
import java.util.Scanner;
import entities.Product2;


public class F062 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Digite os dados do produto: ");
		System.out.println("Name:  ");
		String name = scanner.nextLine();
		
		System.out.println("Price:  ");
		double price = scanner.nextDouble();
		
		System.out.println("Quantity:  ");
		int quantity = scanner.nextInt();
		Product2 product = new Product2(name, price, quantity);
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.println("Entre com o número de produtos para ser adicionado no estoque: ");
		quantity = scanner.nextInt();
		product.addProducts(quantity);
		
		atualizarDados(product);
		
		System.out.println();
		System.out.println("Entre com o número de produtos para ser removidos no estoque: ");
		quantity = scanner.nextInt();
		product.removeProducts(quantity);
		
		atualizarDados(product);
		
		scanner.close();
	}

	public static void atualizarDados(Product2 product) {
	System.out.println();
	System.out.println("Dados atualizados: " + product);
	}
	
}
