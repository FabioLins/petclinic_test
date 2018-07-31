package example;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class PetClinicTest {
  
	private WebDriver driver;
	
	@Test
	public void testPetClinic() {
	  
		driver.get("http://localhost:9090/spring-petclinic-4.2.5-SNAPSHOT/");
		  
		String title = driver.getTitle();
	
		Assert.assertTrue(title.contains("a Spring2 Framework"));
		
	}
  
	@BeforeTest
	public void beforeTest() {
	
		File file = new File("C:\\Users\\ADM\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		driver = new FirefoxDriver();
		
	}

    @AfterTest
    public void afterTest() {
    	
    	driver.quit();
    	
    }

}
