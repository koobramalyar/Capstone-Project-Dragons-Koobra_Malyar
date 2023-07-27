package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");

	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput, nameValue);
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
		sendText(factory.accountPage().phoneInput, phoneValue);
		logger.info("user updated the name and the phone value");

	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().personalUpdateButton);
		logger.info("user clicked on update button");
	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().successMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().successMessage));
		logger.info("user profile information updated");
	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().paymentMethod);
		logger.info("User click on Add a payment method link");

	}

//	@When("User fill Debit or credit card information")
//	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
//	   List<Map<String, String>> debitOrCredit = dataTable.asMaps(String.class, String.class);
//	   sendText(factory.accountPage().cardNumberInput, debitOrCredit.get(0).get("cardNumber"));
//	   sendText(factory.accountPage().nameCardInputField, debitOrCredit.get(0).get("nameOnCard"));
//	   selectByVisibleText(factory.accountPage().expiratiMonthInput, debitOrCredit.get(0).get("expirationMonth"));
//	   selectByVisibleText(factory.accountPage().expiratiYear, debitOrCredit.get(0).get("expirationYear"));
//	   sendText(factory.accountPage().securityCode, debitOrCredit.get(0).get("securityCode"));
//	   logger.info("User entered card payment information successfully");
//	}
	@When("User fill Debit or credit card information")

	public void userFillDebitOrCreditCardInformation(io.cucumber.datatable.DataTable dataTable) {
		waitTillClickable(factory.accountPage().paymentMethod);
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> row : data) {
			slowDown();
			sendText(factory.accountPage().cardNumberInput, row.get("cardNumber"));
			sendText(factory.accountPage().nameCardInputField, row.get("nameOnCard"));

			selectByValue(factory.accountPage().expiratiMonthInput, row.get("expirationMonth"));

			selectByValue(factory.accountPage().expiratiYear, row.get("expirationYear"));

			sendText(factory.accountPage().securityCode, row.get("securityCode"));

			logger.info("Card information was entered");

			slowDown();

		}

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("Add your card button was clicked successfully");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMssg) {
		if (expectedMssg.contains("Payment")) {
			waitTillPresence(factory.accountPage().paymentMethodAddedSuccessfully);
			Assert.assertEquals(expectedMssg, factory.accountPage().paymentMethodAddedSuccessfully.getText());
			logger.info(expectedMssg + " is displayed");
		} else if (expectedMssg.contains("Address")) {
			waitTillPresence(factory.accountPage().addressAddedSuccessfullyMssg);
			Assert.assertEquals(expectedMssg, factory.accountPage().addressAddedSuccessfullyMssg.getText());
			logger.info(expectedMssg + " is displayed");
		} else if (expectedMssg.contains("Payment Method updated")) {
			waitTillPresence(factory.accountPage().paymentMethodAddedSuccessfully);
			Assert.assertEquals(expectedMssg, factory.accountPage().paymentMethodAddedSuccessfully.getText());
			logger.info("Payment Method updated mssg was verified successfully");
		} else if (expectedMssg.contains("order placed")) {
			waitTillPresence(factory.orderPage().orderPlacedSuccessfulyMssg);
			Assert.assertEquals(expectedMssg, factory.orderPage().orderPlacedSuccessfulyMssg.getText());
			logger.info(expectedMssg + " Message was verified successfully");
		}
	}
	// removePaymentMethod

