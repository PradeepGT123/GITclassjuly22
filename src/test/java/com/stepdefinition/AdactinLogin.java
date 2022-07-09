package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin {
	
	WebDriver driver;
	
	@Given("User is on the Adactinhotel page")
	public void user_is_on_the_Adactinhotel_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}

	@When("User should login using {string} and {string}")
	public void user_should_login(String name, String pass) {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(name);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(pass);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

	@When("User should search hotel {string}, {string}, {string}, {string}, {string}, {string}, {string}and {string}")
	public void user_should_search_hotel_and(String location, String hotels, String roomtype, String noofrooms, String checkin, String checkout, String adults, String childs) {
		WebElement place = driver.findElement(By.id("location"));
		place.sendKeys(location);
		WebElement hotel = driver.findElement(By.id("hotels"));
		hotel.sendKeys(hotels);
		WebElement type = driver.findElement(By.id("room_type"));
		type.sendKeys(roomtype);
		WebElement rooms = driver.findElement(By.id("room_nos"));
		rooms.sendKeys(noofrooms);
		WebElement dateIn = driver.findElement(By.id("datepick_in"));
		dateIn.sendKeys(checkin);
		WebElement dateOut = driver.findElement(By.id("datepick_out"));
		dateOut.sendKeys(checkout);
		WebElement adu = driver.findElement(By.id("adult_room"));
		adu.sendKeys(adults);
		WebElement chi = driver.findElement(By.id("child_room"));
		chi.sendKeys(childs);
	}

	@When("User should search hotel using Search")
	public void user_should_search_hotel_using_search() {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
	}

	@When("User should select hotel using Radio button and continue")
	public void user_should_select_hotel_using_Radio_button_and_continue() {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement btnCon = driver.findElement(By.id("continue"));
		btnCon.click();
	}

	@When("User should book a hotel by providing {string}, {string}, {string}, {string}, {string}, {string}, {string}and {string}")
	public void user_should_book_a_hotel_by_providing_and(String firstname, String lastname, String address, String ccno, String cctype, String month, String year, String cvv) {
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys(firstname);
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys(lastname);
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys(address);
		WebElement ccn = driver.findElement(By.id("cc_num"));
		ccn.sendKeys(ccno);		
		WebElement cct = driver.findElement(By.id("cc_type"));
		cct.sendKeys(cctype);
		WebElement mon = driver.findElement(By.id("cc_exp_month"));
		mon.sendKeys(month);
		WebElement yr = driver.findElement(By.id("cc_exp_year"));
		yr.sendKeys(year);
		WebElement pin = driver.findElement(By.id("cc_cvv"));
		pin.sendKeys(cvv);
	}

	@When("User should book hotel using Book now")
	public void user_should_book_hotel_using_Book_now() {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();		
	}
	
	@Then("User should conform booking using Order no")
	public void user_should_conform_booking_using_Order_no() throws Exception {
		Thread.sleep(5000);
		WebElement order = driver.findElement(By.id("order_no"));
		String text = order.getAttribute("value");
		System.out.println("Order no :"+text);
		
		
		System.out.println("Aunty");
	}

}
