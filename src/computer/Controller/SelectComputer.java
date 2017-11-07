package computer.Controller;

//import java.util.ArrayList;
//import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import computer.Model.Item;

import computer.Model.JSONReader;

public class SelectComputer {

	private JSONArray items;
	private JSONObject selecteditem;

	public SelectComputer() {

		// Iterate over item array
		// Iterate over item array

		JSONReader readData = new JSONReader();

		items = readData.readFile();

	}

	public void printTypes() {

		for (Item.Type t : Item.Type.values()) {

			System.out.println(t.toString());
		}

	}

	public boolean selectBrand(String Type) {
		boolean value = true;
		for (Object itemObject : items) {

			JSONObject item = (JSONObject) itemObject;
			
				if (item.get("type").equals(Type.toUpperCase().trim())) {
					System.out.println(item.get("brand").toString());
				} 
			
		}
		return value;
	}

	public boolean selectModel(String Brand) {
		boolean value = true;
		for (Object itemObject : items) {

			JSONObject item = (JSONObject) itemObject;
			
				if (item.get("brand").toString().toUpperCase().trim().equals(Brand.toUpperCase().trim())) {
					System.out.println(item.get("name").toString());
				} 
			
		}
		return value;
	}

	
	public void getDetails(String modelName) {
		
		
		for (Object itemObject : items) {

			JSONObject item = (JSONObject) itemObject;

			if (item.get("name").toString().toUpperCase().trim().equals(modelName.toUpperCase().trim()))
			{

				System.out.println("The Selected Item Name is :"
						+ item.get("name").toString());
			System.out.println("The Selected Item Cost is :"
					+ item.get("cost").toString());
			System.out.println("The Selected Item Description is :"
					+ item.get("description").toString());
			System.out.println("No of pieces available:"
					+ item.get("quantity"));
					selecteditem=item;
			}
					
		}

	}


	public JSONObject getItem() {
	
		return selecteditem;
	}

}
