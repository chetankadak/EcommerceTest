package testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Class.browserClass;
import Pages.SelectItem;
import Pages.login;
import io.qameta.allure.Description;
import utility.JsonUtils;

public class TC_03 extends browserClass{

	@BeforeMethod
    public void setup() {
    	browsers( Browser, url);
    }
    
   
    @Test
    @Description("Verify user can order clothes and shoes")
    public void MakeAppointment() throws IOException {

    	String Username = JsonUtils.getValue("logindetails", "username");
    	String Password = JsonUtils.getValue("logindetails", "password");
    	
    	login l = new login();
    	l.textUsername(Username);
    	l.textPassword(Password);
    	l.clickLogin();
    	//l.verifyLoginSuccessful();
    	
    	SelectItem s = new SelectItem();
    	s.clickBag();
    	s.clickHeadlight();
    	s.clickTshirt();
    	s.clickAddtocart();
    	s.clickCheckout();
    	
    	String firstname = JsonUtils.getValue("deliverydetails", "Firstname");
    	String lastname = JsonUtils.getValue("deliverydetails", "Lastname");
    	String zipcode = JsonUtils.getValue("deliverydetails", "ZipCode");
    	s.textFirstName(firstname);
    	s.textLastName(lastname);
    	s.textPostalCode(zipcode);
    	s.clickContinue();
    	s.clickCancel();
    	
    	String sortprice = JsonUtils.getValue("Range", "Sortprice");
    	s.selectSort(sortprice);
    	
    	s.remove();
    	
    	s.clickAddtocart();
    	s.clickAddtocart();
    	s.clickCheckout();
    	
    	String first = JsonUtils.getValue("Checkoutdetails1", "Firstname");
    	String last = JsonUtils.getValue("Checkoutdetails1", "Lastname");
    	String pincode = JsonUtils.getValue("Checkoutdetails1", "ZipCode");
    	s.textFirstName(first);
    	s.textLastName(last);
    	s.textPostalCode(pincode);
    	s.clickContinue();
    	//s.RequiredDetails();
    	s.clickFinish();
    	s.clickgenpdf();
    	
    }
    
    @AfterMethod
    public void close() {
    	browserQuit();
    }
}
