package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
	
	@Test
	@Parameters({"Myname","Surname"})
	public void test1(@Optional("Neeno") String Myname, String Surname) {
		System.out.println("My name is "+ Myname+ " : "+ Surname);
	}

}
