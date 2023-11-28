package com.xyzBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CustomerLogin extends BaseClass
{
	@Test
	public void loginPage() throws InterruptedException
	{
	 driver.findElement(By.xpath(".//button[text()='Customer Login']")).click();
	 Thread.sleep(3000);
	WebElement web = driver.findElement(By.xpath(".//select[@id='userSelect']"));
	
	Select s=new Select(web);
	s.selectByVisibleText("Harry Potter");
	 Thread.sleep(3000);

	driver.findElement(By.xpath(".//button[text()='Login']"));
	}

}
