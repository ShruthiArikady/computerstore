package computer.Model;
 
public class Item {
	private String name;
	private double cost;
	private String description;
	private String brand;
	private int quantity;
	private Type type;
	
	public static enum Type{
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
	
	
	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public String getDescription() {
		return description;
	}

	public String getBrand() {
		return brand;
	}

	public int getQuantity() {
		return quantity;
	}

	
	



	}
	
	
