package tek.capstone.dragons.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderPage extends CommonUtility {

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "search")
	public WebElement allDepartmentDropdown;
	@FindBy(id = "searchInput")
	public WebElement searchInputField;
	@FindBy(id = "searchBtn")
	public WebElement searchBttn;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div/p[1]")
	public WebElement kasaOutdoorSmartPlugItem;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/div/select")
	public WebElement productQtyDropdown;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/button/span")
	public WebElement addToCartBttn;
	@FindBy(xpath = "//*[@id=\"cartQuantity\"]")
	public WebElement cartQtyField;
	@FindBy(id = "cartBtn")
	public WebElement cartBttn;
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckoutBttn;
	@FindBy(xpath = "//*[@id=\"placeOrderBtn\"]")
	public WebElement placeOrderBttn;
	@FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/div[2]")
	public WebElement orderPlacedSuccessfulyMssg;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div/p[1]")
	public WebElement apexLegendsItem;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div/div[1]/p")
	public WebElement orderPlacedThanks;

	// @cancelOrder #this is has issue and even sir Emal Ramin was
	// not able to figure it out. so it is still pending...
	@FindBy(css = "html body div#root div.main-container div div.bg-gray-100 div.cancel__confirm-wrapper div.cancel__confirm div div.cancel__confirm-message p")
	public WebElement orderCancelationMessage;
	@FindBy(xpath = "//*[@id=\"reasonInput\"]")
	public WebElement cancelReasonSelect;
	@FindBy(id = "orderLink")
	public WebElement orderLink;
//	@FindBy(xpath ="//div[@class='order__header']")
//	public List<WebElement> listOfOrders;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[2]/div/p[2]")
	public WebElement orderDetailHiddenOrderDisplayed;
//	@FindBy(id ="cancelBtn")
//	public WebElement cancelBttn;
	@FindBy(xpath = "//*[@id=\"reasonInput\"]/option[2]")
	public WebElement cancellationReason;
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelSubmitBttn;
//	@FindBy(xpath ="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/p")
//	public WebElement yourOrderCanelledMssg;

	@FindBy(xpath = "//div[@class='order']//descendant::p[7]")
	public List<WebElement> listOfOrder;
	@FindBy(xpath = "//div[@class='order']//descendant::button[@id='cancelBtn']")
	public List<WebElement> cancelbttn;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/div/div[2]/div/p[2]")
	public WebElement showDetails;

//////////////////////////////////////////////////////////////////////////////////////////////////////

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/div/div[2]/div/p[2]")
	public WebElement firstOrderClicked;
	@FindBy(xpath = "//*[@id=\"returnBtn\"]")
	public WebElement returnOderBttn;
	@FindBy(xpath = "//*[@id=\"reasonInput\"]")
	public WebElement selectReasonDropdwon;
	@FindBy(xpath = "//*[@id=\"reasonInput\"]/option[3]")
	public WebElement itemDamaged;
	@FindBy(xpath = "//*[@id=\"dropOffInput\"]")
	public WebElement dropOffServiceDropdwon;
	@FindBy(xpath = "//*[@id=\"dropOffInput\"]/option[3]")
	public WebElement fedexOption;
	@FindBy(xpath = "//*[@id=\"cancelForm\"]/div/div[2]/div[1]")
	public WebElement orderRuturnBttn;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div/p")
	public WebElement returnMssg;

	/// Review

	@FindBy(css = "#reviewBtn")
	public WebElement reviewButton;

	@FindBy(css = "#headlineInput")
	public WebElement reviewHeadlineBox;

	@FindBy(css = "#descriptionInput")
	public WebElement reviewBodyBox;

	@FindBy(css = "#reviewSubmitBtn")
	public WebElement addYourReviewButton;

	@FindBy(id = "descriptionInput")
	public WebElement reviewBody;

	@FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/div[2]")
	public WebElement reviewSuccessMessage;

	public void clearCart() {
		cartOption.click();
		deleteItemFromCart.click();

	}

	@FindBy(xpath = "//*[@id=\"cartBtn\"]")
	public WebElement cartOption;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/div[2]/div/div/div[3]/div/p/span[2]")
	public WebElement deleteItemFromCart;
	

}
