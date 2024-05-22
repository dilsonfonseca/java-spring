import java.util.Locale;
import java.util.Scanner;
import entities.Product;


public class F053 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Digite os dados do produto: ");
		System.out.println("Name:  ");
		product.name = scanner.nextLine();
		
		System.out.println("Price:  ");
		product.price = scanner.nextDouble();
		
		System.out.println("Quantity:  ");
		product.quantity = scanner.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.println("Entre com o número de produtos para ser adicionado no estoque: ");
		int quantity = scanner.nextInt();
		product.addProducts(quantity);
		
		atualizarDados(product);
		
		System.out.println();
		System.out.println("Entre com o número de produtos para ser removidos no estoque: ");
		quantity = scanner.nextInt();
		product.removeProducts(quantity);
		
		atualizarDados(product);
		
		scanner.close();
	}

	public static void atualizarDados(Product product) {
	System.out.println();
	System.out.println("Dados atualizados: " + product);
	}
	
}
