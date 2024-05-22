import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class F069 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Digite o número da conta: ");
		int number = sc.nextInt();

		System.out.println("Digite o nome da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Tem depósito incial?(s/n)");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.println("Digite o valor inicial");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Dados da conta");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Digite um valor de depósito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Conta atualizada: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Digite um valor de saque: ");
		depositValue = sc.nextDouble();
		account.withdraw(depositValue);
		System.out.println("Conta atualizada: ");
		System.out.println(account);



		
		
		sc.close();
	}

}
