class Product{
	private int id;
	private double price;
	private int quantity;

	public Product(){
		// empty constructor
	}

	public Product(int id, double price, int quantity){
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}

	public int getID(){
		return id;
	}
	public void setID(int newID){
		id = newID;
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double newPrice){
		price = newPrice;
	}

	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int newQuantity){
		quantity = newQuantity;
	}

}