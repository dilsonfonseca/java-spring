import java.util.Locale;
import java.util.Scanner;
import entities.Product3;

public class F064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite os dados do produto: ");
		System.out.println("Name:  ");
		String name = scanner.nextLine();

		System.out.println("Price:  ");
		double price = scanner.nextDouble();
		Product3 product = new Product3(name, price);

		product.setName("Computer");
		System.out.println("Nome atualizado: " + product.getName());

		product.setPrice(500);
		System.out.println("Preço atualizado: " + product.getPrice());

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

	public static void atualizarDados(Product3 product) {
		System.out.println();
		System.out.println("Dados atualizados: " + product);
	}

}
