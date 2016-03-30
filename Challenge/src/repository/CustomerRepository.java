package repository;

import java.util.List;

import model.Customer;

public class CustomerRepository extends Repository<Customer> {

	private static final CustomerRepository instance = new CustomerRepository();

	private CustomerRepository() {
	}

	public static CustomerRepository getInstance() {
		return instance;
	}

	public List<Customer> findCustomer() {
		return getData();
	}
}
