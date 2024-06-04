import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import entities.Worker;
import entities.Departament;
import entities.HourContract;
import entities.enums.WorkerLevel;

public class F130 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com o nome do departamento");
		String departamentName = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador:");
		System.out.print("Nome:");
		String workerName = sc.nextLine();
		System.out.println("Level:");
		String workerLevel = sc.nextLine();
		System.out.println("Base Salary:");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament (departamentName));

		System.out.println("Quantos contratos para esse trabalhador?");
		int n = sc.nextInt();

		for (int i = 1; i<=n; i++){
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("DATA (DD/MM/YYYY)");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração do contrato: ");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);

		}

		System.out.println();
		System.out.print("Entre com o mês e ano para calcular o salário (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("Income for : " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));







		sc.close();
	}
}
