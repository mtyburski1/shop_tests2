package pages.shop_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class PopUpInfoPage extends BasePage {
    public PopUpInfoPage(WebDriver driver){
        super(driver);
    }
    @FindBy(css = ".cart-content .cart-products-count")
    private WebElement itemQuantityText;

    @FindBy(css = "quantity_wanted")
    private WebElement itemQuantityValue;

    public boolean getItemQuantityTextIsDisplayed(){
        wait.until(c ->itemQuantityText.isDisplayed());
        return itemQuantityText.isDisplayed();
    }
//    public String getItenQuantityValue(){
//        wait.until(c ->itemQuantityText.isDisplayed());
//       return itemQuantityValue;
//    }

}
