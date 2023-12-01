package com.actitime2.testscript;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime2.generic.BaseClass;
import com.actitime2.generic.FileLib;
import com.actitime2.pom.HomePage;
import com.actitime2.pom.TaskList;
@Listeners(com.actitime2.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage h=new HomePage(driver);
		h.getTask().click();
		TaskList t=new TaskList(driver);
		t.getAddnewbtn().click();
		t.getNewcustbtn().click();
		FileLib f=new FileLib();
		String ename = f.getExcelData("Sheet1", 1, 2);
		String desc = f.getExcelData("Sheet1", 1, 3);
		t.getEcustname().sendKeys(ename);
		t.getCustdesc().sendKeys(desc);
		t.getScustdropdown().click();
		t.getOurcompbtn().click();
		t.getCcbtn().click();
		Thread.sleep(4000);
		String aname = t.getAllcust().getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(ename,aname);
		if(ename.equals(aname)) {
			Reporter.log(aname+" customer is created",true);
		}else
			Reporter.log(aname+" customer is not created",true);
		s.assertAll();
		
	}
}
