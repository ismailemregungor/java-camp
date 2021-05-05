package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		
		Product product = new Product(1,2,"Elma",12,50);
		
		ProductService productService1 = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		productService1.add(product);
		
		ProductService productService2 = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		productService2.add(product);
		

	}
}
