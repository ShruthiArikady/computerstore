//this is cart

package computer.Model;

import java.util.ArrayList;

import org.json.simple.JSONObject;

public class Cart {
    
	private  int capacity;
	private ArrayList<JSONObject> cart;
	
	public Cart(){
		cart= new ArrayList<>();
	    capacity=5;
	}
	
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
