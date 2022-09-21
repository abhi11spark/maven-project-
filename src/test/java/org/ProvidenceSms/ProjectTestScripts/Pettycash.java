package org.ProvidenceSms.ProjectTestScripts;

public class Pettycash {

	public static void main(String[] args) {
		// WebDriver driver = null;
//		WebDriverUtility webdriverUtility = new WebDriverUtility();
//		PropertyFileUtility property = new PropertyFileUtility();
//		JavaUtility javaUtility = new JavaUtility();
//		ExcelUtility excel = new ExcelUtility();
//		excel.initializeExcel(IConstantUtility.EXCEL_PATH);
//		property.initializePropertyFile(ICo.PROPERTY_FILE_PATH);
//		String url = property.getDataFromPropertyFile("url");
//		String browser = property.getDataFromPropertyFile("browser");
//		String timeout = property.getDataFromPropertyFile("timeout");
//		long timeouts = (Long) (javaUtility.convertStringToAnyData(timeout,DataType.LONG));
//		
//		driver = webdriverUtility.openBrowserAndApplication(browser,timeouts,url);
//		testyantra
//
//		String teacherUN = property.getDataFromPropertyFile("Teacher_UN2");
//		String teacherPWD = property.getDataFromPropertyFile("Teacher_PWD2");
//		driver.findElement(By.id("email")).sendKeys(teacherUN);
//		driver.findElement(By.id("password")).sendKeys(teacherPWD);
//		driver.findElement(By.id("btnSubmit")).click();
//				
//		driver.findElement(By.xpath("//span[.='My Petty Cash']")).click();
//		driver.findElement(By.xpath("//a[.='Add ']")).click();
//		
//		String pettyCashDescription =excel.getDataFromExcelFile("TestData", 12,3);
//		String amount = excel.getDataFromExcelFile("TestData", 13,3);
//		
//		driver.findElement(By.xpath("//input[@id='textDesc_1']")).sendKeys(pettyCashDescription);
//		driver.findElement(By.id("textAmount_1")).sendKeys(amount);
//		driver.findElement(By.id("btnSubmit")).click();
//		javaUtility.robotClass();
//		driver.findElement(By.xpath("//span[.='Srivalli']")).click();
//		driver.findElement(By.xpath("//a[.='Sign out']")).click();
//		
//		String adminLogin = property.getDataFromPropertyFile("Admin_UN");
//		String adminPassword = property.getDataFromPropertyFile("Admin_PWD");
//		driver.findElement(By.id("email")).sendKeys(adminLogin);
//		driver.findElement(By.id("password")).sendKeys(adminPassword);
//		driver.findElement(By.id("btnSubmit")).click();
//		
//		driver.findElement(By.xpath("//span[.='Petty Cash']")).click();
//		
//		String teacherName = excel.getDataFromExcelFile("TestData", 14,3);
//		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(teacherName);
//		
//		
//		List<WebElement> pettyCashList = driver.findElements(By.xpath("//table[@id='example1']/tbody/tr"));
//		int last = pettyCashList.size();
//		
//		for(int i = 0;i<last;i++)
//		{
//			String receivedByName = driver.findElement(By.xpath("//table[@id='example1']/tbody/tr["+(i+1)+"]/td[2]")).getText();
//			String paidStatus = driver.findElement(By.xpath("//table[@id='example1']/tbody/tr["+(i+1)+"]/td[6]")).getText();
//			if(receivedByName.equals(teacherName) && paidStatus.equals("Pending"))
//			{
//				driver.findElement(By.xpath("//table[@id='example1']/tbody/tr["+(i+1)+"]/td[7]/a[.='Approve']")).click();
//				excel.writeToExcel("TestData", 12, 4, "Pass");
//				System.out.println("TC Pass");
//				driver.findElement(By.xpath("//a[@id='btnYesApprove']")).click();
//				break;
//			}
//			else if(i == last-1)
//			{
//				excel.writeToExcel("TestData", 12, 4, "Fail");
//				System.out.println("TC Fail");
//			}
//		}
//		
//		driver.findElement(By.xpath("//span[.='Abhishek K H']")).click();
//		driver.findElement(By.xpath("//a[.='Sign out']")).click();
//		
//		excel.closeExcelWorkbook();
//		webdriverUtility.closeDriver();
//		
//	}	

	}

}
