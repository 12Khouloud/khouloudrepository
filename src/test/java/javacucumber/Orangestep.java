package javacucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orangestep {
	WebDriver driver ;
	@Given("ouvrir chrome")
	public void ouvrir_chrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    }

	@Given("ouvrir URL {string}")
	public void ouvrir_url(String string) {
	   driver.get(string);
	}

	@When("saisir {string} dans le login")
	public void saisir_dans_le_login(String string) {
		WebElement login ; 
		login = driver.findElement(By.name("username"));
		login.sendKeys(string);
	    
	}

	@When("saisir {string} dans le mot de passe")
	public void saisir_dans_le_mot_de_passe(String string) {
		WebElement motdepasse ; 
		motdepasse = driver.findElement(By.name("password"));
		motdepasse.sendKeys(string);
	   
	}

	@When("taper sur le bouton login")
	public void taper_sur_le_bouton_login() {
		WebElement bouton ; 
		bouton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		bouton.click();
	   
	}

	@Then("verifier le resultat obtenu {string}")
	public void verifier_le_resultat_obtenu(String string) {
		String url ; 
		url = driver.getCurrentUrl();
		if (url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
			WebElement profil ; 
			profil = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
			String texte ;
			texte= profil.getText();
			Assert.assertEquals(texte, string);
			System.out.println("cas passant ok ");
			
		}
		else if (url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		WebElement messageerreur ; 
		messageerreur= driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		String message2;
		message2=messageerreur.getText();
		Assert.assertEquals(message2, string);
		System.out.println("cas non passant");
		{
			
		}
	   
	}

}
