package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyaccountStepDefinitionsFile {

	public WebDriver driver =null;
	
	
@Given("^Launch the browser$")
public void launch_the_browser() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\eclipse\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
  }

@When("^Enter the url \"([^\"]*)\"$")
public void enter_the_url(String url) throws Throwable {
	driver.get(url);
  
}
/*@When("^Enter the username and password$")
public void enter_the_username_and_password() throws Throwable {
  driver.findElement(By.id("user_login")).sendKeys("Admin");
  driver.findElement(By.id("user_pass")).sendKeys("#####");
  
}*/

@When("^Enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
public void enter_the_username_and_password(String user, String pass) throws Throwable {

	driver.findElement(By.id("user_login")).sendKeys(user);
	driver.findElement(By.id("user_pass")).sendKeys(pass);
	  
}


@And("^click on sign in$")
public void click_on_sign_in() throws Throwable {
  driver.findElement(By.id("wp-submit")).click();
}

@Then("^User is successfully logged in$")
public void user_is_successfully_logged_in() throws Throwable {
  String Actualtext =driver.findElement(By.xpath("//*[@id=\'wp-admin-bar-my-account\']/a/span")).getText();
  Assert.assertEquals(true,Actualtext.contains("Gururajan"));
  driver.close();
 
}


}
