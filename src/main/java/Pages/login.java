package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base_Class.browserClass;
import methods.commonMethods;

public class login extends browserClass{

	public static By username = By.id("user-name");
	public static By password = By.id("password");
	public static By login = By.id("login-button");
	
	
	
	public void textUsername(String text) {
		driver.findElement(username).sendKeys(text);
	}
	
	public void textPassword(String text) {
		driver.findElement(password).sendKeys(text);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
	public void verifyLoginSuccessful() {

		By errorMessage = By.xpath("//h3[contains(text(),'Username and')]");

	    if (driver.findElements(errorMessage).size() > 0) {

	        String message = driver.findElement(errorMessage).getText();

	        Assert.fail("Login failed: " + message);
	    }
	    System.out.println("login successfull");
    }
	
	
}
