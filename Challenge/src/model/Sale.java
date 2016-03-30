package model;

public class Sale {
	private final int idSale;
	private final Salesman salesman;
	private final ListItemSale listItemSale;

	public Sale(int idSale, Salesman salesman) {
		this.idSale = idSale;
		this.salesman = salesman;
		listItemSale = new ListItemSale();
	}

	public int getIdSale() {
		return idSale;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void addItem(Item item) {
		listItemSale.addItem(item);
	}

	public Double getTotalValue() {
		double totalPrice = 0;
		for (Item item : listItemSale.getItens()) {
			totalPrice += (item.getPrice() * item.getItemQuantity());
		}
		return totalPrice;
	}

	@Override
	public String toString() {
		StringBuilder itemBuilder = new StringBuilder();
		for (Item itensList : listItemSale.getItens()) {
			itemBuilder.append(itensList.toString() + "\n");
		}
		return "\nSale Class Attributes:\nidSale: " + idSale + "\nSalesman Name: " + salesman.getName()
				+ "\nList Itens Sale: " + itemBuilder + "\n";
	}
}
