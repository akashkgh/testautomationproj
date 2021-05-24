package practicetestcases3;

import org.testng.annotations.Test;

public class TestNG10P3 {
	
	@Test(groups="Regression")
	public void a() {
		
		System.out.println("practicetestcases3 - TestNG10P3 - test method a>");
	}
	
	@Test(groups= {"Regression","sanity"})
	public void b() {
		
		System.out.println("practicetestcases3 - TestNG10P3 - test method b>");
	}
	

}
