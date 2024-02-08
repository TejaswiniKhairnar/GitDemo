package com.teju.patil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {

		// 1 .Launch the browser( browser= Chrome)
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 2.Maximize browser window
		driver.manage().window().maximize();

		// 3.Clear cookies from browser
		driver.manage().deleteAllCookies();

		// 4.Launch the application url
		String url = "https://www.google.co.in";
		driver.get(url);

		// 5.verify application title
		String title = driver.getTitle();
		if ("Google".equalsIgnoreCase(title)) {
			System.out.println("Application launched");
		} else {
			System.out.println("error while launching app");
		}

		// wait to refresh
		// driver.wait();

		// 6.refresh/reload the application
		driver.navigate().refresh();

		// 7.Navigate other application url(https://in.search.yahoo.com/)
		driver.navigate().to("https://in.search.yahoo.com/");

		// 8.Verify application title
		String newtitle = driver.getTitle();
		if (newtitle.equals("Google")) {
			System.out.println("Expected Application launched");
		} else {
			System.out.println("error while launching app");
		}

		// go back to previous site
		driver.navigate().back();

		// Move forward to new site
		driver.navigate().forward();
		// Close the browser window 2typer close n quit (for close the all windows open)
		//driver.close();

	}
}
