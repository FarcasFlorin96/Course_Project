package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement successHeader;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")

    private WebElement returnToHomepageButton;
    public SuccessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public WebElement getSuccessHeader() {return this.successHeader;}
    public void clickOnReturnToHomepageButton() {this.returnToHomepageButton.click();}


}
