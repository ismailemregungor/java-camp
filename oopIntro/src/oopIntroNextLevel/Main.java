package oopIntroNextLevel;

public class Main {

	public static void main(String[] args) {

		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenovo");
		product1.setDetail("16 GB Ram");
		product1.setUnitPrice(16000);
		product1.setDiscount(10);
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		Product[] products = { product1 };

		for (Product product : products) {

			System.out.println(product.getName());

		}
		
		ProductManager productManager1 = new ProductManager();
		productManager1.addToCart(product1);
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ýcecek");
		
		Category[] categories = {category1};
		
		for (Category category : categories) {

			System.out.println(category.getName());

		}
		
		CategoryManager categoryManager1 = new CategoryManager();
		categoryManager1.chooseCategory(category1);
		
		CategoryManager categoryManager2 = new CategoryManager();
		categoryManager2.chooseCategory(category2);
		
		
	}
}
