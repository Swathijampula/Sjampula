package dec14radio.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_Radio {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/r.php");
		driver.manage().window().maximize();
		List<WebElement>rdolist=driver.findElements(By.xpath("//form/div/div/span/span/label"));
		System.out.println("radio buttons are::"+rdolist.size());
		for(int i=0;i<rdolist.size();i++)
		{
			System.out.println(rdolist.get(i).getText());
			if(!rdolist.get(i).isSelected())
			{
				rdolist.get(i).click();
			}
			else
			{
				rdolist.get(i).click();
			}
			Thread.sleep(5000);
			
		}
		driver.close();
	}

}
