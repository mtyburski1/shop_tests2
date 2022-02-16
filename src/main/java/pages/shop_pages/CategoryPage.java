package pages.shop_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import pages.base_page.BasePage;

import java.util.List;

public class CategoryPage extends BasePage {
    public CategoryPage(WebDriver driver){
        super(driver);
    }
    @FindBy(className = "h1")
    private WebElement categoryName;

    @FindBy(css = "div[itemprop='itemListElement']")
    private List<WebElement> itemsList;

    @FindBy(css = "div .total-products p")
    private WebElement productsCountText;

    public CategoryPage getCategoryName(){
        categoryName.getText();
        return this;
    }
    public CategoryPage countItems(){
        itemsList.size();
        return this;
    }
    public String getProductsCountText(){
        return productsCountText.getText();
    }
    public String getProductsCountValue(){
        return productsCountText.getText().substring(10, 12).trim();
    }
    public String getSubCategoriesCountValue(){
        return productsCountText.getText().substring(9, 11).trim();
    }
}
