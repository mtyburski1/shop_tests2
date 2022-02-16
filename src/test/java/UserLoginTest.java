import models.User;
import models.UserFactory;
import org.testng.annotations.Test;
import pages.user_pages.LoginPage;
import pages.user_pages.MenuPage;

public class UserLoginTest extends TestBase {
    @Test
    public void shouldLoginCorrectly() {
        User user =  UserFactory.getAlreadyRegisteredUser();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginUser(user.getEmail(), user.getPassword());
        MenuPage menuPage = new MenuPage(driver);
        menuPage.logOut();
    }
}
