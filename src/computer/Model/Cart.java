package computer.Model;

import java.util.ArrayList;

import org.json.simple.JSONObject;

public class Cart {
    
	
	private ArrayList<JSONObject> cart;
	
	public Cart(){
		cart= new ArrayList<>();
	   
	}
	
	
	public ArrayList<JSONObject> getCart() {
		return cart;
	}

	public void setCart(JSONObject item) {
		cart.add(item);
	}


	

	


}
