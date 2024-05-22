package entities;

public class TriangleE01 {
	public double altura;
	public double largura;

	public double calcularArea() {
		return ((largura * altura) / 2.00);
	}
	
	public double calcularDiagonal() {
		return Math.sqrt(largura + altura);
		
	}
	
	public double calcularPerimetro() {
		double c = Math.sqrt(largura + altura);
		return altura + largura + c*c;
	}
	
}
