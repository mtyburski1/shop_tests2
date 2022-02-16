package models.shop;

import org.openqa.selenium.WebDriver;
import pages.base_page.BasePage;
import pages.shop_pages.CategoryPage;
import pages.shop_pages.ItemsPage;

public class Categories extends BasePage {
    public Categories(WebDriver driver){
        super(driver);
    }
    public static String getCategoriesAssertionText() {
        CategoryPage categoryPage = new CategoryPage(driver);
        ItemsPage itemsPage = new ItemsPage(driver);
        if (itemsPage.getCategoriesItems() <= 1) {
            return "There is " +
                    categoryPage.getSubCategoriesCountValue() + " product.";
        } else
            return "There are " +
                    categoryPage.getProductsCountValue() + " products.";
    }
}

