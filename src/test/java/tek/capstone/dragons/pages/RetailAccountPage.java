package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "profileImage")
	public WebElement profileImage;

	@FindBy(id = "nameInput")
	public WebElement nameInput;

	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInput;

	@FindBy(id = "personalUpdateBtn")
	public WebElement personalUpdateButton;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement successMessage;

	// locator for add payment method

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div[2]")
	public WebElement paymentMethod;

	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;

	@FindBy(id = "nameOnCardInput")
	public WebElement nameCardInputField;

	@FindBy(id = "expirationMonthInput")
	public WebElement expiratiMonthInput;

	@FindBy(id = "expirationYearInput")
	public WebElement expiratiYear;

	@FindBy(id = "securityCodeInput")
	public WebElement securityCode;

	@FindBy(xpath = "//*[@id=\"paymentSubmitBtn\"]")
	public WebElement paymentSubmitBtn;

	@FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/div[2]")
	public WebElement paymentMethodAddedSuccessfully;

	// locator for remove Payment method

	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/p[2]")
	public List<WebElement> cardEndingNum;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/p[2]")
	public WebElement SelectedpaymentCard;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[2]")
	public WebElement removeCardBttn;

	// add address
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[3]/div[1]/div/div/p")
	public WebElement addAddressLink;

	@FindBy(xpath = "//*[@id=\"countryDropdown\"]")
	public WebElement countryDropdown;

	@FindBy(id = "fullNameInput")
	public WebElement addressNameInputField;

	@FindBy(id = "phoneNumberInput")
	public WebElement addressPhoneInputField;

	@FindBy(id = "streetInput")
	public WebElement addressStreetInputField;

	@FindBy(id = "apartmentInput")
	public WebElement addressAptInputField;

	@FindBy(id = "cityInput")
	public WebElement addressCityInputField;

	@FindBy(xpath = "//*[@id=\"newForm\"]/div[5]/div[2]/div/div/select")
	public WebElement addressStateInputField;

	@FindBy(id = "zipCodeInput")
	public WebElement addressZipCodeInputField;

	@FindBy(id = "addressBtn")
	public WebElement addressAddAddressBttn;

	@FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/div[2]")
	public WebElement addressAddedSuccessfullyMssg;

	// Edit credit or debit card

	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[1]")
	public WebElement creditDebitCardEditBttn;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[2]/button[1]")
	public WebElement eiditAddressBttn;

	@FindBy(xpath = "//*[@id=\"addressBtn\"]")
	public WebElement submitAddressBttn;

	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedMessage;
	//////////////////////////////////////////////////////

	@FindBy(xpath = "//div[@class='account__address-btn-wrapper']//child::button[text()='Remove']")
	public WebElement removeAddressButton;

	@FindBy(xpath = "//*[@id=\"previousPasswordInput\"]")
	public WebElement previousPasswordBox;

	@FindBy(xpath = "//*[@id=\"newPasswordInput\"]")
	public WebElement newPasswordBox;

	@FindBy(xpath = "//*[@id=\"confirmPasswordInput\"]")
	public WebElement confirmPasswordBox;

	@FindBy(xpath = "//*[@id=\"credentialsSubmitBtn\"]")
	public WebElement changePasswordButton;

	@FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/div[2]")
	public WebElement passwordChangeSuccessMessage;

}
