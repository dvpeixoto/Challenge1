package util;

import model.Dashboard;
import repository.CustomerRepository;
import repository.SaleRepository;
import repository.SalesmanRepository;

public class CatchDataFiles {

	public String CatchContentFile() {
		StringBuilder fileSaveDat = new StringBuilder();
		ReaderFileByName readerFileByName = new ReaderFileByName();
		Dashboard dashboard = new Dashboard();

		readerFileByName.ExtractFiles();

		fileSaveDat.append(SalesmanRepository.getInstance().findSalesman().toString()
				+ CustomerRepository.getInstance().findCustomer().toString()
				+ SaleRepository.getInstanciae().findSale().toString() + dashboard.amountClientInFile().toString()
				+ dashboard.amountSalesmanInFile().toString() + dashboard.idMostExpensive().toString()
				+ dashboard.worstSalesmanEver().toString());

		return fileSaveDat.toString();
	}
}
