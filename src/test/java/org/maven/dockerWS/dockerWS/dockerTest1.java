package org.maven.dockerWS.dockerWS;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class dockerTest1 {

	public static void main(String[] args) {
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName("chrome");
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
			driver.get("https://google.co.in");
			driver.manage().window().maximize();
			System.out.println(" Title of the page - " + driver.getTitle());
			driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
