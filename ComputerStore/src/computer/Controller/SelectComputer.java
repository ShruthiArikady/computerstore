package computer.Controller;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import computer.Model.Item;
import computer.Model.Item.Type;
import computer.Model.JSONReader;

public class SelectComputer {

	private JSONArray items;

	public SelectComputer() {

		// Iterate over item array

		JSONReader readData = new JSONReader();

		items = readData.readFile();

	}

	public void printTypes() {

		for (Type t : Item.Type.values()) {

			System.out.println(t.toString());
		}

	}

	public void selectType(String Type) {

		for (Object itemObject : items) {

			JSONObject item = (JSONObject) itemObject;

			if (item.get("type").equals(Type.toUpperCase().trim()))

				System.out.println(item.get("brand").toString());
		}

	}

	public void selectModel(String Brand) {

		for (Object itemObject : items) {

			JSONObject item = (JSONObject) itemObject;

			if (item.get("brand").equals(Brand))

				System.out.println(item.get("name").toString());
		}

	}

	public void getDetails(String modelName) {
		for (Object itemObject : items) {

			JSONObject item = (JSONObject) itemObject;

			if (item.get("name").equals(modelName))

				System.out.println("The Selected Item Name is :"+ item.get("name").toString());
			System.out.println("The Selected Item Cost is :"+item.get("cost").toString());
			System.out.println("The Selected Item Descrition is :"+item.get("description").toString());
		}

	}
}
