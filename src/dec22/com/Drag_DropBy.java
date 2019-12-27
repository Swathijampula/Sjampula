package dec22.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_DropBy {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		//get location of element
		int x=dst.getLocation().getX();
		int y=dst.getLocation().getY();
		System.out.println(x+" "+y);
		ac.dragAndDropBy(src, x, y).perform();
		driver.close();
		
	}

}
