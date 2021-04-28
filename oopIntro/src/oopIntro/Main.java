package oopIntro;

public class Main {

	public static void main(String[] args) {

	
		Product product1 = new Product();
		product1.id = 1;
		product1.name = "Lenovo";
		product1.unitPrice = 15000;
		product1.detail = "i7 16GB Ram";

		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Asus";
		product2.unitPrice = 12000;
		product2.detail = "i7 8GB Ram";

		
		Product product3 = new Product(3, "HP", 8000, "i5 8GB Ram");

		Product[] products = { product1, product2, product3 };

		System.out.println(products.length);

		for (Product product : products) {

			System.out.println(product.name);

		}

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Akýllý Telefon";

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

	}

}
