package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetry {

	@Test
	public void test1() {
		System.out.println("test 1 running");
	}

	@Test(retryAnalyzer = Listener.TestNGMyRetry.class)

	public void test2() {
		System.out.println("test 2 running");
		Assert.assertTrue(false);
	}

}
