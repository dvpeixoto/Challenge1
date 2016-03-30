package model;

public class Customer {
	private final long cnpj;
	private final String name;
	private final String businessArea;

	public Customer(long cnpj, String name, String businessArea) {
		this.cnpj = cnpj;
		this.name = name;
		this.businessArea = businessArea;
	}

	public long getCnpj() {
		return cnpj;
	}

	public String getName() {
		return name;
	}

	public String getBusinessArea() {
		return businessArea;
	}

	@Override
	public String toString() {
		return "\nCustomer Class Attributes:\nName: " + name + "\nCNPJ: " + cnpj + "\nBusiness Area: " + businessArea
				+ "\n";
	}

}
