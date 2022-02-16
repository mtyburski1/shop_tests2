package pages.cart_pages;

import com.github.javafaker.DragonBall;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage(WebDriver driver){
        super(driver);
    }
    @FindBy(css = "a.btn.btn-primary")
    private WebElement proceedtoCheckoutBtn;

    @FindBy(css = "button.continue.btn,btn-primary")
    private List<WebElement> continueBtn;

    @FindBy(id = "delivery_option_1]")
    private WebElement shippingMethod1Radio;

    @FindBy(css = "span.custom-radio.float-xs-left")
    private List<WebElement> shippingMethodRadio;

    @FindBy(xpath = "//button[@name='confirmDeliveryOption']")
    private WebElement confirmDeliveryBtn;

    @FindBy(xpath = "//input[@name='payment-option']")
    private List<WebElement> paymentOptionRadio;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement termsInPaymentChbxs;

    @FindBy(css = "button.btn.btn-primary.center-block")
    private WebElement placeOrderBtn;

    @FindBy(css = ".h1.card-title")
    private WebElement orderConfirmationText;

    @FindBy(css = "div .col-xs-9 strong")
    private WebElement orderReference2;

    @FindBy(css = "div#order-details li:first-of-type")
    private WebElement orderReferenceCart;

    public String getOrderReference1Text(){
        return orderReferenceCart.getText().substring(17).trim();
    }

    public String getPositiveOrderText(){
       return orderConfirmationText.getText().substring(1);
    }

    public ShoppingCartPage placeOrderClick(){
        placeOrderBtn.click();
        return this;
    }

    public ShoppingCartPage paymentTermsChbxs(){
        termsInPaymentChbxs.click();
        return this;
    }

    public ShoppingCartPage setPaymentOption(int value){
        switch(value){
            case 1:
                paymentOptionRadio.get(0).click();
                break;
            case 2:
                paymentOptionRadio.get(1).click();
                break;
        }
        return this;
    }


    public  ShoppingCartPage confirmDeliveryClick(){
        confirmDeliveryBtn.click();
        return this;
    }

    public ShoppingCartPage setShippingMethod(int value){
        switch(value){
            case 1:
                shippingMethodRadio.get(0).click();
                break;
            case 2:
                shippingMethodRadio.get(1).click();
                break;
        }
        return this;
    }

    public ShoppingCartPage checkoutBtnClick(){
        proceedtoCheckoutBtn.click();
        return this;
    }
    public ShoppingCartPage continueRegisterBtnClick(){
        continueBtn.get(0).click();
        return this;
    }
    public ShoppingCartPage continueAddressBtnClick(){
        continueBtn.get(1).click();
        return this;
    }
}
