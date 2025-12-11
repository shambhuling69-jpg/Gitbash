package shadowRoot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot_Qspi 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	   driver.get("https://demoapps.qspiders.com/");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//section[text()='Shadow Root Elements']")).click();
	   driver.findElement(By.xpath("//section[text()='Shadow Root']")).click();
	   
	   
	}

}
