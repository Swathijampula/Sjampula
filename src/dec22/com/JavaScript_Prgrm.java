package dec22.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Prgrm {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://www.amazon.com/'");
		//print title&length of title
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println("pagetitle::"+pagetitle);
		System.out.println("pagetitle length::"+pagetitle.length());
		//print url and length of url
		String url=js.executeScript("return document.URL").toString();
		System.out.println("url length is::"+url.length());
		//print domain name
		String strdomain=js.executeScript("return document.domain").toString();
		System.out.println("domain name::"+strdomain);
		System.out.println("domain length::"+strdomain.length());
	driver.close();
		

	}

}
