package computer.Model;
 
public class Item {
	private String name;
	private int cost;
	private String description;
	private String brand;
	private Type type;
	public static enum Type{
		DESKTOP,LAPTOP
	}
	public Item(Type type)
	{
		this.type=type;
	}
	
	public Item(String name,int cost,String description, String brand)
	{
		this.name= name;
		this.cost =cost;
		this.description =description;
		this.brand =brand;
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

	public int getCost() {
		return cost;
	}

	public String getDescription() {
		return description;
	}

	public String getBrand() {
		return brand;
	}
	



	}
	
	
