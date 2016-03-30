package repository;

import java.util.Comparator;
import java.util.List;

import model.Sale;

public final class SaleRepository extends Repository<Sale> {

	private static final SaleRepository instance = new SaleRepository();

	private SaleRepository() {
	}

	public static SaleRepository getInstanciae() {
		return instance;
	}

	public Sale getMostExpensive() {
		return getData().stream().max((sale1, sale2) -> sale1.getTotalValue().compareTo(sale2.getTotalValue())).get();
	}

	public Sale getWorstExpensive() {
		return getData().stream().min(Comparator.comparing(Sale::getTotalValue)).get();
	}

	public List<Sale> findSale() {
		return getData();
	}

}
