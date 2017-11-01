package computer.Controller;

import java.util.ArrayList;

import computer.Model.Item;
import computer.Model.Cart;

public class Purchase {

	
	 public void addToCart( String name, double cost,int quantity)
	    { 
		 Item item = new Item();
		 /*totalPrice += (itemPrice * itemQuantity);
		    cart[itemCount] = item;
		    itemCount += 1;
		    if(itemCount==capacity)
		    {
		        increaseSize();
		    }
	    }*/
	     Cart c=new Cart();
	     c.setCart(item);
	     double totalPrice =c.getTotalPrice();
	     ArrayList<Item> it= c.getCart();
	     for(Item i:it)
	     {
	    	 totalPrice += (double) i.getCost();
	     }
       }
	 
	 @SuppressWarnings("null")
	public void removeItem(String name)
		{
			Item  item = null;
			Cart c=new Cart();
			 ArrayList<Item> it= c.getCart();
			for (Item j : it)
			{
				if(item.getName().equals(name)){
					item = j;
					break;
				}
			}
			if(item != null){
				it.remove(item);
			}
		}
}
