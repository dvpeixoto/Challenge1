package util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import model.Customer;
import model.Item;
import model.Sale;
import model.Salesman;
import repository.CustomerRepository;
import repository.SaleRepository;
import repository.SalesmanRepository;

public class ReaderFileByName {
	private ReaderNameFiles fileDatReader = new ReaderNameFiles();;

	public ReaderFileByName() {
	}

	public void ExtractFiles() {
		try {
			List<File> fileList = fileDatReader.readerFiles();

			for (File file : fileList) {
				String fileName = file.getName();
				FileReader data = new FileReader(Constant.PLACE_READER + fileName);
				Scanner reader = new Scanner(data);
				reader.useDelimiter("ç|\\n|\\r");
				while (reader.hasNext()) {
					String id = reader.next();
					if (id.equals("001")) {
						Long cpf = reader.nextLong();
						String name = reader.next();
						String salaryTemp = reader.next();
						double salary = Double.parseDouble(salaryTemp);
						Salesman salesman = new Salesman(cpf, name, salary);
						SalesmanRepository.getInstance().add(salesman);
					} else if (id.equals("002")) {
						Long cnpj = reader.nextLong();
						String name = reader.next();
						String businessArea = reader.next();
						Customer customer = new Customer(cnpj, name, businessArea);
						CustomerRepository.getInstance().add(customer);
					} else if (id.equals("003")) {
						int idSale = reader.nextInt();
						String listItens = reader.next();
						listItens = listItens.replace("[", "").replace("]", "");
						String[] list = listItens.split(",");
						String salesmanName = reader.next();
						SalesmanRepository salesmanRepository = SalesmanRepository.getInstance();
						Salesman salesman = salesmanRepository.findSalesmanByName(salesmanName);
						Sale sale = new Sale(idSale, salesman);
						for (String string : list) {
							String[] item = string.split("-");
							int idItem = Integer.parseInt(item[0]);
							int quantity = Integer.parseInt(item[1]);
							double price = Double.parseDouble(item[2]);
							Item itemList = new Item(idItem, quantity, price);
							sale.addItem(itemList);
						}
						SaleRepository.getInstanciae().add(sale);
					}
				}
				reader.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
