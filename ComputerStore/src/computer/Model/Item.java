package computer.Model;

public class Item {
	private String name;
	private int cost;
	private String description;
	private String category;
	
	public Item(String name,int cost,String description, String category)
	{
		this.name= name;
		this.cost =cost;
		this.description =description;
		this.category =category;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}

	}
	
	
