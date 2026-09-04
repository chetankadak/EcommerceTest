package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base_Class.browserClass;
import methods.commonMethods;

public class SelectItem extends browserClass{

	
	public static By bag = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	public static By headlight = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	public static By tshirt = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
	public static By addtocart = By.xpath("//a[@class='shopping_cart_link']");
	public static By checkout = By.id("checkout");
	public static By firstname = By.id("first-name");
	public static By lastname = By.id("last-name");
	public static By pincode = By.id("postal-code");
	public static By cont = By.id("continue");
	public static By cancel = By.id("cancel");
	public static By sort = By.tagName("select");
	public static By removebagpack = By.xpath("//button[@name='remove-sauce-labs-backpack']");
	public static By finish = By.id("finish");
	public static By generatepdf = By.id("generate-pdf-order");
	
	
	public void clickBag() {
		driver.findElement(bag).click();
	}
	
	public void clickHeadlight() {
		driver.findElement(headlight).click();
	}
	
	public void clickTshirt() {
		driver.findElement(tshirt).click();
	}
	
	public void clickAddtocart() {
		driver.findElement(addtocart).click();
	}
	
	public void clickCheckout() {
		driver.findElement(checkout).click();
	}
	
	public void textFirstName(String text) {
		driver.findElement(firstname).sendKeys(text);
	}
	
	public void textLastName(String text) {
		driver.findElement(lastname).sendKeys(text);
	}
	
	public void textPostalCode(String text) {
		driver.findElement(pincode).sendKeys(text);
	}
	
	public void clickContinue() {
		driver.findElement(cont).click();
	}
	
//	public void RequiredDetails() {
//
//		By errorMessage = By.xpath("//h3[contains(text(),'First Name')]");
//
//	    if (driver.findElements(errorMessage).size() > 0) {
//
//	        String message = driver.findElement(errorMessage).getText();
//
//	        Assert.fail("Required failed: " + message);
//	    }
//	    System.out.println("successfull");
//    }
	
	public void clickCancel() {
		driver.findElement(cancel).click();
	}
	
	public void selectSort(String value) {
		WebElement web = driver.findElement(sort);
		commonMethods.dropdown(web, value);
	}
	
	public void remove() {
		driver.findElement(removebagpack).click();
	}
	
	public void clickFinish() {
		driver.findElement(finish).click();
	}
	
	public void clickgenpdf() {
		driver.findElement(generatepdf).click();
	}
}
