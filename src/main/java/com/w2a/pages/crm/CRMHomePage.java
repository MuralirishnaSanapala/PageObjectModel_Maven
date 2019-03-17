package com.w2a.pages.crm;

import org.openqa.selenium.By;

import com.mysql.cj.jdbc.Driver;
import com.w2a.base.Page;

public class CRMHomePage extends Page{
	public void verifyTextCRMHome(){
		
	}
	public void verifyAddSampleDataBtn(){
		driver.findElement(By.cssSelector("#orgName")).sendKeys("infosys");
		driver.findElement(By.cssSelector("#orgPhone")).sendKeys("+919441010901");
		driver.findElement(By.cssSelector("#profileDetailBtn2")).click();
	}
}
