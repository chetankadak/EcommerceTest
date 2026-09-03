package methods;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base_Class.browserClass;

public class commonMethods extends browserClass{

	public static void dropdown(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}
	
	public static void selectCheckbox(WebElement checkbox) {
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
	}
	
	public static void jsexecutor(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}
	
//	public static void screenshot() throws IOException {
//		TakesScreenshot tc = (TakesScreenshot) driver;
//		File src = tc.getScreenshotAs(OutputType.FILE);
//		File dest = new File("/home/altius/Pictures/Screenshots" + System.currentTimeMillis() + ".png");
//		FileUtils.copyFile(src, dest);
//	}
	
	public static void clickRadio(By locator, String text) {
		List<WebElement> radiobuttons = driver.findElements(locator);
		System.out.println(radiobuttons.size());
		for(int i=0; i<=radiobuttons.size()-1; i++) {
			
			if(text.equals(radiobuttons.get(i).getAttribute("value"))) {
				radiobuttons.get(i).click();
			}
		}
	}
	
}
