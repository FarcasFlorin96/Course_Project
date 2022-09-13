package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {
    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(id = "phone")
    private WebElement phoneField;
    @FindBy(id = "country")
    private WebElement countryField;
    @FindBy(id = "city")
    private WebElement cityField;
    @FindBy(id = "postCode")
    private WebElement postCodeField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationHeader;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptionsHeader;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement contactNextButton;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptions;

    public ContactInformation(WebDriver driver) {PageFactory.initElements(driver, this);}

    public WebElement getContactInformationHeader(){return this.contactInformationHeader;}
    public WebElement getCourseOptionsHeader(){return this.courseOptionsHeader;}

    public void clickOnContactNextButton() {this.contactNextButton.click();}

    public void EmailField() {this.emailField.sendKeys("florinskrill@yahoo.com");}
    public void PhoneField() {this.phoneField.sendKeys("0757425484");}
    public void CountryField() {this.countryField.sendKeys("Romania");}
    public void CityField() {this.cityField.sendKeys("Brasov");}
    public void PostCodeField() {this.postCodeField.sendKeys("505400");}

    public void contactFillInForm() {
        this.emailField.sendKeys("florinskrill@yahoo.com");
        this.phoneField.sendKeys("0757425484");
        this.countryField.sendKeys("Romania");
        this.cityField.sendKeys("Brasov");
        this.postCodeField.sendKeys("505400");
    }
}
