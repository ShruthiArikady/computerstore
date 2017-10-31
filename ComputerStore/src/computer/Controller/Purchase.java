package computer.Controller;

import computer.Model.Item;
import computer.Model.Cart;

public class Purchase {

	
	 public void addToCart( String name, String cost, String Description,String brand,int quantity)
	    { 
		 Item item = new Item("HP","35000", "laptop is good","destop",1);
		 totalPrice += (itemPrice * itemQuantity);
		    cart[itemCount] = item;
		    itemCount += 1;
		    if(itemCount==capacity)
		    {
		        increaseSize();
		    }
	    }
	
}
