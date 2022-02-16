import pages.shop_pages.ItemsPage;
import models.shop.ProductList;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.shop_pages.PopUpInfoPage;

public class bkabkabk extends TestBase{

    @Test
    public void shuldOpenRandom(){
        ProductList list = new ProductList();
        String name;
        int quantity, cumulativeQuantity = 0;
        double price, totalCost;
        ItemsPage itemsPage = new ItemsPage(driver);
        for(int i = 0; i < 5; i++) {
            Assert.assertTrue(
                    itemsPage.getItemList()
                            .setWantedQuantity()
                            .addToCartClick()
                            .getItemQuantityTextIsDisplayed());
            itemsPage
                    .continueShoppingClick()
                    .mainMenuLogoClick();
        }


        System.out.println(itemsPage.textList.size());
        for (String s : itemsPage.priceList) {
            System.out.println(s);
        }
        PopUpInfoPage popUpInfoPage = new PopUpInfoPage(driver);
//        Assert.assertTrue(popUpInfoPage.getItemQuantityTextIsDisplayed());

    }
}
