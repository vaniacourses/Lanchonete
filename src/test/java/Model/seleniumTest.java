package Model;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class seleniumTest {

	
	 WebDriver driver = new FirefoxDriver();
	
	@Test
	void testSiteConnection() {
		 driver.get("localhost:8080/lanchonete");

		 assertEquals("Lanchonete", driver.getTitle().toString());
	}
	
	@AfterAll
	void colse() {
		driver.close();
	}

}
