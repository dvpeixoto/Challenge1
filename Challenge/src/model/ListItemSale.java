package model;

import java.util.ArrayList;
import java.util.List;

public class ListItemSale {
	private List<Item> itens;

	public ListItemSale() {
		itens = new ArrayList<>();
	}

	public void addItem(Item item) {
		if (item != null) {
			itens.add(item);
		}
	}

	public List<Item> getItens() {
		return itens;
	}

}
