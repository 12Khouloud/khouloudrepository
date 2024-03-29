package javacucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class democucumber {
	WebDriver driver ;

	@Given("ouvrir navigateur chrome")
	public void ouvrir_navigateur_chrome() {
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe" );
		
		 driver = new ChromeDriver() ; 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	   
	}

	@Given("saisir url")
	public void saisir_url() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("saisir mail")
	public void saisir_mail() {
		WebElement user ;
		user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");
	}

	@When("saisir password")
	public void saisir_password() {
		WebElement Password ;
		Password = driver.findElement(By.name("password"));
		Password.sendKeys("admin123");
	}

	@When("cliquer sur connecter")
	public void cliquer_sur_connecter() {
		WebElement bouton ;
		bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		bouton.click();
	}

	@Then("verifier page dacceuil")
	public void verifier_page_dacceuil() {
	    System.out.println("testok");
	}



}
