package computer.View;

import computer.Controller.SelectComputer;
import computer.Model.JSONWriter;
import computer.Model.Item;
import computer.Model.JSONReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Item i=new Item("HP",35000, "laptop is good","destop");
		//printWelcome();
		

		System.out.println();
	    System.out.println("Welcome to computerstore!");
	    System.out.println("you can find computers here.");
	    System.out.println();
	    
	    
		SelectComputer s= new SelectComputer();
		
		s.printTypes();
		s.selectType("Desktop");
		
		
		s.selectModel("HP");
		s.getDetails("HP model1");
		
		
		/*JSONReader readObj = new JSONReader();
        readObj.reader();
        JSONWriter jsonObj = new JSONWriter();
        jsonObj.jsonwrite();*/

	}
	
	public void printWelcome()
	{
	}

}
