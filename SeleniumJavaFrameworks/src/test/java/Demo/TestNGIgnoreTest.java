package Demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

 @Ignore
public class TestNGIgnoreTest {
	
	@Test
	@Ignore
	public void test1() {
		System.out.println("in test1");
	}
	
	@Test
	public void test2() {
		System.out.println("in test 2");
	}

}
