package datadrivenkeyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingClass2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Loginpageclass loc=new Loginpageclass(driver);
		Logout_page lop=new Logout_page(driver); 
		loc.openUrl();
		loc.enterUsername("Admin");
		loc.enterPass("admin123");
		loc.clickOnLogin();
		lop.clickOnImage();
		lop.clickOnlogout();
		
		

	}

}
