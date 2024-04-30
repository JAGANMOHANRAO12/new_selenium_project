package datadrivenkeyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpageclass {
	public static WebDriver driver;
	public Loginpageclass(WebDriver driver) {
		Loginpageclass.driver=driver;
	}
	By username=By.name("username");
	By password=By.name("password");
	By loginBtn=By.xpath("//button[@type='submit']");
	public void openUrl() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	public void enterUsername(String un) {
		driver.findElement(username).sendKeys(un);
	}
	public void enterPass(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clickOnLogin() throws InterruptedException {
		driver.findElement(loginBtn).click();
		Thread.sleep(2000);
	}
}
