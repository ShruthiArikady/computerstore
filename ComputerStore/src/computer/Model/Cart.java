package computer.Model;

import java.util.ArrayList;

import org.json.simple.JSONObject;

public class Cart {
    //private int totalPrice;
	private  int capacity;
	private ArrayList<JSONObject> cart;
	
	public Cart(){
		cart= new ArrayList<>();
		//itemCount=0;
	    //totalPrice=0;
	    capacity=5;
	}

	
	/*public double getTotalPrice() 
	{
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) 
	{
		this.totalPrice = totalPrice;
	}*/
	
	public int getCapacity() 
	{
		return capacity;
	}

	public ArrayList<JSONObject> getCart() {
		return cart;
	}

	public void setCart(JSONObject item) {
		cart.add(item);
	}


	

	


}
