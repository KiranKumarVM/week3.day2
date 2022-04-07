package week3.day2;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("Bags"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Men')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(2000);
		WebElement length = driver.findElement(By.className("length"));
		String text = length.getText();
		System.out.println("Item found is "+text);
		List<WebElement> listBrand = driver.findElements(By.className("brand"));
		System.out.println("Size of Brand is "+listBrand.size());
		for (WebElement Brand : listBrand) {
			String brandName = Brand.getText();
			System.out.println("Brand Name is "+brandName);
		}
       List<WebElement> names = driver.findElements(By.className("nameCls"));
       System.out.println("Size of Name is "+ names.size());
       for (WebElement name : names) {
    	   String text2 = name.getText();
    	   System.out.println("Name of bags is "+text2);
		
	}
       
	}
}