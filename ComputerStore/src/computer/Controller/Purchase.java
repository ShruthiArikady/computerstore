package computer.Controller;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import computer.Model.Item;
import computer.Model.Cart;

public class Purchase {
	private Cart c;
	private int totalPrice;

	public Purchase() {
		c = new Cart();
		//totalPrice=0;
	}
	
	 public void addToCart(JSONObject item,int quan)
	    { 
		 c.setCart(item);
		//int totalPrice = (int) c.getTotalPrice();
			ArrayList<JSONObject> it = c.getCart();
			for (JSONObject i : it) {
				
				totalPrice = (int) Double.parseDouble((String) i.get("cost")) * (int) (quan);
				
				System.out.println("Final Order:");	
				System.out.println("Item selected:" + i.get("brand") + " " + i.get("type") );	
				System.out.println("Total Cost:" +totalPrice);
	     }
			//c.setTotalPrice(totalPrice);
		
				
	    }
	 
	
	/* public void removeItem(String name) {

			ArrayList<JSONObject> it = c.getCart();
			// ArrayList<JSONObject> newlist = new ArrayList<>();

			for (JSONObject j : it) {
	if (j.get("name").toString().toUpperCase().trim().equals(name.toUpperCase().trim())) {
					// item = j;
					// newlist.add(j);
					break;
				}
			}
	 }*/
}
