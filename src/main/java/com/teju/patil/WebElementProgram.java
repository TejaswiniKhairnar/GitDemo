
package com.teju.patil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementProgram {

	static WebDriver driver = null;
//commint code
	public static void main(String[] args) {
//                1. Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();

//                2. Maximize the Browser window
		driver.manage().window().maximize();

//                3. Launch the Application  { URL = https://opensource-demo.orangehrmlive.com/ }
		driver.get("https://opensource-demo.orangehrmlive.com/&quote");

//                4. Verify Application Login Page title { Expected Result =OrangeHRM }
		String actualTitle = driver.getTitle();
		if (actualTitle.equals("OrangeHRM"))
			System.out.println("Title is matching");
		else
			System.out.println("Title is not matching");

//                5. Verify Login Page Header Text  { Expected Header = LOGIN Panel }
		WebElement loginPageHeader = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
		String actalHeader = loginPageHeader.getText();
		if (actalHeader.equals("LOGIN Panel"))
			System.out.println("Loginpage Header is matching");
		else
			System.out.println("Loginpage Header is not matching");

//                6. Verify Username and Password text boxes
		WebElement usernameTxtbox = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement passwordTxtbox = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		if (usernameTxtbox.isDisplayed() && usernameTxtbox.isEnabled() && passwordTxtbox.isDisplayed()
				&& passwordTxtbox.isEnabled())
			System.out.println("Username and Password textboxes are working");
		else
			System.out.println("Username and Password textboxes are not working");

//                7. Enter Username and Password  {admin , admin123 }
		usernameTxtbox.clear();
		usernameTxtbox.sendKeys("admin");

		passwordTxtbox.clear();
		passwordTxtbox.sendKeys("admin123");

//                8. Click on Sign-In Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginButton.click();

//                9. Click on Admin Menu Button
//                10. Select option from User Role Dropdown { ESS }
//                11. Select All Users Checkbox
//                12. Print all values from the Web Table
//                12. Navigate to Workshifts Url  { URL = https://opensource-demo.orangehrmlive.com/index.php/admin/workShift }
//                13. Click on 'Add' shift button
//                14. Select Multiple Employees from Avalable Employees Multi Select Dropdown
//                15. Click on My Info Men Button
//                16. Click on 'Edit' Personal Details Button
//                17. Select gender as 'Female'
//                18. Navigate to Google Page  { URL = https://google.com/ }
//                19. Verify Google 'Images' Link { Expected Link = https://www.google.co.in/imghp?hl=en&ogbl}
//                20. Close Bowser

	}

}
