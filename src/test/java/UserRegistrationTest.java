import models.User;
import models.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.user_pages.*;


public class UserRegistrationTest extends TestBase{

    @Test
    public void shouldRegister() {
        User user =  UserFactory.getRandomUser();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.GoToRegister()
                .fillGender(user.getGender())
                .fillFirstName(user.getFirstName())
                .fillLastName(user.getLastName())
                .fillEmail(user.getEmail())
                .fillPassword(user.getPassword())
                .offersEmailCheck(true)
                .fillPrivacyCheck(true)
                .newsletterCheck(true)
                .fillPsgdpr(true)
                .registerClick()
                .accountInformations()
                .logOut();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginUser(user.getEmail(), user.getPassword());


    }
}

