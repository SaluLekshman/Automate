package com.obsqura.automationcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	public  WebDriver driver;
	public void initialiseBrowser()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHALU\\eclipse workspace\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SHALU\\eclipse workspace\\AutomationCourse\\src\\main\\java\\Resources\\msedgedriver.exe");
		 driver=new EdgeDriver();
	     driver.get("https://www.amazon.in");
	}
	public static void main(String args[])
	{
		Base b=new Base();
		b.initialiseBrowser();
	}
}
