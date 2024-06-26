import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class F085 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee2> list = new ArrayList<>();

		// PARTE 01 - LENDO OS DADOS:

		System.out.println("Quantos empregados serão registrados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");

			System.out.println("Id: ");
			int id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.println("Id já registrado. Tente novamente: ");
				id = sc.nextInt();
			}
			System.out.println("Name: ");

			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee2(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		// PART 3 - LISTING EMPLOYEES:

		System.out.println();
		System.out.println("List of employees:");
		for (Employee2 obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static boolean hasId(List<Employee2> list, int id) {
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
