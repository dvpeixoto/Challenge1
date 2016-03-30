package model;

public class Item {
	private final int idItem;
	private final int itemQuantity;
	private final double price;

	public Item(int idItem, int itemQuantity, double price) {
		this.idItem = idItem;
		this.itemQuantity = itemQuantity;
		this.price = price;
	}

	public int getIdItem() {
		return idItem;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "\nidItem: " + idItem + "\nItem Quantity: " + itemQuantity + "\nPrice: " + price + "\n";
	}

}
