package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("mahesh");
		driver.findElement(By.xpath("//*[@src='/gif/continue_new1.gif?v=1']")).click();  
		

	}

}
