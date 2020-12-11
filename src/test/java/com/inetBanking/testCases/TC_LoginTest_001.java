package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
   @Test
   public void loginTest() throws IOException
   {
	 
	 
	logger.info("url is oppened");;
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("enter username");
	lp.setPassword(password);
	logger.info("enter password");
	lp.clickSubmit();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage12"))
	{
		
		Assert.assertTrue(true);
		logger.info("login test passed");
		
    }
	else
	{
		captureScreen(driver,"loginTest");
		Assert.assertTrue(false);
		logger.info("log in test failed");
	}
   }
}