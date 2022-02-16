import models.shop.Categories;
import org.testng.annotations.Test;
import pages.shop_pages.CategoryPage;
import pages.user_pages.MenuPage;
import static org.assertj.core.api.Assertions.*;

public class CategoryShop extends TestBase {

    @Test
    public void shouldOpenCategories() {
        CategoryPage categoryPage = new CategoryPage(driver);
        MenuPage menuPage = new MenuPage(driver);

                menuPage.goToClothes();
            assertThat(menuPage.getClothesText().equals(categoryPage.getCategoryName()));
            softAssert.assertEquals(categoryPage.getProductsCountText(), Categories.getCategoriesAssertionText());

                menuPage.goToAccessories();
        assertThat(menuPage.getAccessioresText().equals(categoryPage.getCategoryName()));
        softAssert.assertEquals(categoryPage.getProductsCountText(), Categories.getCategoriesAssertionText());

                menuPage.goToArt();
            assertThat(menuPage.getArtText().equals(categoryPage.getCategoryName()));
            softAssert.assertEquals(categoryPage.getProductsCountText(), Categories.getCategoriesAssertionText());
            softAssert.assertAll();
        }

    @Test
    public void shouldOpenSubCategories() {
        CategoryPage categoryPage = new CategoryPage(driver);
        MenuPage menuPage = new MenuPage(driver);

                menuPage.goToClothes()
                        .goToMenClothes();
        assertThat(categoryPage.getCategoryName().equals("MEN"));
        softAssert.assertEquals(categoryPage.getProductsCountText(), Categories.getCategoriesAssertionText());

                menuPage.goToClothes()
                        .goToWomenClothes();
        assertThat(categoryPage.getCategoryName().equals("WOMEN"));
        softAssert.assertEquals(categoryPage.getProductsCountText(), Categories.getCategoriesAssertionText());

                menuPage.goToAccessories()
                        .goToStationeryAccessories();
        assertThat(categoryPage.getCategoryName().equals("STATIONERY"));
        softAssert.assertEquals(categoryPage.getProductsCountText(), Categories.getCategoriesAssertionText());

                menuPage.goToAccessories()
                        .goToHomeAccessories();
        assertThat(categoryPage.getCategoryName().equals("HOME ACCESSORIES"));
        softAssert.assertEquals(categoryPage.getProductsCountText(), Categories.getCategoriesAssertionText());
        softAssert.assertAll();
            }
        }

