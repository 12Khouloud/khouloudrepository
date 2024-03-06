package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Fonctionclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		WebDriver driver ; 
		driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//identification webelement
		WebElement doubleclik ;
		doubleclik = driver.findElement(By.id("doubleClickBtn"));
		Actions klik = new Actions(driver);
		klik.doubleClick(doubleclik).perform();
		
		//assert 
		WebElement msg ;
		msg = driver.findElement(By.id("doubleClickMessage"));
		 String text ;
		 text = msg.getText();
		 Assert.assertEquals("You have done a double click", text);
		 System.out.println("test ok ");
		 
		 WebElement rightclik ;
		 rightclik = driver.findElement(By.id("rightClickBtn"));
		 Actions clique = new Actions(driver);
		 clique.contextClick(rightclik).perform();
		 //assert 
		 WebElement verf ;
		 verf =driver.findElement(By.id("rightClickMessage"));
		 String text2 ; 
		 text2  = verf.getText();
		 Assert.assertEquals(text2, "You have done a right click");
		 System.out.println("test ok ok");
		 
		 WebElement bouton3;
		 bouton3 = driver.findElement(By.linkText("Click Me"));
		 bouton3.click();
		 
		 WebElement msg3 ;
		 msg3 = driver.findElement(By.id("dynamicClickMessage"));
		 String text3;
		 text3 = msg3.getText();
		 Assert.assertEquals("You have done a dynamic click", text3);
		 System.out.println("good");

	}

}
