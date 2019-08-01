package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print24 {
	 public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.name("lastname")).sendKeys("mahesh");
		driver.findElement(By.name("firstName")).sendKeys(new String[]{"mahesh"});
		driver.findElement(By.name("lastName")).sendKeys(new String[]{"kumar"});
		driver.findElement(By.name("phone")).sendKeys(new String[]{"9704498868"});
		driver.findElement(By.name("userName")).sendKeys(new String[]{"mahesh.pottala@gmail.com"});
		driver.findElement(By.name("address1")).sendKeys(new String[]{"Karimnagar"});
		driver.findElement(By.name("city")).sendKeys(new String[]{"Karimnagar"});
		driver.findElement(By.name("state")).sendKeys(new String[]{"telangana"});
		driver.findElement(By.name("postalCode")).sendKeys(new String[]{"505525"});
		Select s=new Select (driver.findElement(By.name("country")));
		s.selectByVisibleText("GABON");
		driver.findElement(By.name("register")).click();
		
		
		
//driver.close();
	}

}
