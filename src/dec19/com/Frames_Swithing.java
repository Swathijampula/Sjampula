package dec19.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Swithing {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");	
		driver.manage().window().maximize();
		//click on log in/signup
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[4]/div")).click();
		Thread.sleep(5000);
		//get collection of frames
		List<WebElement>frames=driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames are::"+frames.size());
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		//click on log in/signup
		driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("123345");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/md-content/button")).click();
		
		//come out of the frame
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//clicking close button of frame but it is related to parent so switched to parent
		driver.findElement(By.linkText("X")).click();
		Thread.sleep(5000);
		driver.close();
		;
		
	}

}
