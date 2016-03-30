package model;

public class Salesman {
	private long cpf;
	private String name;
	private double salary;

	public Salesman(long cpf, String name, double salary) {
		this.cpf = cpf;
		this.name = name;
		this.salary = salary;
	}

	public long getCpf() {
		return cpf;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "\nSalesman Class Attributes:\nCPF: " + cpf + "\nName: " + name + "\nSalary: " + salary + "\n";
	}

}
