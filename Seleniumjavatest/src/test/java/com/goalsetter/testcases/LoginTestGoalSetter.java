package com.goalsetter.testcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestGoalSetter {

	@Test
	public void testGoalSetter() {
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:3000/login");
        
     // Get the title and verify 'Goal setter App'

        String Actualtitle = driver.getTitle();
        System.out.println(Actualtitle);
        String ExpectedTitle = "Goalsetter App";
        Assert.assertEquals(ExpectedTitle, Actualtitle);
        
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("123@email.com");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        
        
        
        
        //driver.close();
        
        
	}
	 
}
