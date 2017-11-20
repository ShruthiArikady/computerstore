package computer.Controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONObject;

import computer.Exception.PriceException;
import computer.Model.Item;
import computer.Model.Cart;

public class Purchase {
	private Cart c;

	public Purchase() {
		c = new Cart();
		// totalPrice=0;
	}

	public ArrayList<JSONObject> addToCart(JSONObject item, int quantity)
			throws PriceException {

		
		c.setCart(item);
		ArrayList<JSONObject> it = c.getCart();
		// TODO: null check
		return it;
		// c.setTotalPrice(totalPrice);

	}
	
	public ArrayList<JSONObject> getCart(){
		return c.getCart();
		
	}

	@SuppressWarnings("rawtypes")
	public void removeItem(String name) {

		//ArrayList<JSONObject> it = ;

		Iterator item = c.getCart().iterator();

		boolean loop = true;
		while (loop && item.hasNext()) {
			JSONObject JSONobj = (JSONObject) item.next();
			if (JSONobj.get("name").toString().toUpperCase().trim()
					.equals(name.toUpperCase().trim())) {
				item.remove();
				loop = false;
			}
		}
		
		
	}

}
