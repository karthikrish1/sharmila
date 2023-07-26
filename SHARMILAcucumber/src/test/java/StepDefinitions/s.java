package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class s {

	ChromeDriver ob;
@Given("user is on login page")
public void user_is_on_login_page() {
   System.out.println("visited website ");
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
	//step2: create an object for chromedriver class
	 ob= new ChromeDriver();
	//step3: visiting the website
	ob.get("http://www.mycontactform.com");
	
}

@When("user enters username and password")
public void user_enters_username_and_password() {
	//id=user
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
		//name=pass
		ob.findElementByName("pass").sendKeys("12345");
		
	
}

@When("click on login button")
public void click_on_login_button() {
	ob.findElementByClassName("btn_log").click();
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() throws InterruptedException {
Thread.sleep(3000);
ob.quit();
}

}
