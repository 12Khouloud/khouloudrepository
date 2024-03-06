package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {

	public static void main(String[] args) {
		// chemin chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		// ouvrir chrome
		WebDriver driver = new ChromeDriver();
		//maximiser la fenetre 
		 driver.manage().window().maximize();
		 //delete cookies
		 driver.manage().deleteAllCookies();
		// ouvrir Url
		 //driver.get("https://www.youtube.com/");
		 driver.navigate().to("https://www.youtube.com/");
		 


	}

}
