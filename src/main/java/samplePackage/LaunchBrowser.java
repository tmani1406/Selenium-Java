package samplePackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();

	}

}
