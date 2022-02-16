import models.User;
import models.UserFactory;
import pages.shop_pages.ItemsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cart_pages.ShoppingCartPage;
import pages.user_pages.AddressPage;
import pages.user_pages.MenuPage;
import pages.user_pages.RegistrationPage;
import pages.user_pages.YourAccountPage;

import static org.assertj.core.api.Assertions.*;

public class PurchaseTest extends TestBase {
    @Test
    public void shouldPurchase() {
        ItemsPage itms = new ItemsPage(driver);
        MenuPage menu = new MenuPage(driver);
        ShoppingCartPage shoppingCart = new ShoppingCartPage(driver);
        for (int i = 0; i < 3; i++) {
                    itms.getRandomItemsFromMainPage()
                            .setWantedQuantity()
                            .addToCartClick();
            itms.continueShoppingClick()
                    .mainMenuLogoClick();
        }
        menu.goToCart();
        shoppingCart.checkoutBtnClick();
        RegistrationPage registrationPage = new RegistrationPage(driver);

        User user =  UserFactory.getRandomUser();
        registrationPage
                .fillGender(user.getGender())
                .fillFirstName(user.getFirstName())
                .fillLastName(user.getLastName())
                .fillEmail(user.getEmail())
                .fillPassword(user.getPassword())
                .offersEmailCheck(true)
                .fillPrivacyCheck(true)
                .newsletterCheck(true)
                .fillPsgdpr(true);
        shoppingCart
                .continueRegisterBtnClick();
        AddressPage addressPage = new AddressPage(driver);
        addressPage.setAddress()
                .setPostCode()
                .setCity()
                .chooseCountry(1);
        shoppingCart.continueAddressBtnClick()
                .setShippingMethod(1)
                .confirmDeliveryClick()
                .setPaymentOption(1)
                .paymentTermsChbxs()
                .placeOrderClick();

        Assert.assertEquals(shoppingCart.getPositiveOrderText(), "YOUR ORDER IS CONFIRMED");

        String orderReference = shoppingCart.getOrderReference1Text();

        menu.goToSingInAcc();
        YourAccountPage yourAcc = new YourAccountPage(driver);
        yourAcc.goToOrdersHistoryInfo();
        assertThat(orderReference.equalsIgnoreCase(yourAcc.getAccOrderReferenceText()));
    }
}
/*      1. Get on the 146.59.32.4 page
        2. Add three (loop) random products with a random value (1-5)
        3. Click on the cart button
        5. Fill the personal information form with random data
        6. Fill in only the necessary information
        7. Choose a shipping method
        8. Choose a payment method
        9. Check if "YOUR ORDER IS CONFIRMED" string is displayed
        10. Check that the order reference number is the same as in the Personal Data tab

 */


