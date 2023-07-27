@Regression
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on sign in option
    And User enter email 'kubra@gmail.com' and password 'Malyar@40056312'
    And User click on login button
    And user should be logged in into Account
    When User click on Account option

  @updateProfileAndPhone
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Najmodin Khann' and Phone '202-145-9898'
    And User click on Update button
    Then user profile information should be updated

  @ChangePassword
  Scenario: Verify user can update password
    When User click on Account option
    And User enter bellow information
      | PreviousePassword | NewPassword   | ConfirmPassword |
      | Malyar@4005631           | Malyar@40056312 | Malyar@40056312   |
    And User click on change password button
    Then A message should be displayed password change 'password changed successfully'

  @paymentMethod
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard     | expirationMonth | expirationYear | securityCode |
      | 9876543212345678 | koobrra malyar |              10 |           2026 |          969 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  @editPaymentMethod
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    #And User select the card ending with '6363'
    And User select the payment Card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1212541255215577 | Shir Shahh   |              10 |           2026 |          969 |
    And user click on Update Your Card button
    Then a message should be displayed Payment Method updated Successfully

  @removePaymentMethod
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User select the payment Card
    #And User select the card ending with '5656'
    And User click on remove option of card section
    Then payment details should be removed

  @addNewAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber  | streetAddress | apt  | city       | state    | zipCode |
      | United States | Ghafoor  | 202 437 5694 |         25123 | 1514 | Alexandria | Virginia |   23123 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @addressUpdated
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user update address form with below information
      | country       | fullName | phoneNumber  | streetAddress | apt  | city       | state    | zipCode |
      | United States | Zalmay Khann   | 202 353 5656 |         46612 | 1510 | Alexandria | Virginia |   22321 |
    And User click update Your Address button
    Then a message should be displayed Address Updated Successfully

  @removeAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
