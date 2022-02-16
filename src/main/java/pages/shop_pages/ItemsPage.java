package pages.shop_pages;

import models.shop.ItemList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;
import pages.user_pages.MenuPage;

import java.util.ArrayList;
import java.util.List;

public class ItemsPage extends BasePage {
    public List<String> textList = new ArrayList<>();
    public List<String> priceList = new ArrayList<>();
    double priceSum = 0;
    ItemList items = new ItemList();

    public ItemsPage(WebDriver driver){
        super(driver);
    }
    @FindBy(css = "div[itemprop='itemListElement']")
    private List<WebElement> itemList;

    @FindBy(id = "quantity_wanted")
    private WebElement quantityInput;

    @FindBy(css = ".add-to-cart")
    private WebElement addToCartBtn;

    @FindBy(css = ".btn-secondary")
    private WebElement continueShoppingBtn;

    @FindBy(css = ".h1")
    private WebElement productName;

    @FindBy(css = "span[content]")
    private WebElement productPrice;

    public int getCategoriesItems(){
        return itemList.size();
    }

    public ItemsPage getItemList(){
        int siema = 0;
        itemList.get(random.nextInt(0, 7)).click();
        String text = productName.getText();
        double text2 = Double.parseDouble(productPrice.getText().substring(1));
        if(!textList.contains(text))
        textList.add(text);
//        priceList.add(text2);
        priceSum += text2;
        System.out.println(priceSum);
        return this;
    }
    public ItemsPage getRandomItemsFromMainPage(){
        itemList.get(random.nextInt(0, 7)).click();
        return this;
    }

    public ItemsPage setWantedQuantity(){
            quantityInput.clear();
            quantityInput.sendKeys(String.valueOf(faker.random().nextInt(1,5)));
            return this;
    }
    public PopUpInfoPage addToCartClick(){
        addToCartBtn.click();
        return new PopUpInfoPage(driver);
    }
    public MenuPage continueShoppingClick(){
        wait.until(c -> continueShoppingBtn.isDisplayed());
        continueShoppingBtn.click();
        return new MenuPage(driver);
    }

    }
