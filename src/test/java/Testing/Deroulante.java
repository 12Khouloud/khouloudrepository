package Testing;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deroulante {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/select-menu");
		WebElement liste ;
		liste = driver.findElement(By.id("oldSelectMenu"));
		// appel fonction select 
		Select deroulante = new Select(liste);
		deroulante.selectByValue("5");

	}

}
