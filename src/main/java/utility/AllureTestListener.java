package utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Allure;

public class AllureTestListener implements ITestListener{

	
	public void onTestStart(ITestResult result) {
		

		
//		String timestamp = LocalDateTime.now()
//	            .format(DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss"));
//
//	    String fileName = "allure-results/" + timestamp + ".txt";
//
//	    try {
//
//	        File folder = new File("allure-results");
//
//	        if (!folder.exists()) {
//	            folder.mkdirs();
//	        }
//
//	        File file = new File(fileName);
//
//	        FileWriter writer = new FileWriter(file);
//
//	        writer.write(
//	                "Test Case: "
//	                + result.getMethod().getMethodName()
//	                + System.lineSeparator()
//	                + "Execution Time: "
//	                + timestamp
//	        );
//
//	        writer.close();
//
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	    }
		
		
		System.out.println("Result started" + result.getName());
	}

	
	public void onTestSuccess(ITestResult result) {

		
		
		System.out.println("Result Success" + result.getName());
	}

	
	public void onTestFailure(ITestResult result) {

		   System.out.println("Test Failed: " + result.getName());

		   try {

			    String screenshotPath = Screenshot.screenshot();

			    System.out.println("Screenshot saved at: " + screenshotPath);

			    try (FileInputStream screenshot =
			                 new FileInputStream(screenshotPath)) {

			        Allure.addAttachment(
			                "Failure Screenshot",
			                screenshot
			        );
			    }

			} catch (Exception e) {

			    System.out.println(
			            "Unable to attach screenshot: " + e.getMessage()
			    );
			}
	}

	
	public void onTestSkipped(ITestResult result) {

		
		System.out.println("Result skipped" + result.getName());
	}

	
	}
