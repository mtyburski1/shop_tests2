package pages.base_page;

import com.github.javafaker.Faker;
import models.UserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Random;

public class BasePage extends UserFactory {
    public static WebDriver driver;
    public WebDriverWait wait;
    public Random random;
    public Faker faker;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        faker = new Faker();
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        random = new Random();
    }

    public void click(WebElement element){
        element.click();
    }
    public void sendKeys(WebElement element, String text){
        wait.until((ExpectedConditions.visibilityOf(element)));
        element.sendKeys(text);
    }

}
