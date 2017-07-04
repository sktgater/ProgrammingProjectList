/*
Product Stock Class
Purpose: record all different products in this warehouse and be able to calculate
total value
*/
import java.util.*;

class ProductStock{
	private Map<Integer, Product> dataMap;

	public ProductStock(){
		dataMap = new HashMap<Integer, Product>();
	}
	// Add only if product doesn't exist in dataMap
	public boolean addProduct(Product newProduct){
		int id = newProduct.getID();
		// If existing product in inventory, return failure
		if (dataMap.containsKey(id)){
			System.out.println("Existing Product In The Inventory!");
			return false;
		}
		// Add new product
		dataMap.put(id, newProduct);
		System.out.println("Add New Product Successful!");
		return true;
	}
	// Update original existing inventory
	public void updateProduct(Product newProduct){
		int id = newProduct.getID();
		// New inventory. Simply call add
		if (!dataMap.containsKey(id)){
			System.out.println("Non-existing Product. Add as New.");
			addProduct(newProduct);
		}
		// Existing inventory. Update with new object
		else{
			System.out.println("Update Inventory");
			dataMap.put(id, newProduct);
		}
	}
	// Delete existing inventory by id
	public void deleteProduct(int id){
		if (dataMap.containsKey(id)){
			dataMap.remove(id);
		}
	}
	// Calculate total values of all inventories
	public double calculateTotalValue(){
		double sum = 0.00;
		for (Map.Entry<Integer, Product> entry : dataMap.entrySet()){
			double price = entry.getValue().getPrice();
			int quantity = entry.getValue().getQuantity();
			sum += price * quantity;
		}
		return sum;
	}



}