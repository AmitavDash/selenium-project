package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_101_chromeDriver {

	

		public static void main(String args[]) throws Exception {
			System.setProperty("webdriver.chrome.driver","D:\\automation testing\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//Test case steps
			driver.get("http://localhost/orangehrm");
			driver.findElement(By.name("txtUserName")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			System.out.println("Login completed");
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("logout completed");
			driver.close();
		}

	}

