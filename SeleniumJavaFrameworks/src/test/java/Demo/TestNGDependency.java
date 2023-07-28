package Demo;

import org.testng.annotations.Test;

public class TestNGDependency {

	@Test(dependsOnMethods = {"test2"},priority = 1)
	public void test1() {
		System.out.println("in test 1");
	}
	

	@Test(priority = 2)
	public void test2() {
		System.out.println("in test 2");
	}
	
	@Test(dependsOnGroups = {"testRun"})
	public void test3() {
		System.out.println("in test 3");
	}
	
	@Test(groups = {"testRun"},dependsOnMethods = {"test5"})
	public void test4() {
		System.out.println("in test 4");
	}
	@Test(groups = {"testRun"})
	public void test5() {
		System.out.println("in test 5");
	}
}
