package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
		boolean result = false;

		try {
			result = kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDataOfBirth());

		} catch (Exception exception) {
			System.out.println("Not a valid person!");
		}
		return result;

	}
}
