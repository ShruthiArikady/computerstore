package computer.Model;

import java.util.ArrayList;

public class Cart {
	private int itemCount;
	private double totalPrice;
	private static int capacity;
	private ArrayList<Item> cart;
	
	public Cart(){
		itemCount=10;
	    totalPrice=0.0;
	    capacity=0;
	}

	public int getItemCount() {
		return itemCount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public static int getCapacity() {
		return capacity;
	}

	public ArrayList<Item> getCart() {
		return cart;
	}

	public void setCart(Item item) {
		cart.add(item);
	}

	


	


}
