package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.w2a.base.Page;
import com.w2a.base.TopMenu;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest extends Page{

	public static void main(String[] args) {
		
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		ZohoAppPage zp = login.doLogin("smuralikrishna006@gmail.com", "Murali@123");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.findElement(By.cssSelector(".close-btn")).click();
		CRMHomePage crm = zp.gotoCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount("Raman");

	}

}
