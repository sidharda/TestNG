package org.testngparam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParam {
WebDriver driver;
	
	@BeforeTest
	public void testInitialaization(){
		System.setProperty("webdriver.chrome.driver", "../TestNG/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	@Parameters({"username","password"})
	@Test
	public void verifylogin(String username, String password){
		driver.get("http://training.openspan.com/login");
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("login_button")).click();
	}
	
}




