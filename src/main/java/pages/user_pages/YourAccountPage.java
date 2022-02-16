package pages.user_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountPage extends MenuPage{

    public YourAccountPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "identity-link")
    private WebElement accountInformations;

    @FindBy(id = "history-link")
    private WebElement ordersHistoryInfoBtn;

    @FindBy(css = "table.table tbody tr th")
    private WebElement accOrderReferenceText;

    public String getAccOrderReferenceText(){
        return accOrderReferenceText.getText().trim();

    }

    public YourAccountPage goToOrdersHistoryInfo(){
        ordersHistoryInfoBtn.click();
        return this;
    }

    public YourAccountPage accountInformations(){
        GoToSingInAcc();
        accountInformations.click();
        return this;
    }
}