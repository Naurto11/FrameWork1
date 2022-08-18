package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpojo extends BaseClass {

	public Loginpojo() {
		PageFactory.initElements(driver, this);

	}

	@FindAll({

			@FindBy(xpath = "//input[@type='submit']"), @FindBy(xpath = "//input[@id='nav-search-submit-button']"),
			@FindBy(xpath = "//input[@value='Go']") })

	private WebElement txtuser;

	@FindAll({ @FindBy(xpath = "//input[@id='twotabsearchtextbox']"), @FindBy(xpath = "//input[@type='text']"),
			@FindBy(xpath = "//input[@aria-label='Search']") })
	private WebElement srchbtn;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getSrchbtn() {
		return srchbtn;
	}

}
