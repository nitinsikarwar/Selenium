package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testSeleNium {
	  @Test
	    public void verifyAddition() {
		  WebDriverManager.chromedriver().setup();
			WebDriver  driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			System.out.println(" Current title :"+driver.getCurrentUrl() +" Current title :"+driver.getTitle() );
		
	        int a = 2;
	        int b = 3;

	        int result = a + b;

	        System.out.println("Running Sample Test");

	        Assert.assertEquals(result,5);
	    }

}
