package pages.user_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MenuPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(id = "submit-login")
    private WebElement submitBtn;

    @FindBy(xpath = "//a[@data-link-action='display-register-form']")
    private WebElement goToRegister;


    public void loginUser(String email, String password){
        goToSingIn();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitBtn.click();
    }
}
