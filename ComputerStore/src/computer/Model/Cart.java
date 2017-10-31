package computer.Model;

public class Cart {
	public int itemCount;
	public static double totalPrice;
	public static int capacity;
	public static Item[] cart = new Item[capacity];

	public Cart(){
		itemCount=10;
	    totalPrice=0.0;
	    capacity = 0;
	}

	public int getItemCount() {
		return itemCount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public static Item[] getCart() {
		return cart;
	}

	public static void setCart(Item[] cart) {
		Cart.cart = cart;
	}


	


}
