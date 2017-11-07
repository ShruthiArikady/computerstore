// ***************************************************************

//   Item.java
//   Represents an item in a shopping cart.

// ***************************************************************



package computer.Model;
 
public class Item 
{
	private String name;
	private int cost;
	private String description;
	private String brand;
	private int quantity;
	private Type type;
	
	public static enum Type
	{
		DESKTOP,LAPTOP
	}
	
	public Item(Type type)
	{
		this.type=type;
	}
	
	public Item()
	{
		/*this.name= name;
		this.cost =cost;
		this.description =description;
		this.brand =brand;
		this.quantity=quantity;*/
	}


	public Type getType()
	{
		return type;
	}
	
	public String toString() 
	{ return  "" + type; }
	

// -------------------------------------------------
//  Returns the names of the item
//--------------------------------------------------
	
	public String getName() 
	{
		return name;
	}
	
	 
// -------------------------------------------------
//   Returns the cost of the item
// -------------------------------------------------

	public int getCost() 
	{
		return cost;
	}

// -------------------------------------------------
//  Returns the description of the item
//--------------------------------------------------
	
	public String getDescription() 
	{
		return description;
	}

// -------------------------------------------------
//  Returns the brand of the item
//--------------------------------------------------
	public String getBrand() 
	{
		return brand;
	}

// -------------------------------------------------
//  Returns the quantity of the item
//--------------------------------------------------
	
	public int getQuantity() 
	{
		return quantity;
	}

	
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}

}
	
	
