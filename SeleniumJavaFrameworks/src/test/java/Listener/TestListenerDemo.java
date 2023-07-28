package Listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.TestNGListener.class)
public class TestListenerDemo {
	@Test
	public void test1() {
		System.out.println("we are working test1&&&");
	}
	@Test
	public void test2() {
		System.out.println("we are working test2&&&");
	}
	@Test
	public void test3() {
		System.out.println("we are working test3&&&");
	}

	

}
