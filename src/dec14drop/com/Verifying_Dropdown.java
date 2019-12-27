package dec14drop.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifying_Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/swathi/Desktop/Qedge/Multi.html");
		driver.manage().window().maximize();
		Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
		
		boolean value=dropdown.isMultiple();
		System.out.println(value);
		//select 6 items in dropdown
		dropdown.selectByIndex(3);
		Thread.sleep(3000);
		dropdown.selectByIndex(0);
		Thread.sleep(3000);
		dropdown.selectByIndex(1);
		Thread.sleep(3000);
		dropdown.selectByIndex(2);
		Thread.sleep(3000);
		dropdown.selectByIndex(5);
		Thread.sleep(3000);
		dropdown.selectByIndex(6);
		Thread.sleep(3000);
		//count no of items selected above
		List<WebElement>list=dropdown.getAllSelectedOptions();
		System.out.println("no of items selected::"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String itemname=list.get(i).getText();
			System.out.println(itemname);
			
		}
		dropdown.deselectByIndex(3);
		Thread.sleep(3000);
		dropdown.deselectByIndex(0);
		Thread.sleep(3000);
		dropdown.deselectByIndex(1);
		Thread.sleep(3000);
		dropdown.deselectByIndex(2);
		Thread.sleep(3000);
		dropdown.deselectByIndex(5);
		Thread.sleep(3000);
		dropdown.deselectByIndex(6);
		Thread.sleep(3000);
		driver.close();
		

	}

}
