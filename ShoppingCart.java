package shoppingitems.com;

public class ShoppingCart {
    private Item[]  cart;
    private double totalprice;
    private int storedItems;
	private double totalPrice;
    
    public ShoppingCart() {
    	cart =new Item[5];
    }

	public ShoppingCart(int cartSize) {
	   cart = new Item[cartSize];
	}
    
	public void addItem(Item input) {
		if(storedItems < cart.length) {
			cart[storedItems] = input;
			storedItems++;
		}
		else {
			System.out.println("Shopping cart is full");
			
		}
		
	}
	
	public double calculateTotalPrice() {
		for(int i=0;i<cart.length;i++) {
			totalprice += cart[i].getPrice();
		}
		return totalprice;
		
	}
    
}
