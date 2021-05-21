package Concrete;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		
		System.out.println(order.getId() +  " id'li sipariþ eklendi");

		
	}

	@Override
	public void update(Order order) {
		
		System.out.println(order.getId() +  " id'li sipariþ güncellendi");

		
	}

	@Override
	public void delete(Order order) {
		
		System.out.println(order.getId() +  " id'li sipariþ silindi");

		
	}

}
