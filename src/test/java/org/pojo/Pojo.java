package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {
	
	

	public Pojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement txtuser;

	@FindBy(id = "pass")
	private WebElement txtpass;

	@FindBy(name = "login")
	private WebElement clkbtn;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getClkbtn() {
		return clkbtn;
	}

}


