package testng;

import org.testng.annotations.Test;


public class testng1 {

	@Test
	public void firsttestcase()
	{
		System.out.println("Hello TestNG, This is our first test case. By using test annotation we can define test case");
		
	}
	
	@Test
	public void secondtestcase() {
		
		System.out.println("This is the second test case. TestNG will automatically give numbering by order wise by following the test casess first test case we an write as many as test cases in testNG using the annotations attest");
	}
	
	
	
	
}
