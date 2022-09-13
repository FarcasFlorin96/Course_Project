package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOptionsPage {
   @FindBy(xpath = "//*[@id=\"flexRadioButton2\"]")
   private WebElement automationTesterButton;
   @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
   private WebElement courseNextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptionsHeader;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInformation;
    public CourseOptionsPage(WebDriver driver) {PageFactory.initElements(driver, this); }
    public void clickOnCourseNextButton() {this.courseNextButton.click();}

    public void clickOnAutomationTesterButton() {this.automationTesterButton.click(); }

    public WebElement getCourseOptionsHeader() {return this.courseOptionsHeader;}
}
