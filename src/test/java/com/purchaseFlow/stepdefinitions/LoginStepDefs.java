package com.purchaseFlow.stepdefinitions;

import com.purchaseFlow.pages.LoginPage;
import com.purchaseFlow.utilities.ConfigurationReader;
import com.purchaseFlow.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class LoginStepDefs {

    Actions action = new Actions(Driver.get());
    LoginPage lp = new LoginPage();

    @Given("User landed login page")
    public void User_landed_login_page () throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @Given("User clicks the sign in button")
    public void user_clicks_the_sign_in_button() {
        lp.signIn.click();

    }
    @When("User enters email and password")
    public void User_enters_email_and_password() {
        lp.login();

    }
    @And("User is redirected to homepage")
    public void User_is_redirected_to_homepage() {
        String urlHomepage = ConfigurationReader.get("url_homepage");
        Driver.get().get(urlHomepage);

    }
    @When("User searches {string}")
    public void user_searches(String productName) {
        lp.search.sendKeys(productName);
        lp.searchBtn.click();

    }
    @When("User adds the product to cart")
    public void user_adds_the_product_to_cart() throws InterruptedException {
       action.sendKeys(Keys.PAGE_DOWN).perform();
       action.moveToElement(lp.tshirtsImage).perform();
        lp.addToCart.click();

    }
    @When("User clicks proceed the checkout button")
    public void user_clicks_proceed_the_checkout_button() {
        lp.proceedCheckOutLink.click();

    }
    @When("User clicks proceed button in the summary page")
    public void user_clicks_proceed_button_in_the_summary_page() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
      lp.proceedCheckOutLink.click();

    }
    @When("User clicks proceed button in address")
    public void user_clicks_proceed_button_in_address() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        lp.proceedOfAddressButton.click();

    }
    @When("User clicks Checkbox of agreement and clicks proceed button")
    public void user_clicks_checkbox_of_agreement_and_clicks_proceed_button() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        lp.checkBox.click();
        lp.proceedOfShippingButton.click();

    }
    @When("Select the bank wire payment")
    public void select_the_bank_wire_payment() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        lp.bankWire.click();

    }

    @And("Confirm the order")
    public void confirmTheOrder() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        lp.confirmOrder.click();

    }

    @Then("Verify the message {string} is displayed")
    public void verifyTheMessageIsDisplayed(String expectedMessage) {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        String actualMessage = lp.confirmText.getText();
        Assert.assertEquals("The message is not expected",expectedMessage,actualMessage);

    }

    @Then("Verify user can see the summary of order")
    public void verifyUserCanSeeTheSummaryOfOrder() {
        action.sendKeys(Keys.PAGE_DOWN).perform();
        String expectedMessage = "You have chosen to pay by bank wire. Here is a short summary of your order:";
        String actualMessage = lp.summaryOfProducttMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }


}

