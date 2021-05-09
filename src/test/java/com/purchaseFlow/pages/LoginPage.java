package com.purchaseFlow.pages;

import com.purchaseFlow.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath  = "//a[contains(text(),'Sign in')]")
    public WebElement signIn;

    @FindBy(css =" #email")
     public WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath ="//button[@id='SubmitLogin']")
    public WebElement submit;

    @FindBy(css ="#search_query_top")
    public WebElement search;

    @FindBy(name ="submit_search")
    public WebElement searchBtn;

    @FindBy(xpath ="//span[contains(text(),'Add to cart')]")
    public WebElement addToCart;

    @FindBy(xpath ="//span[contains(text(),'Proceed to checkout')]")
    public WebElement proceedCheckOut;

    @FindBy(linkText ="Proceed to checkout")
    public WebElement proceedCheckOutLink;

    @FindBy(xpath="//a[@class='product_img_link']/img")
    public WebElement tshirtsImage;

    @FindBy(xpath ="//span[text()='Proceed to checkout']")
    public WebElement proceedOfAddressButton;

    @FindBy(name ="processCarrier")
    public WebElement proceedOfShippingButton;

    @FindBy(xpath ="//input[@id='cgv']")
    public WebElement checkBox;

    @FindBy(xpath ="//p[@class='cheque-indent']/strong")
    public WebElement summaryOfProducttMessage;

    @FindBy(className ="bankwire")
    public WebElement bankWire;

    @FindBy(xpath ="//span[text()='I confirm my order']")
    public WebElement confirmOrder;

    @FindBy(xpath ="//strong[text()='Your order on My Store is complete.']")
    public WebElement confirmText;



    public void login() {
        email.sendKeys("raeven9@mentornkc.com");
        password.sendKeys("12345");
        submit.click();

    }
public void  getSearch(){

        search.sendKeys("t-shirts");
searchBtn.click();
}
}
