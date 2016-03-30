package model;

import repository.CustomerRepository;
import repository.SaleRepository;
import repository.SalesmanRepository;

public class Dashboard {

	public String amountClientInFile() {
		StringBuilder s = new StringBuilder();
		return s.append("\nQuantity Customers in list: " + CustomerRepository.getInstance().size() + "\n").toString();
	}

	public String amountSalesmanInFile() {
		StringBuilder s = new StringBuilder();
		return s.append("\nQuantity salesman in list: " + SalesmanRepository.getInstance().size() + "\n").toString();
	}

	public String idMostExpensive() {
		StringBuilder s = new StringBuilder();
		int id = SaleRepository.getInstanciae().getMostExpensive().getIdSale();
		double totalSalesValue = SaleRepository.getInstanciae().getMostExpensive().getTotalValue();
		return s.append("\nMost Expensive sale id: " + id + "\nTotal Value Sale: " + totalSalesValue + "\n").toString();
	}

	public String worstSalesmanEver() {
		StringBuilder s = new StringBuilder();
		String worstSalesmanName = SaleRepository.getInstanciae().getWorstExpensive().getSalesman().getName();
		double totalSalesValue = SaleRepository.getInstanciae().getWorstExpensive().getTotalValue();
		return s.append(
				"\nWorst Salesman ever is: " + worstSalesmanName + "\nTotal Value Sale: " + totalSalesValue + "\n")
				.toString();
	}

}
