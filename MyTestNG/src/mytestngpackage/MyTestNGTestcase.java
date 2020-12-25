package mytestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class MyTestNGTestcase {
	
	public String baseUrl = "https://www.google.ca/";
	String driverPath = "C:\\Users\\Ramesh\\Downloads\\chromedriver\\chromedriver.exe";
	
	public WebDriver driver;
	
	@BeforeTest
	 public void launchBrowser() {
		System.out.println("Launching Chrome Bowser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	
  @Test
  public void verifyHomepageTitle() {
	  System.out.println("Verify Home Page");
	  String expectedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	}
  
  @AfterTest
   public void closeBroswer() {
	  driver.close();
  }
   
}
