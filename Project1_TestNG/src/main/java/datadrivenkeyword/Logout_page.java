package datadrivenkeyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout_page {
	public static WebDriver driver;
	Logout_page(WebDriver driver){
		Logout_page.driver=driver;
	}
	By image=By.xpath("//p[aclass='oxd-userdropdown-name']");
	By logoutBtn=By.linkText("Logout");
	public void clickOnImage() throws InterruptedException {
		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		Thread.sleep(2000);
	}
	public void clickOnlogout() {
		driver.findElement(By.linkText("Logout")).click();
	}
	

}
