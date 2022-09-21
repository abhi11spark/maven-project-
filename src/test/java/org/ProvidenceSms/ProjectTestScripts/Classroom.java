package org.ProvidenceSms.ProjectTestScripts;

public class Classroom {

	public static void main(String[] args) {
		/*
		 * WebDriver driver = null; WebDriverUtility webdriverUtility = new
		 * WebDriverUtility(); PropertyFileUtility property = new PropertyFileUtility();
		 * JavaUtility javaUtility = new JavaUtility(); ExcelUtility excel = new
		 * ExcelUtility(); excel.initializeExcel(IConstantUtility.EXCEL_PATH);
		 * property.initializePropertyFile(IConstantUtility.PROPERTY_FILE_PATH);
		 * 
		 * String url = property.getDataFromPropertyFile("url"); String adminUN =
		 * property.getDataFromPropertyFile("userName"); String adminPWD =
		 * property.getDataFromPropertyFile("password"); String browser =
		 * property.getDataFromPropertyFile("browser"); String timeout =
		 * property.getDataFromPropertyFile("timeout"); long timeouts = (Long)
		 * (javaUtility.convertStringToAnyData(timeout, DataType.LONG));
		 * 
		 * String classroomname = excel.getDataFromExcelFile("Excel", 7, 3); String
		 * scount = excel.getDataFromExcelFile("Excel", 8, 3); driver =
		 * webdriverUtility.openBrowserAndApplication(browser, timeouts, url);
		 * 
		 * driver.findElement(By.id("email")).sendKeys(adminUN);
		 * driver.findElement(By.id("password")).sendKeys(adminPWD);
		 * driver.findElement(By.id("btnSubmit")).click();
		 * 
		 * String message = driver .findElement(By.
		 * xpath("//h5[text()='Abhishek K H,']/descendant::span[text()=' Welcome back! ']"
		 * )) .getText();
		 * 
		 * if (message.equals("Welcome back!")) {
		 * System.out.println("Login is sucessfull.."); } else {
		 * System.out.println("Login is failure.."); }
		 * driver.findElement(By.xpath("//span[.='Classroom']")).click();
		 * 
		 * driver.findElement(By.xpath("//input[@id='name']")).sendKeys(classroomname);
		 * driver.findElement(By.id("student_count")).sendKeys(scount);
		 * 
		 * webdriverUtility.explicitWait(driver.findElement(By.id("btnSubmit")),
		 * timeouts); driver.findElement(By.id("btnSubmit")).click();
		 * 
		 * webdriverUtility.explicitWait(driver.findElement(By.xpath(
		 * "//a[text()='Delete']")), timeouts);
		 * driver.findElement(By.xpath("//input[@type='search']")).sendKeys(
		 * classroomname);
		 * 
		 * WebElement scroll =
		 * driver.findElement(By.xpath("//div[@id='example1_paginate']")); Point loc =
		 * scroll.getLocation(); int x = loc.getX(); int y = loc.getY();
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(" + x + "," + y + ")");
		 * 
		 * webdriverUtility.explicitWait(driver.findElement(By.xpath(
		 * "//a[text()='Delete']")), timeouts); List<WebElement> gradeList =
		 * driver.findElements(By.xpath("//table[@id='example1']/tbody/tr")); int a =
		 * gradeList.size();
		 * 
		 * String gr = driver.findElement(By.xpath("//table[@id='example1']/tbody/tr[" +
		 * (a) + "]/td[2]")).getText();
		 * 
		 * String ad = driver.findElement(By.xpath("//table[@id='example1']/tbody/tr[" +
		 * (a) + "]/td[3]")).getText();
		 * 
		 * if (classroomname.equalsIgnoreCase(gr) && ad.equalsIgnoreCase(scount)) {
		 * System.out.
		 * println("entered classroom  is updated and entered student count is updated:Test Case PASS..."
		 * );
		 * 
		 * } else { System.out.println(
		 * "entered classroom  is not updated and entered student count is not updated:Test Case FAIL..."
		 * ); }
		 * 
		 * webdriverUtility.explicitWait(driver.findElement(By.xpath(
		 * "//a[text()='Delete']")), timeouts);
		 * driver.findElement(By.xpath("//a[text()='Delete']")).click();
		 * 
		 * webdriverUtility.explicitWait(driver.findElement(By.id("btnYes")), timeouts);
		 * driver.findElement(By.id("btnYes")).click();
		 * 
		 * webdriverUtility.explicitWait( driver.findElement(By
		 * .xpath("//div[@class='navbar-custom-menu']/descendant::li[@class='dropdown user user-menu']"
		 * )), timeouts); driver.findElement( By.
		 * xpath("//div[@class='navbar-custom-menu']/descendant::li[@class='dropdown user user-menu']"
		 * )) .click();
		 * 
		 * webdriverUtility.explicitWait(driver.findElement(By.
		 * xpath("//a[text()='Sign out']")), timeouts);
		 * driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		 * driver.close();
		 */

	}

}
