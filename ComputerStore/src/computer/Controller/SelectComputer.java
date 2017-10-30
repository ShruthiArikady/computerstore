package computer.Controller;

//import java.util.ArrayList;
//import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import computer.Model.Item;
import computer.Model.Item.Type;
import computer.Model.JSONReader;

public class SelectComputer {

	private JSONArray items;

	public SelectComputer() {

		// Iterate over item array
		//Iterate over item array

		JSONReader readData = new JSONReader();

		items = readData.readFile();

	}

	public void printTypes() {

		for (Type t : Item.Type.values()) {

			System.out.println(t.toString());
		}

	}

	public void selectType(String Type) {
        boolean flag=false;
       
		for (Object itemObject : items) {

			JSONObject item = (JSONObject) itemObject;
			 while(!flag)
		        {
			if (item.get("type").equals(Type.toUpperCase().trim()))
		      System.out.println(item.get("brand").toString());
			flag=true;
			}
			 if(flag)
			System.out.println("enter valid Type");
        }
	}

	public void selectModel(String Brand) {
		boolean flag=false;
		for (Object itemObject : items) {

			JSONObject item = (JSONObject) itemObject;
			 while(!flag)
		        {
			if (item.get("brand").equals(Brand))

				System.out.println(item.get("name").toString());
			    flag=true;
				}
			 if(flag)
					System.out.println("enter valid Brand");
		}

	}

	public void getDetails(String modelName) {
		for (Object itemObject : items) {

			JSONObject item = (JSONObject) itemObject;

			if (item.get("name").equals(modelName))

				System.out.println("The Selected Item Name is :"+ item.get("name").toString());
			System.out.println("The Selected Item Cost is :"+item.get("cost").toString());
			System.out.println("The Selected Item Description is :"+item.get("description").toString());
		}

	}
}
