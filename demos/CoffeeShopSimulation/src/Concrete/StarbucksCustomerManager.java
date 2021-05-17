package Concrete;

import Abstract.CustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.add(customer);
		}else {
			System.out.println("Not a valid person!");
		}
	}
}
