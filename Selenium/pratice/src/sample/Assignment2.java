package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='chNavIcon appendBottom2 chSprite chFlights active']")).click();
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[1]/ul/li[2]")).click();
		//driver.findElement(By.xpath("//*[@class='lbl_input latoBold appendBottom10']")).click();
		WebElement date=driver.findElement(By.xpath("//*//*[@class='fsw_inputBox dates reDates inactiveWidget activeWidget shiftModal']']"));
		String datavalue="10May19";

	}
	public static void selectdatebyjs(WebDriver driver,WebElement element,String datavalue)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setattribute('value','+datavalue');",element );
		
		
	}

}
