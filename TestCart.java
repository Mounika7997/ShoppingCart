package shoppingitems.com;

public class TestCart {
public static void main(String[] args) {
	Item pen = new Item("ball Pen" ,3,15);
	Item laptop = new Item("Hp laptop" ,1,34992);
	Item mobile = new Item("Samsung mobile" ,2,20000);
	Item  book = new Item("wings of fire " ,1,342);
	Item grocery = new Item("flour" ,1,200);
	//Item milk = new Item("milk" ,1,200);
	
	ShoppingCart bill = new ShoppingCart();
	bill.addItem(mobile);
	bill.addItem(laptop);
	bill.addItem(pen);
	bill.addItem(grocery);
	bill.addItem(book);
	//bill.addItem(milk);
	
	System.out.println(bill.calculateTotalPrice());
}
}
