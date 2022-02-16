package pages.shop_pages;

import models.shop.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base_page.BasePage;

public class ProductBasketPage extends BasePage {
    private Product product;
    public ProductBasketPage(WebDriver driver) {
        super(driver);
        product = new Product();
    }

    public Product getProduct(){
        return product.setProductName(product.getProductName())
                .setPrice(product.getPrice())
                .setAmount(product.getAmount())
                .setTotalPrice(product.getTotalPrice());
    }

    private double getTotalCost() {
        return Double.parseDouble(driver.findElement(By.cssSelector("span.product-price strong")).getText().substring(1));
    }

    private int getQuantity() {
        return Integer.parseInt(
                driver.findElement(By.cssSelector("div.product-line-grid input")).getAttribute("value"));
    }

    private double getPrice() {
        return Double.parseDouble(
                driver.findElement(By.cssSelector("div.product-line-grid span.price"))
                        .getText()
                        .substring(1));
    }

    private String getName() {
        return driver.findElement(By.cssSelector("div.product-line-grid a.label")).getText();
    }
}
