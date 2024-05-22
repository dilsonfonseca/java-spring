import java.util.Scanner;

import entities.Triangle;

public class F052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas do triângulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite as medidas do triângulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.println("Área do triângulo X: " + areaX);
		System.out.println("Área do triângulo Y: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("A área maior é a do triângulo X");
		} else {
			System.out.println("A área maior é a do triângulo Y");
		}
		sc.close();
	}

}

