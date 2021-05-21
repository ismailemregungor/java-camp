package Concrete;

import Abstract.StoreService;
import Entities.Store;

public class StoreManager implements StoreService{

	@Override
	public void add(Store store) {
		
		System.out.println(store.getItemId() + " id'li item ma�azaya eklendi ");
		
	}

	@Override
	public void update(Store store) {
		
		System.out.println(store.getItemId() + " id'li item ma�azada g�ncellendi");
		
	}

	@Override
	public void delete(Store store) {
		
		System.out.println(store.getItemId() + " id'li item ma�azadan silindi");
		
	}

}
