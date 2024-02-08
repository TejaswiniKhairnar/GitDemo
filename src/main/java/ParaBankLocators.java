import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//commnit code
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	
	WebElement loginPageHeader = driver.findElement(By.id("loginPanel"));
	
	WebElement userName = driver.findElement(By.name("username"));
	WebElement userNameByXpath = driver.findElement(By.xpath("//input[@name='username' and @class='input']"));
	
	WebElement password = driver.findElement(By.name("password"));
	WebElement passwordByXpath = driver.findElement(By.xpath("//input[@name='password' and @class='input']"));
	
	
	WebElement submit = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
	
	/*
	 * userNameByXpath.sendKeys("john"); passwordByXpath.sendKeys("demo");
	 * submit.click();
	 */
	
	userName.sendKeys("john");
	password.sendKeys("demo");
	submit.click();
	
	WebElement solutions = driver.findElement(By.className("Solutions"));
	
	WebElement aboutUs = driver.findElement(By.linkText("About Us"));
	
	

	}

}
