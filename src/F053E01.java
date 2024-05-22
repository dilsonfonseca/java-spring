import java.util.Locale;
import java.util.Scanner;

import entities.TriangleE01;

public class F053E01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		TriangleE01 triangle = new TriangleE01();
		System.out.println("Insira a largura do triângulo");
		triangle.largura = scanner.nextDouble();
		
		System.out.println("Insira a altura do triângulo");
		triangle.altura = scanner.nextDouble();
	
		System.out.println("AREA: " + triangle.calcularArea());
		System.out.println("PERIMETRO: " + triangle.calcularPerimetro());
		System.out.println("DIAGONAL: " + triangle.calcularDiagonal());
		
		
		scanner.close();
	}

}
