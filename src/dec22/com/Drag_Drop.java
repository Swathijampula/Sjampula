package dec22.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		ac.clickAndHold(src).moveToElement(dst).build().perform();
		//ac.dragAndDrop(src, dst).build().perform();
		Thread.sleep(5000);
		if(dst.getText().contains("dropped"))
		{
			System.out.println("drag and drop is success");
		}
		else
		{
			System.out.println("drag and drop is fail");
			
		}
	driver.close();	
		
		

	}

}
