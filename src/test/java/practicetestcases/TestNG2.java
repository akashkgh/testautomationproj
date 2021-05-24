package practicetestcases;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG2 {
	
	Date d = new Date();
	
	@Test
	public void a2() {
				
		System.out.println("practicetestcases - TESNG2 - test method a2	"+d);
	}
	
	@BeforeClass
	public void b2() {
		
		System.out.println("practicetestcases - TESNG2 - test method b2	"+d);
	}

	@Test(groups="smoke")
	public void c2() {
		
		System.out.println("practicetestcases - TESNG2 - test method c2	"+d);
	}
	
	@AfterClass(groups="smoke")
	public void e2() {
		
		System.out.println("practicetestcases - TESNG2 - test method e2	"+d);
		
	}

	
}
