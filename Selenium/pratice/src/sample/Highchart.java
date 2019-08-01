package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highchart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.highcharts.com/demo");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@src='https://assets.highcharts.com/images/demo-thumbnails/highcharts/line-ajax-default.png'][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='highcharts-point highcharts-color-1'][5]")).click();
		

	}

}
