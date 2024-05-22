import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class F053E02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Employee employee = new Employee();

		System.out.println("Digite o nome do funcionário: ");
		employee.name = sc.nextLine();

		System.out.println("Digite o salário do funcionário: ");
		employee.GrossSalary = sc.nextDouble();

		System.out.println("Digite a taxação no salário do funcionário: ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee: " + employee);

		System.out.println();
		System.out.println("Você gostaria de aumentar o salário de " + employee.name + " ? S/N");
		String resposta = sc.nextLine();
		resposta = sc.nextLine();

		if (resposta.equals("S") || resposta.equals("s")) {
			System.out.println("Qual porcentagem você gostaria de aumentar?");
			double porcentage = sc.nextDouble();
			System.out.println("O novo salário de " + employee.name + " é: " + employee.IncreaseSalary(porcentage) + " $");
		} else {
			System.out.println("Você deixou " + employee.name + " triste");
		}

		sc.close();

	}
}
