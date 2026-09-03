package Pages;

import org.openqa.selenium.By;


import Base_Class.browserClass;

public class homePage extends browserClass{


	public static By makeAppoint = By.id("btn-make-appointment");
	
	public void clickMAppointment () {
		driver.findElement(makeAppoint).click();
	}
}
