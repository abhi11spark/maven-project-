package org.tyss.ProvidenceSMS_Generic_Utilities;

import org.openqa.selenium.WebDriver;

public class BaseClass {
//	private LoginPage loginPage;
	private String userName;
	private String password;
	// protected CommonPage commonPage;
	protected WebDriver driver;
	protected WebDriverUtility webDriverUtility;
	protected ExcelFileUtility excelFileUtility;
	protected int randomNumber;

	/**
	 * initialize all the Utility class Open the excel and property file Read the
	 * common data Create the instance for the browser(launch browser) maximize and
	 * implicit wait open the application initialize the js executer,actions,
	 * WebDriverWait Create the instance for the common object
	 * 
	 * @throws IOException
	 */

	public void ClassSetUp() {
		// create instance for generic utility
		excelFileUtility = new ExcelFileUtility();
		PropertyFileUtility fileUtility = new PropertyFileUtility();
		JavaUtility javaUtility = new JavaUtility();
		webDriverUtility = new WebDriverUtility();

		// initialize the property file and excel file
		fileUtility.initializePropertyFile(IConstantUtility.PROPERTY_FILE_PATH);
	}

}
