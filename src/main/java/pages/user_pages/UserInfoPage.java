package pages.user_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class UserInfoPage extends BasePage {
    public UserInfoPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "input[name='firstname']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameInput;

    public String getFirstName(){
        return firstNameInput.getText();
    }
}
