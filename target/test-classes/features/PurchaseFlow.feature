
Feature: Purchase Flow
@wip
  Scenario: Validated User makes a purchase
  Given User landed login page
    And User clicks the sign in button
  When User enters email and password
    And User is redirected to homepage
    And User searches "t-shirts"
    And User adds the product to cart
    And User clicks proceed the checkout button
    And User clicks proceed button in the summary page
    And User clicks proceed button in address
    And User clicks Checkbox of agreement and clicks proceed button
    And Select the bank wire payment
  Then Verify user can see the summary of order
    And Confirm the order
  Then Verify the message "Your order on My Store is complete." is displayed



