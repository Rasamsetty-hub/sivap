package sivap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class yut {

	@Test
	public void secondmethod() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("input-firstname")).sendKeys("sivamani");
	    Thread.sleep(2000);
	    driver.findElement(By.id("input-lastname")).sendKeys("prasad");
	   
	    Thread.sleep(2000);
	    driver.findElement(By.id("input-email")).sendKeys("nukalusivaprasad@gmail.com");
	    driver.findElement(By.id("input-telephone")).sendKeys("98765431213");
	    driver.findElement(By.id("input-password")).sendKeys("Alekhya2@123");
	    driver.findElement(By.id("input-confirm")).sendKeys("Alekhya2@123");
	    driver.findElement(By.xpath("//input[@name='agree']")).click();
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	    driver.quit();
	}
}
