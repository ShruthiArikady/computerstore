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

	public JSONArray selectBrand(String Type) {
		//boolean value = true;
		JSONArray itemsnew = new JSONArray();
		for (Object itemObject : items) {

			JSONObject item = (JSONObject) itemObject;
			
				if (item.get("type").equals(Type.toUpperCase().trim())) {
					itemsnew.add(item);
					//System.out.println(item.get("brand").toString());
				} 
			
		}
		
		return itemsnew;
	}

	public JSONArray selectModel(String Brand) {
		JSONArray itemsnew = new JSONArray();
		for (Object itemObject : items) {

			JSONObject item = (JSONObject) itemObject;
			
				if (item.get("brand").toString().toUpperCase().trim().equals(Brand.toUpperCase().trim())) {
					itemsnew.add(item);
					//System.out.println(item.get("name").toString());
				} 
			
		}
		return itemsnew;
	}

	

	public JSONObject setItem(JSONObject item) {
	
		return selecteditem = item;
	}


	public JSONObject getItem() {
	
		return selecteditem;
	}
	

}
