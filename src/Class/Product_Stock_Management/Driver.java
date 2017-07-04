class Driver{

	public static void main(String[] args){
		ProductStock inventory = new ProductStock();
		Product product1 = new Product(1, 3.2, 10);
		Product product2 = new Product(2, 1.26, 15);
		Product product3 = new Product(3, 9.32, 134);
		inventory.addProduct(product1);
		inventory.addProduct(product2);
		inventory.addProduct(product3);
		System.out.printf("Inventory Total: %.2f\n", inventory.calculateTotalValue());
		// Test update
		product1.setQuantity(257);
		inventory.updateProduct(product1);
		System.out.printf("Inventory Total: %.2f\n", inventory.calculateTotalValue());

	}


}