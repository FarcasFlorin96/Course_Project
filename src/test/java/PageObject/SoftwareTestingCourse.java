package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoftwareTestingCourse {
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollmentButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMoreButton;

    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement arrowUpButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridReadMoreButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement inPersonReadMoreButton;
    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement whatYoullLearnButton;
    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement readMoreButton;
    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement learnSeleniumReadMoreButton;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement emailSubmitButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualHeader;
    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/h2")
    private WebElement learnSeleniumHeader;

    @FindBy(xpath = "/html/body/section[8]/div/div/div[1]/h2")
    private WebElement ContactHeader;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/h1")
    private WebElement mainPageHeader;
    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement learnTheFundamentalsHeader;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[2]/div/div")
    private WebElement HybridHeader;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[3]/div/div/h3")
    private WebElement InPersonHeader;

    @FindBy (xpath = "/html/body/nav/div/a")
    private WebElement SoftwareTestingCourseHeader;

    @FindBy (xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy (xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startTheEnrollmentHeader;


    public SoftwareTestingCourse(WebDriver driver) {PageFactory.initElements(driver, this); }
    public void clickOnStartEnrollmentButton() {this.startEnrollmentButton.click(); }
    public void clickOnVirtualReadMoreButton() {
        this.virtualReadMoreButton.click();
    }
    public void clickOnArrowButton() {this.arrowUpButton.click();}
    public void clickOnHybridReadMoreButton() { this.hybridReadMoreButton.click();}
    public void clickOnInPersonReadMoreButton() {this.inPersonReadMoreButton.click();}
    public void clickOnWhatYoullLearnButton() {this.whatYoullLearnButton.click();}
    public void clickOnReadMoreButton() {this.readMoreButton.click();}
    public void clickOnLearnSeleniumButton() {this.learnSeleniumReadMoreButton.click();}
    public void clickOnEmailSubmitButton() {this.emailSubmitButton.click();}



    public WebElement getVirtualHeader() {return this.virtualHeader;}
    public WebElement getContactHeader(){
        return this.ContactHeader;
    }
    public WebElement getHybridHeader(){return this.HybridHeader;}
    public WebElement getInPersonHeader(){return this.InPersonHeader;}
    public WebElement getSoftwareTestingCourseHeader(){return this.SoftwareTestingCourseHeader;}
    public WebElement getLearnTheFundamentalsHeader(){return this.learnTheFundamentalsHeader;}
    public WebElement getLearnSeleniumHeader(){return this.learnSeleniumHeader;}
    public WebElement getStartTheEnrollmentHeader(){return this.startTheEnrollmentHeader;}

    public void writeEmailField() {this.emailField.sendKeys("florinskrill@yahoo.com");}
    public void writeInvalidEmailField() {this.emailField.sendKeys("florin");}

    public String getMainPageHeaderText() {
        return this.mainPageHeader.getText();
    }
    public String getLearnTheFundamentalsHeaderText(){
        return this.learnTheFundamentalsHeader.getText();
    }
}

