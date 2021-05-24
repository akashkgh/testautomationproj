package practicetestcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	
	@Test (groups="smoke")
	public void a() {
		
		System.out.println("practicetestcases - TESNG1 - test method a");
	}
	
	@Test
	public void b() {
		
		System.out.println("practicetestcases - TESNG1 - test method b");
	}

	@AfterTest
	public void c() {
		
		System.out.println("practicetestcases - TESNG1 - test method c");
	}

	@Test
	public void d() {
		
		System.out.println("practicetestcases - TESNG1 - test method d");
	}

	@BeforeTest(groups="smoke")
	public void e() {
		
		System.out.println("practicetestcases - TESNG1 - test method e");
	}
	

}
