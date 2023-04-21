package com.docker.grid;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup_DockerGrid {

	@BeforeTest
	void startdg() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(50000);
	}

	@AfterTest
	void stopdg() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(5000);

		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}
}
