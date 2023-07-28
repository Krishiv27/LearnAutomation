package Demo;

import org.testng.annotations.Test;

@Test(groups= {"AllTests"})
public class TestNGGrouping {

	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("running test1()");
	}
	
	@Test(groups = {"smoke","sanity"})
	public void test2() {
		System.out.println("running test2()");
	}
	
	@Test (groups = {"windows.regression"})
	public void test3() {
		System.out.println("running test3()");
	}
	
	@Test(groups = {"smoke","sanity","windows.regression"})
	public void test4() {
		System.out.println("running test4()");
	}
	
	@Test
	public void test5() {
		System.out.println("running test5()");
	}
}
