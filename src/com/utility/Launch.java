package com.utility;
import com.pages.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.model.Config;



public class Launch {
	
	Properties prop=new Properties();
	public void Openbrowser() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\selenium2019\\PageObjectModelDemo\\config.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeexepath"));
		Config.driver=new ChromeDriver();
	}
	
	public void enterApplicationUrl(String url)
	{
		Config.driver.get(url);
	}
	
	public void maximizebrowser()
	{
		Config.driver.manage().window().maximize();
	}
	
	public void pageloadwait(int time)
	{
		Config.driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		Launch l=new Launch();
		l.Openbrowser();
		l.enterApplicationUrl("http://newtours.demoaut.com/");
		l.maximizebrowser();
		l.pageloadwait(10);
		
		Login l1=new Login();
		l1.pageload();
		l1.EnterUsername("Suvidyap1");
		l1.enterPassword("P@ssword1");
		l1.clickonLogin();
		
		VerifyFlifgtFinder vf=new VerifyFlifgtFinder();
		vf.loadPageff();
		vf.verifyflightfinder();
		vf.clickonSignoff();
	}

}
