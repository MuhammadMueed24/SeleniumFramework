package com.project.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.project.testCases.Base;

public class ExtentReport extends Base {

	static ExtentReports extent;

	public static ExtentReports reportHandler() {

		String path = System.getProperty("user.dir") + "\\ExtentReport\\report.html";

		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Test Report");
		report.config().setDocumentTitle("Ecommerce Store");
		report.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(report);

		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("OS", "Windows");

		return extent;
	}
}
