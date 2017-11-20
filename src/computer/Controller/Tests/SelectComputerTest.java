package computer.Controller.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import computer.Controller.SelectComputer;



public class SelectComputerTest  {
	
	private SelectComputer selecobj;
	
	@Test
	public void selectBrandTest()
	{
		selecobj=new SelectComputer();
		assertEquals("brand does not match",selecobj.selectBrand("desktop"),true);
	}
	

}
