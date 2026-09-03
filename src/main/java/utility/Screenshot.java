package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base_Class.browserClass;

public class Screenshot extends browserClass{

	public static String screenshot() throws IOException {
//		TakesScreenshot tc = (TakesScreenshot) driver;
//		File src = tc.getScreenshotAs(OutputType.FILE);
//		File dest = new File("" + System.currentTimeMillis() + ".png");
//		FileUtils.copyFile(src, dest);
		
		 TakesScreenshot tc = (TakesScreenshot) driver;

		    File src = tc.getScreenshotAs(OutputType.FILE);

		    String path = System.getProperty("user.dir")
		            + "/test-output/screenshots/"
		            + System.currentTimeMillis()
		            + ".png";

		    File dest = new File(path);

		    FileUtils.copyFile(src, dest);

		    return path;
	}
}