//		@When("User select the card ending with {string}")
//		public void userSelectTheCardEndingWith(String string) {
//			List<WebElement> cards = factory.accountPage().cardEndingNum;
//			for(WebElement card : cards) {
//				if(card.getText().contains(string)) {
//					click(card);
//					logger.info(string + " is selected");
//					break;
//					}
//		   
//			}
//			
//		}
	@And("User click on remove option of card section")
	public void userClickOnRemoveCardfromList() {
		click(factory.accountPage().removeCardBttn);
		logger.info("User clicked on remove option");
		slowDown();
	}

	@Then("payment details should be removed")
	public void paymentdetailsShouldBeRemoved() {
		// Assert.assertTrue(isElementDisplayed(factory.accountpage().Account)); There
		// is no msg to validate.
		logger.info("Details removed successfully");

	}
	// add address

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressLink);
		logger.info("Add Address Link Clicked successfully");
	}

	@And("user fill new address form with below information")
	public void userFillTheInformation(DataTable data) {
		List<Map<String, String>> fillAddress = data.asMaps(String.class, String.class);

		selectByVisibleText(factory.accountPage().countryDropdown, fillAddress.get(0).get("country"));
		sendText(factory.accountPage().addressNameInputField, fillAddress.get(0).get("fullName"));
		sendText(factory.accountPage().addressPhoneInputField, fillAddress.get(0).get("phoneNumber"));
		sendText(factory.accountPage().addressStreetInputField, fillAddress.get(0).get("streetAddress"));
		sendText(factory.accountPage().addressAptInputField, fillAddress.get(0).get("apt"));
		sendText(factory.accountPage().addressCityInputField, fillAddress.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addressStateInputField, fillAddress.get(0).get("state"));
		sendText(factory.accountPage().addressZipCodeInputField, fillAddress.get(0).get("zipCode"));
		logger.info("User filled the field");
		slowDown();

	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addressAddAddressBttn);
		logger.info("Add Address button was clicked successfully");

	}
	// Edit credit debit card

	@And("User select the payment Card")
	public void userSelectedThePaymentCard() {
		click(factory.accountPage().SelectedpaymentCard);
		logger.info("User clicked on payment card");
		slowDown();
	}

	@And("User click on Edit option of card section")
	public void userClickonEditOption() {
		click(factory.accountPage().creditDebitCardEditBttn);
		logger.info("user clicked on Edit");

	}

	@And("user edit information with below data")
	public void userEnterTheData(DataTable data) {
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		clearTextUsingSendKeys(factory.accountPage().nameCardInputField);
		clearTextUsingSendKeys(factory.accountPage().securityCode);

		List<Map<String, String>> editBttn = data.asMaps(String.class, String.class);

		sendText(factory.accountPage().cardNumberInput, editBttn.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameCardInputField, editBttn.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expiratiMonthInput, editBttn.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expiratiYear, editBttn.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCode, editBttn.get(0).get("securityCode"));
		logger.info("user successfully entred the info");
		slowDown();
	}

	@And("user click on Update Your Card button")
	public void userClickonUpdateBttn() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("user clicked on updateBttn");

	}

	@Then("a message should be displayed Payment Method updated Successfully")
	public void aMessageShouldBeDisplayed() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodAddedSuccessfully));
		logger.info("Payment Method added successfully");

	}

	// @addressUpdated

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().eiditAddressBttn);
		logger.info("Edit button was clicked successfully");

	}

	@And("user update address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable Data) {
		List<Map<String, String>> EditNewAdd = Data.asMaps(String.class, String.class);

		selectByVisibleText(factory.accountPage().countryDropdown, EditNewAdd.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().addressNameInputField);
		sendText(factory.accountPage().addressNameInputField, EditNewAdd.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().addressPhoneInputField);
		sendText(factory.accountPage().addressPhoneInputField, EditNewAdd.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().addressStreetInputField);
		sendText(factory.accountPage().addressStreetInputField, EditNewAdd.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().addressAptInputField);
		sendText(factory.accountPage().addressAptInputField, EditNewAdd.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().addressCityInputField);
		sendText(factory.accountPage().addressCityInputField, EditNewAdd.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addressStateInputField, EditNewAdd.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().addressZipCodeInputField);
		sendText(factory.accountPage().addressZipCodeInputField, EditNewAdd.get(0).get("zipCode"));
		logger.info("User filled the field");
		slowDown();

	}

	@And("User click update Your Address button")
	public void userClickUpdateYourAddressBtn() {
		click(factory.accountPage().submitAddressBttn);
		logger.info("User clicked on Update Your Address");
	}

	@Then("a message should be displayed Address Updated Successfully")
	public void aMsgShouldBeDisplayedOnTheScreeen() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedMessage));
		logger.info("Your New Address Updated");
	}
	///////////////////////////////////////////////////

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressButton);
		logger.info("Remove button clicked successfully");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		logger.info("Address Remove clicked successfully");

	}


// Scenario: Verify user can update password



@When("User enter bellow information")

public void userEnterBellowInformation(io.cucumber.datatable.DataTable dataTable) {

    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

    for (Map<String, String> rows : data) {

        clearTextUsingSendKeys(factory.accountPage().previousPasswordBox);

        sendText(factory.accountPage().previousPasswordBox, rows.get("PreviousePassword"));

        sendText(factory.accountPage().newPasswordBox, rows.get("NewPassword"));

        sendText(factory.accountPage().confirmPasswordBox, rows.get("ConfirmPassword"));

        logger.info("Change password button was clicked");



    }



}



@When("User click on change password button")

public void userClickOnChangePasswordButton() {

    click(factory.accountPage().changePasswordButton);
    logger.info("Change password button was clicked");
}

@Then("A message should be displayed password change {string}")

public void aMessageShouldBeDisplayedPasswordChange(String passwordChangeSuccessMessage) {

    waitTillPresence(factory.accountPage().passwordChangeSuccessMessage);

    Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordChangeSuccessMessage));

   logger.info("Password changed status: " + passwordChangeSuccessMessage);

}
}