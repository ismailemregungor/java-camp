package inheritance;

public class CustomerManager {

	public void add(Customer customer) {

		System.out.println(customer.getCustomerNumber() + " kaydedildi");
		
	}

	public void multipleAdd(Customer[] customers) {

		for (Customer customer : customers) {
			
			add(customer);
			
		}
	}
}
