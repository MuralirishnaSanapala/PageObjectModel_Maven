package com.w2a.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.w2a.base.Page;

public class LoginPage extends Page{
	
	public ZohoAppPage doLogin(String username, String password){
		//driver.switchTo().frame("zohoiam");
		type("email_CSS", username);
		type("password_CSS",password);
		click("signbtn_CSS");
		return new ZohoAppPage();
	} 
}
