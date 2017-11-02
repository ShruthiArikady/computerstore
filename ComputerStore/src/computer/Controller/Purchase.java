package computer.Controller;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import computer.Model.Item;
import computer.Model.Cart;

public class Purchase {
	private Cart c;

	public Purchase() {
		c = new Cart();
	}
	
	 public void addToCart(JSONObject item,int quantity)
	    { 
		 c.setCart(item);
			double totalPrice = c.getTotalPrice();
			ArrayList<JSONObject> it = c.getCart();
			for (JSONObject i : it) {
				totalPrice += Double.parseDouble(i.get("cost").toString());
	
	     }
			c.setTotalPrice(totalPrice);
	    }
	 
	 public void removeItem(String name) {

			ArrayList<JSONObject> it = c.getCart();
			// ArrayList<JSONObject> newlist = new ArrayList<>();

			for (JSONObject j : it) {
	if (j.get("name").toString().toUpperCase().trim().equals(name.toUpperCase().trim())) {
					// item = j;
					// newlist.add(j);
					break;
				}
			}
	 }
}
