package main;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;





public class Main {
	@FindBy(id="")
	public static WebDriver loginButton;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(" Current title :"+driver.getCurrentUrl() +" Current title :"+driver.getTitle() );
	}

}
