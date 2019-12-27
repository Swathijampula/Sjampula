package dec18.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collexn_Ofwindowsusingset {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//get parent window id
		String parent=driver.getWindowHandle();
		System.out.println("parent id is::"+parent);
		//click on terms link
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		//get collection of all windows
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println("all windows are::"+allwindows);
		//iterate all windows
		for(String each:allwindows)
		{
			//parent should not be equal to child
			if(!parent.equals(each))
			{
				//swith to child window
				driver.switchTo().window(each);
				Thread.sleep(3000);
				driver.findElement(By.name("email")).sendKeys("jampula.swathi@gmail.com");
				driver.findElement(By.name("pass")).sendKeys("08j21a0543");
				driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
				Thread.sleep(3000);
				//switch to parent window
				driver.switchTo().window(parent);
				Thread.sleep(3000);
				
				
				
			}
		}
driver.quit();
	}

}
