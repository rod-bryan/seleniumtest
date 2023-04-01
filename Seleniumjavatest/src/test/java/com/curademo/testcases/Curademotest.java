package com.curademo.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Curademotest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        
        //open url
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        String Actualtitle = driver.getTitle();
        System.out.println(Actualtitle);
        String ExpectedTitle = "CURA Healthcare Service";
        Assert.assertEquals(ExpectedTitle, Actualtitle);
           
	}
	
	
	@Test(priority = 1)
	public void testBookAppointmentOne() {
		
	
      	//navigate homepage
        driver.findElement(By.xpath("//a[@id='menu-toggle']")).click();
        driver.findElement(By.xpath("//a[@href='profile.php#login']")).click();
        
         
        //input username
        driver.findElement(By.xpath("//input[@id=\"txt-username\"]")).sendKeys("John Doe");
        
        //input password
        driver.findElement(By.xpath("//input[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");
        
        //click login
        driver.findElement(By.xpath("//button[@id='btn-login']")).click();
        
        //Facility
        //driver.findElement(By.xpath("//select[@id='combo_facility']")).click();
        //driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']")).click();
        
        // Select Facility 
        WebElement selectElementBryanSteph = driver.findElement(By.xpath("//select[@id='combo_facility']")); 
        Select selectFacilty = new Select(selectElementBryanSteph); 
        
        selectFacilty.selectByValue("Tokyo CURA Healthcare Center"); 
        
        
        //readmission
        driver.findElement(By.xpath("//label[normalize-space()='Apply for hospital readmission']")).click();
        
        //healthcare program
        driver.findElement(By.xpath("//label[normalize-space()='Medicare']")).click();
       
        
        
        //input visitdate
        driver.findElement(By.xpath("//input[@id=\"txt_visit_date\"]")).sendKeys("31/03/2023");
        
        //input comment
        driver.findElement(By.xpath("//textarea[@id=\"txt_comment\"]")).sendKeys("Sample comment only.");
        
        //click Book Appointment 
        driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
         
        	
	}
	
	
	@Test(priority = 2)
	public void testBookAppointmentTwo() {
		
	
        //click Make Appointment
        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
        
        //Facility
        //driver.findElement(By.xpath("//select[@id='combo_facility']")).click();
        //driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']")).click();
        
        // Select Facility 
        WebElement selectElementBryanSteph = driver.findElement(By.xpath("//select[@id='combo_facility']")); 
        Select selectFacilty = new Select(selectElementBryanSteph); 
                   
        selectFacilty.selectByValue("Hongkong CURA Healthcare Center"); 
     
        
        //readmission
        driver.findElement(By.xpath("//label[normalize-space()='Apply for hospital readmission']")).click();
        
        //healthcare program
        driver.findElement(By.xpath("//label[normalize-space()='Medicaid']")).click();
      
        
        
        //input visitdate
        driver.findElement(By.xpath("//input[@id=\"txt_visit_date\"]")).sendKeys("25/08/2023");
        
        //input comment
        driver.findElement(By.xpath("//textarea[@id=\"txt_comment\"]")).sendKeys("Sample comment only.");
        
        //click Book Appointment 
        driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
         	
	}
	
	@Test(priority = 3)
	public void testBookAppointmentThree() {
		
	
        //click Make Appointment
        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
        
        //Facility
        //driver.findElement(By.xpath("//select[@id='combo_facility']")).click();
        //driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']")).click();
        
        // Select Facility 
        WebElement selectElementBryanSteph = driver.findElement(By.xpath("//select[@id='combo_facility']")); 
        Select selectFacilty = new Select(selectElementBryanSteph); 
        
        selectFacilty.selectByValue("Seoul CURA Healthcare Center");
        
        //readmission
        driver.findElement(By.xpath("//label[normalize-space()='Apply for hospital readmission']")).click();
        
        //healthcare program        
        driver.findElement(By.xpath("//label[normalize-space()='None']")).click();
        
        
        //input visitdate
        driver.findElement(By.xpath("//input[@id=\"txt_visit_date\"]")).sendKeys("25/08/2023");
        
        //input comment
        driver.findElement(By.xpath("//textarea[@id=\"txt_comment\"]")).sendKeys("Sample comment only.");
        
        //click Book Appointment 
        driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();
         
   
	}
	
	@AfterTest 
	public void tearDown() { 
		driver.quit(); 
		} 
	}

