package Demo;

import org.testng.annotations.Test;

public class TestNGPriority {
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("in test 1()");
		System.out.println("My pri is 1");
	}
	@Test(priority = 1)
	public void test2() {
		System.out.println("in test 2()");
		System.out.println("My pri is 1");
	}
	@Test
	public void test3() {
		System.out.println("in test 3()");
		System.out.println("no prio");
	}
	@Test(priority = 0)
	public void test4() {
		System.out.println("in test 4()");
		System.out.println("My pri is 0");
	}
	@Test(priority = -1)
	public void test5() {
		System.out.println("in test 5()");
		System.out.println("My pri is -1");
	}

}
