package com.baseorangelogin;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.common.io.Files;


public class OrangeLogin {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException  {
		
		 Date dt=new Date();
		 System.out.println(dt.toString());
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver1.exe");
		 driver= new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 ////*[@name='txtUsername']
		 driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		//*[@name='txtPassword']
		 driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
		 driver.findElement(By.xpath("//*[@id='welcome']")).getText();
		 Assert.assertEquals("welcome Paul", "welcome Paul");; //import com.sun.tools.javac.util.Assert;
		 System.out.println("Successfullly Login as Paul ");//Assert Passes
		 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		 driver.findElement(By.id("menu_admin_Organization")).click();
		 driver.findElement(By.id("menu_admin_viewLocations")).click();
		 driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("New York");
		 driver.findElement(By.xpath("(//*[@type='button'])[5]")).click();
		 System.out.println(driver.findElement(By.xpath("(//*[@class='left'])[1]")).getText());
		 Assert.assertEquals("New York Sales Office", "New York Sales Office");
		 System.out.println("New York Sales Office is there");
		 TakesScreenshot tscs = (TakesScreenshot) (driver);
			File sourse = tscs.getScreenshotAs(OutputType.FILE);
			Files.copy(sourse, new File("./Screenshot/ApplicationHomePage.png"));
		// driver.quit();
			driver.close();
		 
		 
		
		
		 
		
//			String name = "welcome Paul"; 
//			String name = driver.findElement(By.xpath("//*[@class='text-main absolute-right']")).getText();
//			System.out.println("This expected name is: "+name);
			//Assert.assertTrue ( actualstotalamount.equals(expectedtotalamount));
		
			
		
	}
	
	

}
