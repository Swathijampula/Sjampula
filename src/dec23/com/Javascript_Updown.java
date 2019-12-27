package dec23.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Javascript_Updown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.flipkart.com/'");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(5000);
		//scroll top to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//scroll bottom to top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		WebElement electronics=driver.findElement(By.xpath("//p[contains(text(),'Electronics')]"));
		js.executeScript("window.scrollIntoView",electronics);
		electronics.click();
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		//scroll vertically to certain pixel
		js.executeScript("window.scrollBy(0,900)");
		
		Thread.sleep(7000);
		driver.close();
	}

}
