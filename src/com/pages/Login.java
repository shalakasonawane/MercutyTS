package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.model.Config;

public class Login {
	

	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusername;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objPassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objLogin;
	
	public void EnterUsername(String username)
	{
		objusername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		objPassword.sendKeys(password);
	}
	
	public void clickonLogin()
	{
		objLogin.click();
	}
	public void pageload()
	{
		PageFactory.initElements(Config.driver, this);
	}
}
