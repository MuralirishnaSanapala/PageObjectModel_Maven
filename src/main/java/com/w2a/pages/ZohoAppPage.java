package com.w2a.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{
	
	public void gotoAllApps(){
		driver.findElement(By.cssSelector("#all-apps")).click();
	}
	public CRMHomePage gotoCRM(){
		
		click("crmlink_CSS");
		return new CRMHomePage();
	}
	
	
}
