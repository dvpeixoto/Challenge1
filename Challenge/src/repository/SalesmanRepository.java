package repository;

import java.util.List;

import model.Salesman;

public final class SalesmanRepository extends Repository<Salesman> {

	private static final SalesmanRepository instance = new SalesmanRepository();

	private SalesmanRepository() {
	}

	public static SalesmanRepository getInstance() {
		return instance;
	}

	public Salesman findSalesmanByName(String nameSalesman) {
		return getData().stream().filter(salesman -> salesman.getName().equalsIgnoreCase(nameSalesman)).findFirst()
				.get();
	}

	public List<Salesman> findSalesman() {
		return getData();
	}

}
