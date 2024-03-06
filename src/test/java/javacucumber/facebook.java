package javacucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class facebook {
	WebDriver driver;

	@Given("ouvrir le navigateur chrome")
	public void ouvrir_le_navigateur_chrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

	}

	@Given("entrer url {string}")
	public void entrer_url(String string) {
		driver.get(string);

	}

	@When("cliquer sur creation de compte")
	public void cliquer_sur_creation_de_compte() {
		WebElement nouveaucompte;
		nouveaucompte = driver.findElement(By.xpath("(//a[normalize-space()='Créer nouveau compte'])[1]"));
		nouveaucompte.click();

	}

	@When("remplir prenom {string}")
	public void remplir_prenom(String string) {
		WebElement prenom;
		prenom = driver.findElement(By.name("firstname"));
		prenom.sendKeys(string);

	}

	@When("remplir nom {string}")
	public void remplir_nom(String string) {
		WebElement nom;
		nom = driver.findElement(By.name("lastname"));
		nom.sendKeys(string);

	}

	@When("remplir email {string}")
	public void remplir_email(String string) {
		WebElement email;
		email = driver.findElement(By.name("reg_email__"));
		email.sendKeys(string);

	}

	@When("remplir email confirmation {string}")
	public void remplir_email_confirmation(String string) {
		WebElement email2;
		email2 = driver.findElement(By.name("reg_passwd__"));
		email2.sendKeys(string);

	}

	@When("remplir mot de passe {string}")
	public void remplir_mot_de_passe(String string) {
		WebElement motdepasse;
		motdepasse = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		motdepasse.sendKeys(string);

	}

	@When("remplir jour de naissance {string}")
	public void remplir_jour_de_naissance(String string) {
		WebElement mois;
		mois = driver.findElement(By.name("birthday_day"));
		Select select = new Select(mois);
		select.selectByValue(string);

	}

	@When("remplir mois de naissance {string}")
	public void remplir_mois_de_naissance(String string) {
		WebElement jour;
		jour = driver.findElement(By.name("birthday_month"));
		Select select1 = new Select(jour);
		select1.selectByValue(string);

	}

	@When("remplir annee de naissance {string}")
	public void remplir_annee_de_naissance(String string) {
		WebElement annee;
		annee = driver.findElement(By.name("birthday_year"));
		Select select2 = new Select(annee);
		select2.selectByValue(string);

	}

	@When("remplir genre {string}")
	public void remplir_genre(String string) {

		WebElement femme;

		femme = driver.findElement(By.xpath("//label[normalize-space()='Femme']"));

		WebElement homme;
		homme = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
		if (string.equals("Homme")) {
			homme.click();

		} else if (string.equals("femme")) {
			femme.click();

		}

	}

	@When("cliquer sur s inscrire")
	public void cliquer_sur_s_inscrire() {
		WebElement boutonklik;
		boutonklik = driver.findElement(By.name("websubmit"));
		boutonklik.click();

	}

	@Then("verifier l inscription")
	public void verifier_l_inscription() {

	}

}
