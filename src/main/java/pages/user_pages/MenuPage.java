package pages.user_pages;

import pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MenuPage extends BasePage {

    public MenuPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    private WebElement goToSingIn;

    @FindBy(xpath = "//a[@data-link-action='display-register-form']")
    private WebElement goToRegister;

    @FindBy(xpath = "//a[@title='View my customer account']")
    private WebElement goToSingIntAcc;

    @FindBy(css = ".logout")
    private WebElement logOut;

    @FindBy(css = ".img-responsive")
    private WebElement mainMenuLogoBtn;

    @FindBy(css = "li#category-3.category")
    private WebElement clothesBtn;

    @FindBy(css = ".category-sub-menu li")
    private List<WebElement> subClothesBtns;

    @FindBy(css = "li#category-6.category")
    private WebElement accessoriesBtn;

    @FindBy(css = ".category-sub-menu li")
    private List<WebElement> subAccessoriesBtns;

    @FindBy(css = "li#category-9.category")
    private WebElement artBtn;

    @FindBy(css = ".shopping-cart")
    private WebElement cartBtn;

    public MenuPage goToCart(){
        cartBtn.click();
        return this;
    }

    public MenuPage goToClothes(){
        clothesBtn.click();
        return this;
    }
    public MenuPage getClothesText(){
        clothesBtn.getText();
        return this;
    }
    public MenuPage goToAccessories(){
        accessoriesBtn.click();
        return this;
    }
    public MenuPage getAccessioresText(){
        accessoriesBtn.getText();
        return this;
    }
    public MenuPage goToArt(){
        artBtn.click();
        return this;
    }
    public MenuPage getArtText(){
        artBtn.getText();
        return this;
    }

    public void goToSingIn(){
        goToSingIn.click();
    }

    public RegistrationPage GoToRegister(){
        goToSingIn.click();
        goToRegister.click();
        return new RegistrationPage(driver);
    }
    public void GoToSingInAcc(){
        wait.until(ExpectedConditions.elementToBeClickable(goToSingIntAcc));
        goToSingIntAcc.click();
    }

    public void logOut(){
        logOut.click();
    }

    public MenuPage mainMenuLogoClick(){
        mainMenuLogoBtn.click();
        return this;
    }
    public MenuPage goToMenClothes(){
        subClothesBtns.get(0).click();
        return this;
    }
    public MenuPage goToWomenClothes(){
        subClothesBtns.get(1).click();
        return this;
    }
    public MenuPage goToStationeryAccessories(){
        subAccessoriesBtns.get(0).click();
        return this;
    }
    public MenuPage goToHomeAccessories(){
        subAccessoriesBtns.get(1).click();
        return this;
    }
    public MenuPage goToSingInAcc(){
        goToSingIntAcc.click();
        return this;
    }
}

