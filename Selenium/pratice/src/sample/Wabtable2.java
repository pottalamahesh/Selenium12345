package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wabtable2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='markets']")).click();
		driver.findElement(By.linkText("Market Stats")).click();
		/*List<WebElement>table=driver.findElements(By.tagName("table"));
		List<WebElement>rows=table.get(0).findElements(By.tagName("tr"));
		List<WebElement>col=rows.get(6).findElements(By.tagName("td"));
		List<WebElement>ll=col.get(1).findElements(By.tagName("a"));
		ll.get(0).click();*/
		Thread.sleep(1000);
		driver.findElement(By.linkText("Nifty Weightage")).click();
		List<WebElement>table=driver.findElements(By.xpath("//*[@id='gridSource']"));
		/*for(WebElement e:table)
		{
			System.out.println(e);
		}
		*/List<WebElement>rows=driver.findElements(By.xpath("//*[@class='alternate'][4]"));
		/*for(WebElement e1:rows)
		{
			System.out.println(e1);
		}
		*/
		
		/*List<WebElement>col=rows.get(6).findElements(By.tagName("td"));
		List<WebElement>ll=col.get(0).findElements(By.tagName("a"));
		ll.get(0).click();
		*/
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("SBI")).click();
		String r=driver.getTitle();
		if(driver.getTitle().contains("Mahesh pottala"))
		{
			System.out.println("test passed");
		
		}
		else
		{
			System.out.println("test faled");
		}
		
		
	
		
			
		
		
		
			
		
			
		}
		
	}
		
		



	


