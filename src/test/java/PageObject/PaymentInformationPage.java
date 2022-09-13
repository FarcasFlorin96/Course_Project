package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/label")
    private WebElement cardHolderNameHeader;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHolderNameField;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardNumberField;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement cvcField;
    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement monthOptions;
    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement yearOptions;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement paymentNextButton;

    public PaymentInformationPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    public void clickOnPaymentNextButton() {this.paymentNextButton.click();}

    public void writeCardHolderNameField() {this.cardHolderNameField.sendKeys("Farcas Florin");}
    public void writeCardNumberField() {this.cardNumberField.sendKeys("15504550780");}
    public void writeCvcField() {this.cvcField.sendKeys("123");}
    public void writeMonthOptions() {this.monthOptions.sendKeys("March");}
    public void writeYearOptions() {this.yearOptions.sendKeys("2023");}
    public void clickOnMonthOptions(String month) {this.monthOptions.click();}
    public void fillInPaymentForm() {
        this.cardHolderNameField.sendKeys("Farcas Florin");
        this.cardNumberField.sendKeys("15504550780");
        this.cvcField.sendKeys("123");
        this.monthOptions.sendKeys("March");
        this.yearOptions.sendKeys("2023");
    }
    public WebElement getCardHolderNameHeader() {return this.cardHolderNameHeader;}
    public WebElement getPaymentNextButton() {return this.paymentNextButton;}
}
