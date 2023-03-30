package com.curademo.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Curademotest {
	
	@Test
	public void testGoalSetter() {
		
		//open browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        
        //open url
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        
        
        String Actualtitle = driver.getTitle();
        System.out.println(Actualtitle);
        String ExpectedTitle = "CURA Healthcare Service";
        Assert.assertEquals(ExpectedTitle, Actualtitle);
        
        //navigate homepage
        //a[@id='menu-toggle']
        driver.findElement(By.xpath("//a[@id='menu-toggle']")).click();
        driver.findElement(By.xpath("//a[@href='profile.php#login']")).click();
        
        //input username
        driver.findElement(By.xpath("//input[@id=\"txt-username\"]")).sendKeys("John Doe");
        
        //input password
        driver.findElement(By.xpath("//input[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");
        
        //click login
        driver.findElement(By.xpath("//button[@id='btn-login']")).click();
        
        //input visitdate
        driver.findElement(By.xpath("//input[@id=\"txt_visit_date\"]")).sendKeys("31/03/2023");
        
        //input comment
        driver.findElement(By.xpath("//textarea[@id=\"txt_comment\"]")).sendKeys("Sample comment only.");
        
        //click Book Appointment 
        driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
        
        
        //driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("123@email.com");
        //driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123");
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        
        
        
        
        //driver.close();
        
        
	}

}
