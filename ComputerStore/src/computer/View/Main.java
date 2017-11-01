package computer.View;

import java.util.Scanner;

import computer.Controller.Purchase;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;

//import computer.Controller.Purchase;
import computer.Controller.SelectComputer;
import computer.Model.Item;
//import computer.Model.JSONReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i = new Item();
		// printWelcome();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to computerstore Application!");
		boolean valid = false;
		SelectComputer selectObj = new SelectComputer();
		while (!valid) {
			System.out.println("SELECT TYPE OF COMPUTER YOU WANT TO ORDER");
			selectObj.printTypes();
			String selection = scanner.nextLine();
			if (selection.toUpperCase().trim().equals("DESKTOP")) {
				// System.out.println("Please enter the brand:");
				// String userType = scanner.nextLine();

				// {
				System.out.println("THE BRANDS AVAILABLE ARE:");
				if (selectObj.selectBrand(selection)) {
					System.out.println("Enter the brand name");
					String brandname = scanner.nextLine();

					
					System.out.println("THE MODELS AVAILABLE ARE:");
					
					if (selectObj.selectModel(brandname)) {
						
						System.out.println("Enter the model name");
						String modelname = scanner.nextLine();
						
						
						selectObj.getDetails(modelname);
						valid = true;
					} else {
						System.out.println("invalid modelname");
					}

				} else {
					System.out.println("invalid brand");
				}
				// valid=true;
				// }else{
				//
				// }
			} else {
				System.out.println("invalid type");
			}
		}
		Scanner scan = new Scanner(System.in);
          String keepShopping = "y";
	      Purchase purchase = new Purchase();
	      do
	          {
	    	  System.out.println("add to cart");
	            System.out.print ("Enter the name of the item: ");
	            String name = scan.next();

	            System.out.print ("Enter the unit price: ");
	            double itemPrice = scan.nextDouble();

	            System.out.print ("Enter the quantity: ");
	            int quantity = scan.nextInt();

	            // *** create a new item and add it to the cart
	            purchase.addToCart(name,itemPrice,quantity);



	            // *** print the contents of the cart object using println
	            System.out.println(purchase);

	            System.out.print ("Continue shopping (y/n)? ");
	            keepShopping = scan.next();
	          }
	      while (keepShopping.equals("y"));

	    }
		// s.selectType("Desktop");

		// s.selectModel("HP");
		// s.getDetails("HP model1");
	}

	/*
	 * JSONReader readObj = new JSONReader(); readObj.reader(); JSONWriter
	 * jsonObj = new JSONWriter(); jsonObj.jsonwrite();
	 */
