package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class facebook_test {
WebDriver driver;
@Given("^open facebook$")
public void open_facebook() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "E:\\javaselenium\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
        
}

@And("^i enter valid username and password$")
public void i_enter_valid_username_and_password() throws Throwable {
	driver.findElement(By.id("email")).sendKeys("gayathri123");
	driver.findElement(By.id("pass")).sendKeys("123456");
	driver.findElement(By.id("u_0_2")).click();
    
}

@And("^it should open the facebook$")
public void it_should_open_the_facebook() throws Throwable {
	driver.getCurrentUrl();
	driver.close();
    
}



}
