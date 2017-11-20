package computer.View;

import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import computer.Controller.Purchase;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;

//import computer.Controller.Purchase;
import computer.Controller.SelectComputer;
import computer.Exception.PriceException;
import computer.Model.Item;

//import computer.Model.JSONReader;

public class Main {
	SelectComputer selectObj;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Main obj=new Main();
		
		obj.mainloop();

	}
	
	@SuppressWarnings("unchecked")
	public void mainloop(){
		// TODO Auto-generated method stub
				Item i = new Item();
				// printWelcome();
				selectObj = new SelectComputer();
				Scanner scanner = new Scanner(System.in);
				System.out.println("Welcome to Buyify!");
				boolean valid = false;
			
				Purchase purchase = new Purchase();
				while (true) {
					System.out.println("ENTER COMPUTER TYPE OR PRESS X to EXIT ");
					selectObj.printTypes();
					String selection = scanner.nextLine();

					/** desktop*/
					if (selection.toUpperCase().trim().equals("DESKTOP")
							|| selection.toUpperCase().trim().equals("LAPTOP")) {
						System.out.println("THE BRANDS AVAILABLE ARE:");
						JSONArray brands = selectObj.selectBrand(selection);
						if (brands.size()!=0) {
							
							// print brands
							for (Object itemObject : brands) {

								JSONObject item = (JSONObject) itemObject;
								System.out.println(item.get("brand").toString());
									 
								
							}
												
							System.out.println("Enter the brand name");
							String brandname = scanner.nextLine();
							System.out.println("THE MODELS AVAILABLE ARE:");
							JSONArray branname = selectObj.selectModel(brandname);
							if (branname.size()!=0) {
								
								//print brandnames
								for (Object itemObject : branname) {

									JSONObject item = (JSONObject) itemObject;
									System.out.println(item.get("name").toString());
										
								} 

								
								System.out.println("Enter the model name");
								String modelname = scanner.nextLine();

								
								getDetails(modelname,branname,selectObj);
								
								
								valid = true;

							}
							
							
						}

						System.out.println("Enter the quantity: ");

						String quan = scanner.nextLine();

						JSONObject ordereditem = selectObj.getItem();
						ArrayList<JSONObject> it = null;
						int quantity = 0;
						try {

							
							try {
								quantity = Integer.parseInt(quan);
							} catch (Exception e) {
								throw new PriceException(
										"Invalid Quantity Exception !!");
							}

							 it = purchase.addToCart(ordereditem, quantity);
							 cartInfo(it,quantity);

							

							

						} catch (PriceException e) {
							System.out.println(e.getMessage());
						}

						System.out.println("Please Enter One Option ");
						System.out.println("B -> To Buy the Item and Generate Invoice ");
						System.out.println("R -> To Remove Item from Cart");
						System.out.println("A -> To add Item to Cart");
						String options = scanner.nextLine();

						if (options.toUpperCase().trim().equals("B")) {
							
							generateInvoice(it);

						} else if (options.toUpperCase().trim().equals("R")) {
							System.out.println("Please Enter item name to remove ");
							String removeItem = scanner.nextLine();
							purchase.removeItem(removeItem);
							
							ArrayList<JSONObject> cartitems = purchase.getCart();
							if(cartitems.size()!=0){
							cartInfo( cartitems, quantity);
							}
							else {
								System.out.println("No More Items in Cart");
							}
							
						} else if (options.toUpperCase().trim().equals("A")){
							    continue;
								
						}else{
							
							System.out.println("invalid option");
						}

					} else if (selection.toUpperCase().trim().equals("X")) {
						System.out.println("EXITED FROM COMPUTER STORE");
						break;
					} else {
						System.out.println("invalid type");
					}

				}
	}
	
	private void generateInvoice(ArrayList<JSONObject> it)
	{
		int totalPrice = 0;

		for (JSONObject itemObj : it) {

			totalPrice = (int) Double.parseDouble((String) itemObj
					.get("cost")) * ((int)itemObj
							.get("quantity"));

			System.out.println("The Ordered item is:");
            System.out.println("----------------------------------------------");
			System.out.println("Brand name:"+ itemObj.get("brand"));
			System.out.println("Type of computer is:"+ itemObj.get("type"));
			System.out.println("Unit price is:"+ itemObj.get("cost"));
			System.out.println("The quantity is:"+ itemObj.get("quantity"));
			System.out.println("----------------------------------------------");
			System.out.println("Total Cost:" + totalPrice);
           System.out.println("----------------------------------------------");
		}
	}
	
public void getDetails(String modelName, JSONArray items, SelectComputer selectObj) {
		
		
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
			
			selectObj.setItem(item);
			}
					
		}

	}

public void cartInfo(ArrayList<JSONObject> it, int quantity)
{
	int totalPrice = 0;
	for (JSONObject itemObj : it) {

		
		itemObj.put("quantity", quantity);
		
		totalPrice = (int) Double.parseDouble((String) itemObj
				.get("cost")) * (quantity);

		System.out.println("The Cart Details:");

		System.out.println("Item selected:"
				+ itemObj.get("brand") + " "
				+ itemObj.get("type"));

		System.out.println("Total Cost:" + totalPrice);
	}
}

}

/*
 * JSONReader readObj = new JSONReader(); readObj.reader(); JSONWriter jsonObj =
 * new JSONWriter(); jsonObj.jsonwrite();
 */
