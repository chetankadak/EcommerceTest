package utility;


	import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

	public class ExtentReportManager {
		public static ExtentSparkReporter sparkReporter;
	    public static ExtentReports extent;
	    public static ExtentTest test;

	    public static void setExtent() {
	        
	    	    String reportname = "Test-Execution-Report" + ".html";
	            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output-ExtentReport/" + reportname);
	            sparkReporter.config().setTheme(Theme.DARK);
	            sparkReporter.config().setDocumentTitle("Automation Test Report");
	            sparkReporter.config().setReportName("Execution Results");

	            extent = new ExtentReports();
	            extent.attachReporter(sparkReporter);
	            extent.setSystemInfo("Environment", "QA");
	        
	    }
	

}
