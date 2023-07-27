package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id = "logoutBtn")
	public WebElement logoutBtn;
	
	@FindBy(id = "signinLink")
	public WebElement SignIn;
	
	@FindBy(linkText = "TEKSCHOOL")
	public WebElement tekschoolLogo;
	
	@FindBy(id = "email")
	public WebElement emailField;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(id = "loginBtn")
	public WebElement loginButton;
	
	@FindBy(id = "newAccountBtn")
	public WebElement newAccountBttn;
	
	@FindBy(id ="nameInput")
	public WebElement nameInputFeild;
	
	@FindBy(id = "emailInput")
	public WebElement emailInputFeild;
	
	@FindBy(id ="passwordInput")
	public WebElement passwordInputField;
	
	@FindBy(id ="confirmPasswordInput")
	public WebElement confirmPasswordInputFeild;
	
	@FindBy(id ="signupBtn")
	public WebElement signupBttn;
	
}
