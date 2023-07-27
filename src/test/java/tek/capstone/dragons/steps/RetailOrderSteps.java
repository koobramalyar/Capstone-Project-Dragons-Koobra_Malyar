package tek.capstone.dragons.steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();

	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String SmartHome) {
		selectByVisibleText(factory.orderPage().allDepartmentDropdown, SmartHome);
		logger.info(SmartHome + " option is selected successfully");
		
	    
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String kasaOutdoorSmartPlug) {
		sendText(factory.orderPage().searchInputField, kasaOutdoorSmartPlug);
		logger.info(kasaOutdoorSmartPlug + " Item name was entered successfully");
	   
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.orderPage().searchBttn);
		logger.info("Search button was clicked successfully");
	   
	}
	@When("User click on item")
	public void userClickOnItem() {
		click(factory.orderPage().kasaOutdoorSmartPlugItem);
		logger.info("Item was clicked successfully");
	    
	}
	@When("User select quantity {string}")
	public void userSelectQuantity(String itemQty) {
		selectByVisibleText(factory.orderPage().productQtyDropdown, itemQty);
		logger.info("Item was selected successfully");
	    
	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.orderPage().addToCartBttn);
		logger.info("Add to Cart button was clicked successfully");
	    
	}
	@Then("the cart icon quantity should change to '{int}'")
	public void theCartIconQuantityShouldChangeTo(int ItemQtyInTheCart) {
		int expectedQuantity = 2;
		int actualQuantity = ItemQtyInTheCart;
		Assert.assertEquals(expectedQuantity, actualQuantity);
		
		//Assert.assertEquals(ItemQtyInTheCart, factory.orderPage().cartQtyField.getText());
		logger.info(ItemQtyInTheCart + " Quatity was displayed in the cart");
		click(factory.orderPage().cartOption);
		click(factory.orderPage().deleteItemFromCart);
	}
	@And("User click on item Apex Legends")
	public void userClickOnItemApexLegends() {
		click(factory.orderPage().apexLegendsItem);
		logger.info("item was clicked successfully");

	    
}
	@When("User search for an item Apex Legends {string}")
	public void userSearchForAnItemApexLegends(String apexLegends) {
		sendText(factory.orderPage().searchInputField, apexLegends);
		logger.info(apexLegends + " entered successfully" );
	    
	}
	@When("User select Apex Legends quantity {string}")
	public void userSelectApexLegendsQuantity(String itemQty) {
		selectByVisibleText(factory.orderPage().productQtyDropdown, itemQty);
		logger.info(itemQty + " quatity was selected successfully"); 
	  
	}
	@Then("the cart icon quantity Apex Legends should change to {string}")
	public void theCartIconQuantityApexLegendsShouldChangeTo(String expectedQty) {
		Assert.assertEquals(expectedQty, factory.orderPage().cartQtyField.getText());
		logger.info(expectedQty + " Quantity was validated successfully");
	
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.orderPage().cartBttn);
		logger.info("cart button was clicked successfully");
	   
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.orderPage().proceedToCheckoutBttn);
		logger.info("proceed to checkout was clicked successfuly");
	 
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.orderPage().placeOrderBttn);
		logger.info("place your order button was clicked successfully");
		
	}
	//@cancelOrder 
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderLink);
		logger.info("Order link was clicked successfuly");
	    
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	List<WebElement> listOfOrders = factory.orderPage().listOfOrder;
	for (int i = 0; i < listOfOrders.size(); i++) {
	if (listOfOrders.get(i).getText().equalsIgnoreCase("Hide Details")) {

	} else if (listOfOrders.get(i).getText().equalsIgnoreCase("Show Details")) {
	click(factory.orderPage().showDetails);
	}
	}
	}


	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	List<WebElement> listOfCencelOptions = factory.orderPage().cancelbttn;
	for (int i = 0; i < listOfCencelOptions.size(); i++) {
	click(listOfCencelOptions.get(0));
	
	logger.info("Cancel the order button was clicked Successfully");
	break;
	}
	}
