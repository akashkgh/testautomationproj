package practicetestcases3;

import java.util.Date;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG9P3 {
	
	Date d = new Date();
	
	@Test
	public void c() {
		
		System.out.println("practicetestcases3 - TestNG9P3 - test method c	"+d);
	}

	@BeforeTest
	public void d() {
		
		System.out.println("practicetestcases3 - TestNG9P3 - test method d	"+d);
	}

}
