package com.module;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pages.Login;
import com.utility.Launch;

public class TestngLogin {
	
	@Parameters({"url","waittime","username","password"})
  @Test(priority=1)
  public void Loginwithvalidds(String urlname,int time,String usernm,String passwd) throws IOException {
	  
		  Launch l=new Launch();
		l.Openbrowser();
		  l.enterApplicationUrl(urlname);
		  l.maximizebrowser();
		  l.pageloadwait(time);
		  
	  Login l1=new Login();
	  l1.pageload();
	  l1.EnterUsername(usernm);
	  l1.enterPassword(passwd);
	  
	  l1.clickonLogin();
	  
	  
  }
	
	/*@Parameters({"invalidu","invalidp"})
	@Test(priority=2)
	public void Loginwithinvalidds(String invalidusernm,String invalidpasswd)
	{
		 Login l=new Login();
		  l.pageload();
		  l.EnterUsername(invalidusernm);
		  l.enterPassword(invalidpasswd);
		  l.clickonLogin();
		
	}*/
}
