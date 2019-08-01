package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Latest Notifications")).click();
		List<WebElement>tab=driver.findElements(By.tagName("table"));
		List<WebElement>row=tab.get(0).findElements(By.tagName("tr"));
		List<WebElement>col=row.get(2).findElements(By.tagName("td"));
		List<WebElement>job=col.get(5).findElements(By.linkText("details"));
		//System.out.println("hai");
		//job.get(0).click();
		//System.out.println("hai");
		//driver.findElement(By.linkText("Delhi")).click();
		driver.findElement(By.linkText("details")).click();
		
		
		
		
		
		
		

	}

}
