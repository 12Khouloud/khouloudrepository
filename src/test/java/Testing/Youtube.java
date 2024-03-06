package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// chemin chrome
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		 driver.get("https://www.youtube.com/");
		 WebElement accepter ;
		 accepter =driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
		 accepter.click();
		Thread.sleep(5000);
		WebElement champs ;
		champs = driver.findElement(By.name("search_query"));
		champs.sendKeys("tunisie");
		WebElement klik ;
		klik = driver.findElement(By.id("search-icon-legacy"));
		klik.click();
		
		String URL ;
		URL = driver.getCurrentUrl();
		Assert.assertEquals("https://www.youtube.com/", URL);
		System.out.println("test ok");

	}

}
