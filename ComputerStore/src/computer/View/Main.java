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
		Item i=new Item("HP","35000", "laptop is good","destop");
		//printWelcome();
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Welcome to computerstore Application!");
	    boolean valid=false;
	    SelectComputer selectObj= new SelectComputer();
		while(!valid)
		{
	    System.out.println("SELECT TYPE OF COMPUTER YOU WANT TO ORDER");
		selectObj.printTypes();
		String selection = scanner.nextLine();
		if(selection.toUpperCase().trim().equals("TYPE"))
		{
			System.out.println("Please enter the type :");
			String userType = scanner.nextLine();
		    if(selectObj.selectType(userType))
		    {
		    	System.out.println("THE BRANDS AVAILABLE ARE:");
		    valid=true;
		    }else{
		    	System.out.println("enter valid Type");
		    }
		}
		}
		//s.selectType("Desktop");
		
		
		//s.selectModel("HP");
		//s.getDetails("HP model1");
		}
		
		/*JSONReader readObj = new JSONReader();
        readObj.reader();
        JSONWriter jsonObj = new JSONWriter();
        jsonObj.jsonwrite();*/

	}
	
