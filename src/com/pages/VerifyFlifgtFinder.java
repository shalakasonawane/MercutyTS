package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.model.Config;

public class VerifyFlifgtFinder {
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objff;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objsignoff;
	
	public void verifyflightfinder()
	{
		boolean flag=objff.isDisplayed();
		if(flag==true)
		{
			System.out.println("FlightFinder image is displayed :");
		}
	}
	
	public void clickonSignoff()
	{
		objsignoff.click();
	}
	
	
	public void loadPageff()
	{
		PageFactory.initElements(Config.driver, this);
	}

}
