package dec20.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_Tble {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");	
		driver.manage().window().maximize();
		//store table
		WebElement table=driver.findElement(By.id("customers"));
		//get collection of rows in atable
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		String expcountry="Canada";
		for(int i=1;i<rows.size();i++)
		{
			//get collection of columns
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				//get each cell text
				String celltext=cols.get(j).getText();
				System.out.println(celltext+"\n");
				
						
			}
			System.out.println(expcountry+" "+"foundat"+" "+(i)+ "row"  );
			System.out.println();
			System.out.println("======================");
		}

	}

}
