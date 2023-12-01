package com.actitime2.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime2.generic.BaseClass;
import com.actitime2.pom.HomePage;
import com.actitime2.pom.TaskList;

public class ProjectModule extends BaseClass {
	@Test
	public void testCreateProject() {
		TaskList t=new TaskList(driver);
		HomePage h=new HomePage(driver);
		h.getTask().click();
		String name = t.getAllcust().getText();
		System.out.println(name);
		Reporter.log("CreateProject",true);
	}
}