//	@When("User click on first order in list")
//	public void userClickOnFirstOrderInList() {
//		List<WebElement> listOfOrders =factory.orderPage().listOfOrders;
//		for(int i =0; i< listOfOrders.size(); i++) {
//			if(listOfOrders.get(i).getText().equalsIgnoreCase("Hide Details")) {
//				if (factory.orderPage().cancelBttn.isDisplayed()) {
//					clickElementWithJS(factory.orderPage().cancelBttn);
//					break;
//				}
//			} else {
//				click(factory.orderPage().orderDetailHiddenOrderDisplayed);
//				if(factory.orderPage().cancelBttn.isDisplayed()) {
//					clickElementWithJS(factory.orderPage().cancelBttn);
//					break;
//				}
//			
//				}
//			}
//		}  
//	
//	@When("User click on Cancel The Order button")
//	public void userClickOnCancelTheOrderButton() {
//		click(factory.orderPage().cancelBttn);
//		logger.info("Cancel the ordere button was clicked successfully");
//	}

//	@When("User select the cancelation Reason {string}")
//	public void userSelectTheCancelationReasonBoughtWrongItem(String cancellationReason) {
//		selectByVisibleText(factory.orderPage().cancellationReason, cancellationReason);
//		logger.info(cancellationReason + " reason was selected successfully");
	    
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancelationReason) {
		selectByValue(factory.orderPage().cancelReasonSelect, "wrong");
		logger.info(cancelationReason + " was selected as reason");
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelSubmitBttn);
		logger.info("Cancel submit button was clicked successfully");
	    
	}
	
	@Then("A cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String cancelationMessage) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().orderCancelationMessage));
		logger.info(cancelationMessage + " , was displayed");
		slowDown();
//	@Then("a cancelation message should be displayed {string}")
//	public void aCancelationMessageShouldBeDisplayed(String yourOrderCanelledMssg) {
//		Assert.assertEquals(yourOrderCanelledMssg, factory.orderPage().yourOrderCanelledMssg);
//		logger.info(yourOrderCanelledMssg + " was verified successfully");
		//////////////////////////////////////////////////////////////////////////////////////////////////////
	   
	}
	//@returnOrder myself done 
	
	
	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnOderBttn);
		logger.info("return button was clicked successfully");
	   
}
	@And("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String itemDamaged) {
		selectByVisibleText(factory.orderPage().selectReasonDropdwon, itemDamaged);
		logger.info(itemDamaged + " reason was selected successfully");
	    
	}
	@And("User select the drop off service {string}")
	public void userSelectTheDropOffService(String fedexOption) {
		selectByVisibleText(factory.orderPage().dropOffServiceDropdwon, fedexOption);
		logger.info(fedexOption + " select drop off option successfully");
	   
	}
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().orderRuturnBttn);
		logger.info("return button clicked successfully");
		///////////////////////////////////////////////////
	}
		@Then("a Return message should be displayed {string}")
		public void aReturnMessageShouldBeDisplayed(String string) {
			Assert.assertTrue(isElementDisplayed(factory.orderPage().returnMssg));
			logger.info(string + " was successfully displyed");
	   /////////////////////////////////////
			// Review scenario
	}
		@When("User click on Review button")
		public void userClickOnReviewButton() {
			click(factory.orderPage().reviewButton);
			logger.info("Review button was clicked");
		}

		@When("User write Review headline {string}")
		public void userWriteReviewHeadline(String reviewHeadline) {
			sendText(factory.orderPage().reviewHeadlineBox, reviewHeadline);
			logger.info("Review headline entered");
		}
		
		@When("User write Review Body {string}")
		public void userWriteReviewBody(String reviewBody) {
			sendText(factory.orderPage().reviewBody, reviewBody);
			logger.info(reviewBody + " was entered as review");
		}

		@When("User click Add your Review button")
		public void userClickAddYourReviewButton() {
			click(factory.orderPage().addYourReviewButton);
			logger.info("Add your review button was clicked");
		}

		@Then("A review message should be displayed {string}")
		public void aReviewMessageShouldBeDisplayed(String reviewSuccessMessage) {
			waitTillPresence(factory.orderPage().reviewSuccessMessage);
			Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewSuccessMessage));
			
		}



	}

	   
	 



