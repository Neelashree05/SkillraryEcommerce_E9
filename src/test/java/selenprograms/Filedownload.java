package selenprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Filedownload {
	


	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://demoapp.skillrary.com/product.php?product=java");
driver.findElement(By.xpath("//input[@name='downloadInvoice']")).click();
		
        
	}



}
