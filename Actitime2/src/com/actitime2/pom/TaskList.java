package com.actitime2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustbtn;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement ecustname;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesc;

	@FindBy(xpath="//div[contains(text(),'Copy Projects from an Existing Customer')]/../div[2]")
	private WebElement scustdropdown;

	@FindBy(xpath="//div[@class='searchItemList']//div[text()='Our company']")
	private WebElement ourcompbtn;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement ccbtn;

	@FindBy(xpath="//div[@class='titleContainer']/div[1]/div[1]/div[@class='title']")
	private WebElement allcust;	

	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustbtn() {
		return newcustbtn;
	}

	public WebElement getEcustname() {
		return ecustname;
	}

	public WebElement getCustdesc() {
		return custdesc;
	}

	public WebElement getScustdropdown() {
		return scustdropdown;
	}

	public WebElement getOurcompbtn() {
		return ourcompbtn;
	}
	public WebElement getCcbtn() {
		return ccbtn;
	}
	public WebElement getAllcust() {
		return allcust;
	}
}
