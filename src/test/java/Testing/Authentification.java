package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// chemin driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		//ouvrir chrome 
		WebDriver driver = new ChromeDriver();
		//maximiser la fenetre
		driver.manage().window().maximize();
		//delete cookies 
		driver.manage().deleteAllCookies();
		//url
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//sleep
		Thread.sleep(5000);
		//driver.get("");
		//identification de webelement 
		WebElement user ;
		user = driver.findElement(By.name("username"));
		//action
		user.sendKeys("Admin");
		WebElement Password ;
		Password = driver.findElement(By.name("password"));
		Password.sendKeys("admin123");
		//identification de bouton 
		WebElement bouton ;
		bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		bouton.click();
		// verification du reusltat obtenu vs attendu : assert 
		// identification de l'element 
		Thread.sleep(5000);
		WebElement profil ;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text;
		text= profil.getText();
		Assert.assertEquals("AeIISYpJJX Collings", text);
		System.out.println("test ok");
		
		
		

	}

}
