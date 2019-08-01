package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naveenassinment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.zoopla.co.uk");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='search-input-location']")).sendKeys("london");
		driver.findElement(By.xpath("//*[@id='search-submit']")).click();
		List<WebElement>l=driver.findElements(By.tagName("a"));
		System.out.println(l.size());
		for(WebElement ab: l)
		{
			//System.out.println(ab.getText());
			System.out.println(ab.hashCode());
		}
		driver.findElement(By.linkText("4 bed semi-detached house for sale")).click();
		WebElement g=driver.findElement(By.xpath("//*[@class='ui-agent__name']"));
		System.out.println(g.getText());
		driver.findElement(By.xpath("//*[@class='ui-agent__name']")).click();
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equalsIgnoreCase("Christopher Russell, DA15 - Estate and Letting Agents - Zoopla"))
		{
			System.out.println("test passed");
			System.out.println(driver.getTitle());
		}
		else
		{
			System.out.println("test failed");
		}
		
		
		
		
		
		
		
			
		
		

	}

}
