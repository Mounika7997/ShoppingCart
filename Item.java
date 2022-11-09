package shoppingitems.com;

public class Item {
	private String name;
	private double 	Price;
	private int quantity;
	
	public Item(String name, int quantity , double unitPrice) {
		this.name = name;
		this.Price = quantity*unitPrice;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
