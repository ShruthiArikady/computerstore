package computer.View;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import computer.Controller.SelectComputer;
import computer.Model.Item;
import computer.Model.JSONReader;

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
		// s.selectType("Desktop");

		// s.selectModel("HP");
		// s.getDetails("HP model1");
	}

	/*
	 * JSONReader readObj = new JSONReader(); readObj.reader(); JSONWriter
	 * jsonObj = new JSONWriter(); jsonObj.jsonwrite();
	 */

}
