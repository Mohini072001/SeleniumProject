package com.xyzBank;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BankManagerLogin extends BaseClass {
	@Test
	public void addCustomer()
	{
		driver.findElement(By.xpath(".//button[text()='Bank Manager Login']")).click();
		driver.findElement(By.xpath(".//button[@class='btn btn-lg tab'][1]")).click();
		driver.findElement(By.xpath(".//input[@ng-model='fName']")).sendKeys("student");
		driver.findElement(By.xpath(".//input[@ng-model='lName']")).sendKeys("admin");
		driver.findElement(By.xpath(".//input[@ng-model='postCd']")).sendKeys("411028");
		driver.findElement(By.xpath(".//button[text()='Add Customer']")).click();
		  Alert a = driver.switchTo().alert();
          a.accept();
		
	}
	@Test(priority = 2)
	public void addCurrency()
	{
		driver.findElement(By.xpath(".//button[text()='Bank Manager Login']")).click();
				driver.findElement(By.xpath("//button[normalize-space()='Open Account']")).click();
				WebElement add_Cust =driver.findElement(By.xpath("//select[@id='userSelect']"));
				Select s= new Select(add_Cust);
				s.selectByVisibleText("Harry Potter");
				
				WebElement Currency =driver.findElement(By.xpath("//select[@id='currency']"));
				Select select= new Select(Currency);
				select.selectByVisibleText("Dollar");
				
		
		
	    driver.findElement(By.xpath(".//button[@type='submit']")).click();
	    Alert a = driver.switchTo().alert();
	    a.accept();
	   
	}
	@Test(priority = 3)
	public void loginPage_02() throws InterruptedException
	{
		driver.findElement(By.xpath(".//button[text()='Bank Manager Login']")).click();
		  Thread.sleep(8000);
				WebElement ent = driver.findElement(By.xpath(".//button[contains(text(),'Customers')]"));
			   

			    ent.click();
			    Thread.sleep(3000);
	    WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Search Customer']"));
		  Thread.sleep(3000);
	    ele.sendKeys(Keys.ENTER);
	    Thread.sleep(4000);
	    ele.sendKeys("harry");
	    Thread.sleep(4000);
	    ele.sendKeys(Keys.ENTER);
	   
	}

}
