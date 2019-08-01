package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("karimnagar",Keys.ENTER);
		WebElement e=driver.findElement(By.xpath("//*[@class='LC20lb']"));
		System.out.println(e.getText());
		
		driver.findElement(By.xpath("//*[@class='LC20lb']")).click();
		
		
	}

}
