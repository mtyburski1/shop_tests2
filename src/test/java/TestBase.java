import models.UserFactory;
import org.openqa.selenium.WebDriver;
import models.managers.factory.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import models.propety_load.PropertyLoad;
import org.testng.asserts.SoftAssert;

public class TestBase {
    protected WebDriver driver;
    SoftAssert softAssert;

    @BeforeMethod
    public void setUp() {
        softAssert = new SoftAssert();

        driver = new DriverFactory().getDriver(PropertyLoad.loadAPropetyFile("chromeDriver"));

        driver.get(PropertyLoad.loadAPropetyFile("mainPage"));
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }

}
