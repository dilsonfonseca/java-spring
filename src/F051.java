import java.util.Scanner;

public class F051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Digite as medidas do triângulo X");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Digite as medidas do triângulo Y");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p*(p - xA) * (p - xB) * (p - xC));
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p*(p - yA) * (p - yB) * (p - yC));
		
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
