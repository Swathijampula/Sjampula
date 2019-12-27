package dec22.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Overs {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//close banner window
		ac.sendKeys(Keys.ESCAPE).build().perform();
		WebElement babykids=driver.findElement(By.xpath("//span[contains(text(),'Baby & Kids')]"));
		//mouseover to baby&kids
		ac.moveToElement(babykids);
		ac.build().perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.linkText("Puzzles")));
		ac.click();
		ac.pause(4000);
		ac.build().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		

	}

}
