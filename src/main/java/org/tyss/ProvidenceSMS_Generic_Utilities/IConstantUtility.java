package org.tyss.ProvidenceSMS_Generic_Utilities;

public interface IConstantUtility {
	String PROJECT_PATH = System.getProperty("user.dir");
	String EXCEL_PATH = PROJECT_PATH + "/src/test/resources/CommonData.xlsx";
	String PROPERTY_FILE_PATH = PROJECT_PATH + "/src/test/resources/commondata.properties";
	String DB_URL = "jdbc:mysql://localhost:3306/tyss";

}
