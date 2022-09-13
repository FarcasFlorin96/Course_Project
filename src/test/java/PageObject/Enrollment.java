package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enrollment {
    @FindBy(id = "firstName")
    private WebElement firstNameField;
    @FindBy(id = "lastName")
    private WebElement lastNameField;
    @FindBy(id = "username")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "cpassword")
    private WebElement confirmPasswordField;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement PersonalInformationHeader;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement ContactInformationHeader;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement PaymentInformationHeader;


    public Enrollment(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void writeFirstNameField() {this.firstNameField.sendKeys("Florin");}
    public void writeLastNameField() {this.lastNameField.sendKeys("Farcas");}
    public void writeUsernameField() {this.usernameField.sendKeys("Ragnarica");}
    public void writePasswordField() {this.passwordField.sendKeys("Parola");}
    public void writeConfirmPasswordField() {this.confirmPasswordField.sendKeys("Parola");}

    public void clickOnNextButton() {this.nextButton.click();}

    public void fillInForm() {
        this.firstNameField.sendKeys("Florin");
        this.lastNameField.sendKeys("Farcas");
        this.usernameField.sendKeys("Ragnarica");
        this.passwordField.sendKeys("Parola");
        this.confirmPasswordField.sendKeys("Parola");
        clickOnNextButton();
    }

    public WebElement getPersonalInformationHeader(){return this.PersonalInformationHeader;}
    public WebElement getContactInformationHeader(){return this.ContactInformationHeader;}
    public WebElement getNextButton() {return this.nextButton;}
}

