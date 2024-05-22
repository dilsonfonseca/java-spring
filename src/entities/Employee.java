package entities;

public class Employee {
	public String name;
	public double GrossSalary;
	public double tax;

	public double NetSalary() {
		return this.GrossSalary - this.tax;

	}
	
	public double IncreaseSalary(double porcentage) {
		double newSalary = NetSalary() + (NetSalary() * porcentage/100);
		return newSalary;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", NetSalary());
	}
}
