package Test;

import Abstract.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.add(new Customer(1,"Emre", "Güngör",1999,"00000000000"));

	}
}
