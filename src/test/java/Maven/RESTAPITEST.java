package Maven;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RESTAPITEST {

	@Test
	public void BrowserAutomation() {
		System.out.println("RestAPI testing 1st test");
	}

	@AfterTest
	public void elementsUI() {
		System.out.println("RestAPI testing 2st test");
	}
}
