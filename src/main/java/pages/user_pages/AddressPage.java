package pages.user_pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

import java.util.List;

public class AddressPage extends BasePage {
    public AddressPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@name='address1']")
    private WebElement addressInput;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityInput;

    @FindBy(xpath = "//input[@name='postcode']")
    private WebElement postCodeInput;

    @FindBy(css = "select.form-control option")
    private List<WebElement> chooseCountryDD;

    public AddressPage chooseCountry(int number){
        if(number == 1)
            chooseCountryDD.get(1).click(); //Poland
        if(number == 2)
            chooseCountryDD.get(2).click(); //US
        return this;
        }
        public AddressPage setPostCode(){
            postCodeInput.sendKeys("64-245");
            return this;
        }
        public AddressPage setCity(){
            Faker faker = new Faker();
            cityInput.sendKeys(faker.address().city());
            return this;
        }
        public AddressPage setAddress(){
            Faker faker = new Faker();
            addressInput.sendKeys(faker.address().streetAddress());
            return this;
        }
    }
