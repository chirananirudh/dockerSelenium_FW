package com.docker.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FireFoxTest2 {
	@Test
	public void test2() {
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName("firefox");
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
			driver.get("https://google.co.in");
			driver.manage().window().maximize();
			System.out.println("Title of the page in firefox- " + driver.getTitle());
			driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
