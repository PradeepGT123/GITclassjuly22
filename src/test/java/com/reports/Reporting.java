package com.reports;

import java.io.File;

import net.masterthought.cucumber.Configuration;


public class Reporting {

	private void generateJVMReport(String jsonFile) {
		
//Mention the path of jvm report where to create(store?)
		File file = new File(System.getProperty("user.dir")+"\\target");
//create the object for configuration class
		Configuration configuration = new Configuration(file, "AdactinHotelAutomation");
		
		
	}
	
}
