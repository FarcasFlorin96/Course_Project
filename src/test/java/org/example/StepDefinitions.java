package org.example;

import PageObject.*;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    private final WebDriver driver = new ChromeDriver();

    SoftwareTestingCourse softwareTestingCourse;
    Enrollment enrollment;
    ContactInformation contactInformation;
    CourseOptionsPage courseOptionsPage;
    PaymentInformationPage paymentInformationPage;
    SuccessPage successPage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        softwareTestingCourse = new SoftwareTestingCourse(driver);
        enrollment = new Enrollment(driver);
        contactInformation = new ContactInformation(driver);
        courseOptionsPage = new CourseOptionsPage(driver);
        paymentInformationPage = new PaymentInformationPage(driver);
        successPage = new SuccessPage(driver);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///C:/Users/iulia/Desktop/Florin%20Curs/Testing-Env/index.html");
    }

    @Given("I am on the Enrollment Sign up page")
    public void i_am_on_the_enrollment_sign_up_page() {
        driver.get("file:///C:/Users/iulia/Desktop/Florin%20Curs/Testing-Env/routes/enrollment.html");
    }
    @Given("I am on the Contact Information Sign up page")
    public void i_am_on_the_contact_information_sign_up_page() {
        driver.get("file:///C:/Users/iulia/Desktop/Florin%20Curs/Testing-Env/index.html");
        softwareTestingCourse.clickOnStartEnrollmentButton();
        Utils.scrollToElement(driver, enrollment.getNextButton());
        enrollment.fillInForm();
    }
    @Given("I am on the Course Options page")
    public void i_am_on_the_course_options_page() {
        driver.get("file:///C:/Users/iulia/Desktop/Florin%20Curs/Testing-Env/index.html");
        softwareTestingCourse.clickOnStartEnrollmentButton();
        Utils.scrollToElement(driver, enrollment.getNextButton());
        enrollment.fillInForm();
        contactInformation.contactFillInForm();
        contactInformation.clickOnContactNextButton();
    }
    @Given("I am on the Payment Information page")
    public void i_am_on_the_payment_information_page() {
        driver.get("file:///C:/Users/iulia/Desktop/Florin%20Curs/Testing-Env/index.html");
        softwareTestingCourse.clickOnStartEnrollmentButton();
        Utils.scrollToElement(driver, enrollment.getNextButton());
        enrollment.fillInForm();
        contactInformation.contactFillInForm();
        contactInformation.clickOnContactNextButton();
        courseOptionsPage.clickOnAutomationTesterButton();
        courseOptionsPage.clickOnCourseNextButton();
        Utils.scrollToElement(driver, paymentInformationPage.getPaymentNextButton());
    }
    @Given("I am on the success page")
    public void i_am_on_the_success_page() {
        driver.get("file:///C:/Users/iulia/Desktop/Florin%20Curs/Testing-Env/index.html");
        softwareTestingCourse.clickOnStartEnrollmentButton();
        Utils.scrollToElement(driver, enrollment.getNextButton());
        enrollment.fillInForm();
        contactInformation.contactFillInForm();
        contactInformation.clickOnContactNextButton();
        courseOptionsPage.clickOnAutomationTesterButton();
        courseOptionsPage.clickOnCourseNextButton();
        Utils.scrollToElement(driver, paymentInformationPage.getPaymentNextButton());
        paymentInformationPage.fillInPaymentForm();
        paymentInformationPage.clickOnPaymentNextButton();
    }
    @When("I click the enrollment button")
    public void I_click_the_enrollment_button() {
        softwareTestingCourse.clickOnStartEnrollmentButton();
    }

    @Then("I should be taken to the {string}")
    public void i_should_be_taken_to_the_software_testing_enrollment(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }

    @When("I click the Read More button from the Virtual column")
    public void i_click_the_read_more_button_from_the_virtual_column() {
        Utils.scrollToElement(driver, softwareTestingCourse.getVirtualHeader());
        softwareTestingCourse.clickOnVirtualReadMoreButton();
    }

    @When("I click on the arrowup button")
    public void i_click_on_the_arrowup_button() {
        Utils.scrollToElement(driver, softwareTestingCourse.getContactHeader());
        softwareTestingCourse.clickOnArrowButton();
    }

    @Then("I should be taken to the top of the page")
    public void iShouldBeTakenToTheTopOfThePage() {
        Assert.assertEquals("Become a Certified Software Tester", softwareTestingCourse.getMainPageHeaderText());
    }

    @When("I click the Read More button from the Hybrid column")
    public void iClickTheReadMoreButtonFromTheHybridColumn() {
        Utils.scrollToElement(driver, softwareTestingCourse.getHybridHeader());
        softwareTestingCourse.clickOnHybridReadMoreButton();
    }

    @Then("I will be taken to the {string} page")
    public void i_should_be_taken_to_the_hybrid_page(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }

    @When("I click the Read More button from the In Person column")
    public void i_click_the_read_more_button_from_the_in_person_column() {
        Utils.scrollToElement(driver, softwareTestingCourse.getInPersonHeader());
        softwareTestingCourse.clickOnInPersonReadMoreButton();
    }

    @When("I click the What You`ll Learn button")
    public void i_click_the_what_youll_learn_button() {
        //Utils.scrollToElement(driver, softwareTestingCourse.getLearnTheFundamentalsHeader());
        softwareTestingCourse.clickOnWhatYoullLearnButton();
    }

    @Then("I should be taken to the {string} column")
    public void i_should_be_taken_to_the_read_more_button_from_learn_the_fundamentals_column(String string) {
        Assert.assertEquals(string, softwareTestingCourse.getLearnTheFundamentalsHeaderText());
    }

    @When("I click on the Read More button from the Learn The Fundamentals column")
    public void i_click_on_the_read_more_button_from_the_learn_the_fundamentals_column() {
        Utils.scrollToElement(driver, softwareTestingCourse.getLearnTheFundamentalsHeader());
        softwareTestingCourse.clickOnReadMoreButton();
    }

    @Then("I will enter the {string} ")
    public void i_will_enter_the_fundamentals_page(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }

    @When("I type my first name in the First Name field")
    public void i_type_my_first_name_in_the_first_name_field() {
        Utils.scrollToElement(driver, enrollment.getPersonalInformationHeader());
        enrollment.writeFirstNameField();
    }

    @And("I type my last Name in the Last Name field")
    public void i_type_my_last_name_in_the_last_name_field() {
        Utils.scrollToElement(driver, enrollment.getPersonalInformationHeader());
        enrollment.writeLastNameField();
    }

    @And("I type a username in Username field")
    public void i_type_a_username_in_username_field() {
        Utils.scrollToElement(driver, enrollment.getPersonalInformationHeader());
        enrollment.writeUsernameField();
    }

    @And("I type a password in the Password field")
    public void i_type_a_password_in_the_password_field() {
        Utils.scrollToElement(driver, enrollment.getPersonalInformationHeader());
        enrollment.writePasswordField();
    }

    @And("I confirm the password in the Confirm password field")
    public void i_confirm_the_password_in_the_confirm_password_field() {
        Utils.scrollToElement(driver, enrollment.getPersonalInformationHeader());
        enrollment.writeConfirmPasswordField();
    }

    @And("I click on the Next button")
    public void i_click_on_the_next_button() {
        Utils.scrollToElement(driver, enrollment.getPersonalInformationHeader());
        enrollment.clickOnNextButton();
    }
    @Then("I should be taken to the {string} text")
    public void i_should_be_taken_to_the_card_holder_name_text(String string) {
        Assert.assertTrue(driver.getPageSource().contains(string));
    }
    @Then("I should stay on the {string} text")
    public void i_should_stay_on_the_personal_information_text(String string) {
        Assert.assertTrue(driver.getPageSource().contains(string));
    }
    @When("I click on the Read More button from the Learn Selenium")
    public void i_click_on_the_read_more_button_from_the_learn_selenium() {
        Utils.scrollToElement(driver, softwareTestingCourse.getLearnSeleniumHeader());
        softwareTestingCourse.clickOnLearnSeleniumButton();
    }
    @When("I enter a valid email")
    public void i_enter_a_valid_email() {
        Utils.scrollToElement(driver, softwareTestingCourse.getStartTheEnrollmentHeader());
        softwareTestingCourse.writeEmailField();
    }
    @And("I click the submit button")
    public void i_click_the_submit_button(){
        Utils.scrollToElement(driver, softwareTestingCourse.getStartTheEnrollmentHeader());
        softwareTestingCourse.clickOnEmailSubmitButton();
    }

    @Then("the pop-up should appear")
    public void the_pop_up_should_appear() {
        driver.switchTo().alert().accept();
    }

    @When("I enter a invalid email")
    public void i_enter_a_invalid_email(){
        Utils.scrollToElement(driver, softwareTestingCourse.getStartTheEnrollmentHeader());
        softwareTestingCourse.writeInvalidEmailField();
    }
    @Then("The layer of email field should turn red")
    public void the_layer_of_email_field_should_turn_red() {
        Assert.assertTrue(driver.getPageSource().contains("error"));
    }
    @When("I type my Email in the Email field")
    public void i_type_my_email_in_the_email_field() {
        Utils.scrollToElement(driver, contactInformation.getContactInformationHeader());
       contactInformation.EmailField();
    }
    @And("I type my Phone number in the Phone field")
    public void i_type_my_phone_number_in_the_phone_field() {
        Utils.scrollToElement(driver, contactInformation.getContactInformationHeader());
        contactInformation.PhoneField();
    }
    @And("I type my Country in the Country field")
    public void i_type_my_country_in_the_country_field() {
        Utils.scrollToElement(driver, contactInformation.getContactInformationHeader());
        contactInformation.CountryField();
    }
    @And("I type my City in the City field")
    public void i_type_my_city_in_the_city_field() {
        Utils.scrollToElement(driver, contactInformation.getContactInformationHeader());
        contactInformation.CityField();
    }
    @And("I type my Post Code in the Post Code field")
    public void i_type_my_post_code_in_the_post_code_field() {
        Utils.scrollToElement(driver, contactInformation.getContactInformationHeader());
        contactInformation.PostCodeField();
    }
    @And("I click on the Contact page Next button")
    public void i_click_on_the_contact_page_next_button() {
        Utils.scrollToElement(driver, contactInformation.getContactInformationHeader());
        contactInformation.clickOnContactNextButton();
    }
    @Then("I should be taken to the {string} page")
    public void i_should_be_taken_to_the_course_options_page(String string) {
        Assert.assertTrue(driver.getPageSource().contains(string));
        Utils.scrollToElement(driver, courseOptionsPage.getCourseOptionsHeader());
    }
    @When("I click on Automation tester button")
    public void i_click_on_automation_tester_button() {
        Utils.scrollToElement(driver, courseOptionsPage.getCourseOptionsHeader());
        courseOptionsPage.clickOnAutomationTesterButton();
    }
    @And("I click the Course options Next button")
    public void i_click_the_course_options_next_button() {
        Utils.scrollToElement(driver, courseOptionsPage.getCourseOptionsHeader());
        courseOptionsPage.clickOnCourseNextButton();
    }
    @Then("I should be taken to the {string} header")
    public void i_should_be_taken_to_the_payment_information_header(String string) {
        Assert.assertTrue(driver.getPageSource().contains(string));
        Utils.scrollToElement(driver, paymentInformationPage.getCardHolderNameHeader());
    }
    @When("I type {string} as holder name")
    public void i_type_farcas_florin_as_holder_name(String string) {
        Utils.scrollToElement(driver, paymentInformationPage.getCardHolderNameHeader());
        paymentInformationPage.writeCardHolderNameField();
    }
    @And("I type {string} as card number")
    public void i_type_15504550780_as_card_number(String string) {
        Utils.scrollToElement(driver, paymentInformationPage.getCardHolderNameHeader());
        paymentInformationPage.writeCardNumberField();
    }
    @And("I type {string} as CVC")
    public void i_type_123_as_cvc(String string) {
        Utils.scrollToElement(driver, paymentInformationPage.getCardHolderNameHeader());
        paymentInformationPage.writeCvcField();
    }
    @And("I choose {string} as month")
    public void i_choose_march_as_month(String month) {
        Utils.scrollToElement(driver, paymentInformationPage.getCardHolderNameHeader());
        paymentInformationPage.writeMonthOptions();
    }
    @And("I choose {string} as year")
    public void i_choose_2023_as_year(String year) {
        Utils.scrollToElement(driver, paymentInformationPage.getCardHolderNameHeader());
        paymentInformationPage.writeYearOptions();
    }
    @And("I click on the Payment next button")
    public void i_click_on_the_payment_next_button() {
        Utils.scrollToElement(driver, paymentInformationPage.getCardHolderNameHeader());
        paymentInformationPage.clickOnPaymentNextButton();
    }
    @When("I click on {string} button")
    public void i_click_on_return_to_homepage_button(String string) {
        Utils.scrollToElement(driver, successPage.getSuccessHeader());
        successPage.clickOnReturnToHomepageButton();
    }
    @After
    public void closeBrowser (Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            String name;
            scenario.attach(screenshot, "image/png", "name");
        }
        driver.quit();
    }
}
