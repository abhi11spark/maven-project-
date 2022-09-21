package org.tyss.ProvisenceSMS_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
	@FindBy(xpath = "//span[text()='Grade']")
	private WebElement grade;
	@FindBy(xpath = "//span[text()='Classroom']")
	private WebElement classRoom;
	@FindBy(xpath = "//span[text()='Subject']")
	private WebElement subject;
	@FindBy(xpath = "//span[text()='Petty Cash']")
	private WebElement pettyCash;

	public AdminHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void AdminHomePageActions() {
		grade.click();
		classRoom.click();
		pettyCash.click();
		subject.click();

	}
}
