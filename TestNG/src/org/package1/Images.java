package org.package1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Images {
	static WebDriver driver;

	@BeforeTest
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "../TestNG/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

	}

	@Test(priority = 1)
	public static void verifyAppleImages() {
		WebElement ele = driver.findElement(By.name("q"));
		// ele.clear();
		ele.sendKeys("apple");
		ele.submit();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//a[@class='hide-focus-ring'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='iphone']")).click();
		driver.findElement(By.xpath("(//span[text()='iphone 6s (128GB) Import with Warranty (Color: Space Grey)[1]']")).click();
		String mainwindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		for (String childwindow : windows) {
			if (!mainwindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				String title = driver.getTitle();
				System.out.println(title);
				driver.switchTo().window(childwindow);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
		WebElement ele1=driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[1]"));
		Actions actions1=new Actions(driver);
		actions1.moveToElement(ele1).build().perform();
		WebElement ele2=driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[2]"));
		Actions actions2=new Actions(driver);
		actions2.moveToElement(ele2).build().perform();
		WebElement ele3=driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[3]"));
		Actions actions3=new Actions(driver);
		actions3.moveToElement(ele3).build().perform();
		WebElement ele4=driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[4]"));
		Actions actions4=new Actions(driver);
		actions4.moveToElement(ele4).build().perform();
		WebElement ele5=driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[5]"));
		Actions actions5=new Actions(driver);
		actions5.moveToElement(ele5).build().perform();
		
			}
		}

	}

}
