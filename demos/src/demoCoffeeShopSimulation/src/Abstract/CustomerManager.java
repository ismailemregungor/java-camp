package Abstract;

import Entities.Customer;

public abstract class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		
		System.out.println("Eklendi : " + customer.getFirstName() + " " + customer.getLastName());
		
	}

}
