package Concrete;

import Abstract.StoreService;
import Entities.Store;

public class StoreManager implements StoreService{

	@Override
	public void add(Store store) {
		
		System.out.println(store.getItemId() + " id'li item maðazaya eklendi ");
		
	}

	@Override
	public void update(Store store) {
		
		System.out.println(store.getItemId() + " id'li item maðazada güncellendi");
		
	}

	@Override
	public void delete(Store store) {
		
		System.out.println(store.getItemId() + " id'li item maðazadan silindi");
		
	}

}
