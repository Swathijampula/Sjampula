package dec16.com;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Windows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(@class,'allcircle circlefour')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='allcircle circlefive']")).click();
		Thread.sleep(5000);
		ArrayList<String>brwindw=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brwindw);
		Iterator<String>x=brwindw.iterator();
		while(x.hasNext())
		{
			String child=x.next();
			if(!parent.equals(child))
			{
				//switch to child window
				String pagetitle=driver.switchTo().window(child).getTitle();
				System.out.println(pagetitle);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
			}
		
		}
		//switch to 1st child window
		driver.switchTo().window(brwindw.get(1));
		System.out.println(brwindw.get(1));
		Thread.sleep(5000);
		
		driver.quit();
		
		

	}

}
