package Testing;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe" );
	WebDriver driver ;
	 driver = new ChromeDriver() ; 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/?locale=fr_FR");
	 driver.manage().deleteAllCookies();
	 WebElement cookies ; 
	 cookies = driver.findElement(By.id("axeptio_btn_acceptAll"));
	 cookies.click();

	
	WebElement nouveaucompte ;
	nouveaucompte = driver.findElement(By.xpath("(//a[normalize-space()='Créer nouveau compte'])[1]"));
	nouveaucompte.click();
	
	WebElement prenom ;
	prenom = driver.findElement(By.name("firstname"));
	prenom.sendKeys("khouloud");
	
	WebElement nom ; 
	nom = driver.findElement(By.name("lastname"));
	nom.sendKeys("hedhli");
	 WebElement email ;
	 email = driver.findElement(By.name("reg_email__"));
	 email.sendKeys("khouloudhedhli@gmail.com");
	 WebElement email2 ; 
	 email2 = driver.findElement(By.name("reg_passwd__"));
	 email2.sendKeys("khouloudhedhli@gmail.com");
	 WebElement motdepasse;
	 motdepasse=driver.findElement(By.xpath("//input[@id='password_step_input']"));
	 motdepasse.sendKeys("123456");
	 WebElement mois ; 
	 mois = driver.findElement(By.name("birthday_day"));
	 Select select = new Select(mois);
	 select.selectByValue("6");
	 WebElement jour ; 
	 jour =driver.findElement(By.name("birthday_month"));
	 Select select1 = new Select (jour);
	 select1.selectByValue("5");
	 WebElement annee ; 
	 annee = driver.findElement(By.name("birthday_year"));
	 Select select2 = new Select (annee);
	 select2.selectByValue("1991");
	 WebElement femme ; 
	 femme = driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
	 femme.click();
	 WebElement boutonklik ; 
	 boutonklik=driver.findElement(By.name("websubmit"));
	 boutonklik.click();
	 
		 
	 }
		 
	 }
	 
	 
	 
	 
		 
	 
	
		
	


 