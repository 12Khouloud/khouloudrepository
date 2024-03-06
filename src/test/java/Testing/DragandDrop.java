package Testing;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable");
		WebElement drag,drop ;
		drag= driver.findElement(By.id("draggable"));
		
		
		drop=driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		String text ; 
		text = drop.getText();
		Assert.assertEquals(text, "Dropped!");
		System.out.println("ok");
		
		

	}

}
