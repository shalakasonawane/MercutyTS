package com.module;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utility.Launch;

public class TestngLaunch {
	
	@Parameters({"url","waittime"})
	
  @Test
  public void executeLaunch(String urlname,int time) throws IOException {
	  Launch l=new Launch();
	 
	  l.Openbrowser();
	  l.enterApplicationUrl(urlname);
	  l.maximizebrowser();
	  l.pageloadwait(time);
  }
}
