package com.reports;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Nanda
 * @date 10-09-2022
 * @description Used to display all the classification and configuration in the report file
 *  
 */
public class Reporting {
	public static void generateJvmReport(String jsonFile) {
		File file = new File("C:\\Users\\lenovo\\eclipse-workspace\\OmrBranchAdactinHotelAutomation\\target");
		Configuration configuration = new Configuration(file, "OmrBranchAdactinHotelAutomation");
		configuration.addClassifications("Os", "WIN10");
		configuration.addClassifications("Browser type", "Chrome");
		configuration.addClassifications("Version", "10.105");
		configuration.addClassifications("Sprint", "5");
		
		List<String> jsonFiless = new ArrayList<String>();
	     jsonFiless.add(jsonFile);
	     ReportBuilder builder = new ReportBuilder(jsonFiless, configuration);
	     builder.generateReports();
	}

}
