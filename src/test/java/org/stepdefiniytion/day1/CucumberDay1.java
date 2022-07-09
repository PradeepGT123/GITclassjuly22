package org.stepdefiniytion.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CucumberDay1 {

	WebDriver driver;
	
	@Given("User is on the adactinhotel page")
	public void a() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}

	@When("User should enter username & password")
	public void b() {
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("PradeepGT");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Pradeep@123");
	}

	@When("User should click login button")
	public void c() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

	@Then("User should verify success message")
	public void d() {
		String title = driver.getTitle();
		Assert.assertTrue("Verify Title",title.contains("Hotel Reservation"));
		
	}

	
}
