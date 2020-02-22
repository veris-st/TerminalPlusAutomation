package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tests extends BaseClass{
	
	@Test
	public void webUserApp() {
		System.out.println("****Web User App Testing****");
		driver.get("https://app.veris.in/otpRequest");
		driver.findElement(By.xpath("//input[@placeholder='Email or Phone Number']")).sendKeys("9035111511");
		driver.findElement(By.xpath("//div[@class='rn-13yce4e rn-fnigne rn-ndvcnb rn-gxnn5r rn-deolkf rn-1471scf rn-o11vmf rn-ebii48 rn-gul640 rn-t9a87b rn-1mnahxq rn-61z16t rn-p1pxzi rn-11wrixw rn-wk8lta rn-9aemit rn-1mdbw0j rn-gy4na3 rn-bauka4 rn-q42fyq rn-qvutc0']")).click();
		System.out.println("Completed test one ");
	}
	@Test
	public void testwo() {
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Veris");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Completed test one ");
	}
}

