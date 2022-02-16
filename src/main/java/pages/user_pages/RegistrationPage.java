package pages.user_pages;

import pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='id_gender']")
    private List<WebElement> genderSwitch;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@name='customer_privacy']")
    private WebElement customerPrivacyCheck;

    @FindBy(xpath = "//input[@name='psgdpr']")
    private WebElement psgdpr;

    @FindBy(xpath = "//input[@name='optin']")
    private WebElement offersEmailCheck;

    @FindBy(xpath ="//input[@name='newsletter']")
    private WebElement newsletterCheck;

    @FindBy(css = ".form-control-submit")
    private WebElement registerClick;

    public RegistrationPage fillGender(int gender){
        switch (gender){
            case 0:
                genderSwitch.get(0).click();
                break;
            case 1:
                genderSwitch.get(1).click();
                break;
        }
        return this;
    }
    public String getNameInfo(){
        return firstNameInput.getText();
    }
    public RegistrationPage fillFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
        return this;
    }
    public RegistrationPage fillLastName(String lastName){
        lastNameInput.sendKeys(lastName);
        return this;
    }
    public RegistrationPage fillEmail(String email){
        emailInput.sendKeys(email);
        return this;
    }
    public RegistrationPage fillPassword(String password){
        passwordInput.sendKeys(password);
        return this;
    }
    public RegistrationPage offersEmailCheck(Boolean decide){
        if(decide)
            offersEmailCheck.click();
        return this;
    }
    public RegistrationPage fillPrivacyCheck(Boolean decide){
        if(decide)
        customerPrivacyCheck.click();
        return this;
    }
    public RegistrationPage newsletterCheck(Boolean decide){
        if(decide)
            newsletterCheck.click();
        return this;
    }
    public RegistrationPage fillPsgdpr(Boolean decide){
        if(decide)
        psgdpr.click();
        return this;
    }
    public YourAccountPage registerClick(){
        registerClick.click();
        return new YourAccountPage(driver);

    }
}
