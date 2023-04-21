package com.docker.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EdgeTest3 {

	public void test1() {
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName("edge");
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
			driver.get("https://www.youtube.com");
			driver.manage().window().maximize();
			System.out.println("Title of the page in chrome - " + driver.getTitle());
			driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
