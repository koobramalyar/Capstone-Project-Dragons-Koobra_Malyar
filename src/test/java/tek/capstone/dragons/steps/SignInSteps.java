package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.mysql.cj.x.protobuf.MysqlxResultset.Row;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;


public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	//syntax
	//@annotation("value from step")
	//public void methodName(){}
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().retailLogo));
		logger.info("user is on retail website");
	}
	@Given("User is on retial website")
	public void userIsOnRetialWebsite() {
		String expectdTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectdTitle, actualTitle);
		logger.info("Retail Website opened and verified"); 
		
	}
	
	@When("User click on sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("user cliked on Sign In option");

	}
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passWordValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField,passWordValue);
		logger.info("user entered email and password");
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
	}
	@Then("user should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		String expectdTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectdTitle, actualTitle);
		logger.info("user logged in into account");
	
	
		}
		@Then("User click on Create New Account button")
		public void userClickOnCreateNewAccountButton() {
			click(factory.signInPage().newAccountBttn);
			logger.info("User click on Create New Account button");
		    
		}
		
		@Then("User fill the signUp information with below data")
		public void userFillTheSignUpInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
			List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
			for(Map<String, String> row : data) {
			sendText(factory.signInPage().nameInputFeild,row.get("name"));
			sendText(factory.signInPage().emailInputFeild, row.get("email"));
			sendText(factory.signInPage().passwordInputField, row.get("password"));
			sendText(factory.signInPage().confirmPasswordInputFeild, row.get("confirmPassword"));
			logger.info("Registration Info Entered");
			
			
			}
			}
		
		@Then("User click on signUp button")
		public void userClickOnSignUpButton() {
			click(factory.signInPage().signupBttn);
			logger.info("User click on Create New Account button"); 


}

}	
	

