import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class F084 {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		for (String x: list) {
			System.out.println(x.toUpperCase());
		}
		System.out.println("---------------");
		System.out.println("---------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x: list) {
			System.out.println(x.toUpperCase());
		}
		System.out.println(list.size());
		System.out.println("---------------");
		System.out.println("---------------");
		System.out.println("Index de Bob: " + list.indexOf("Marco"));
		
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("---------------");
		System.out.println("---------------");
		System.out.println("Nomes que começam com A e que permanceram na lista: ");
		for (String x: result) {
			System.out.println(x.toUpperCase());
		}
		
		System.out.println("---------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		


		
		
		
	}

}
