package entities;

public class CurrencyConverter {
	
	public final static double COTACAO = 5.0683041;
	public final static double IOF = 0.06;


	public static double ConverterReais(double quantidade) {
		double total = quantidade * COTACAO;
		return total + (total * IOF);
	}
}
