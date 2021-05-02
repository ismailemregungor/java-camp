package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer emre = new IndividualCustomer();
		emre.setCustomerNumber("12345");
		
		CustomerManager customerManager1 = new CustomerManager();
		customerManager1.add(emre);
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.setCustomerNumber("123456789");
		
		CustomerManager customerManager2 = new CustomerManager();
		customerManager2.add(hepsiBurada);
		
		Customer[] customers = {emre, hepsiBurada};
		CustomerManager customerManager3 = new CustomerManager();
		customerManager3.multipleAdd(customers);

	}
}
