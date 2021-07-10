package com.demoqa.automation.pageobjects;

import com.demoqa.automation.utils.Times;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

@DefaultUrl("https://www.demoqa.com/automation-practice-form")
public class Formpage extends PageObject {

   public By INPUT_FIRSTNAME = By.id("firstName");
   public By INPUT_LASTNAME = By.id("lastName");
   public By INPUT_EMAIL_USER = By.id("userEmail");
   public By GENDER_RADIO = By.xpath("//label[@for='gender-radio-2']");
   public By INPUT_NUMBER = By.id("userNumber");
   public By INPUT_DATE_OF_BIRTH = (By.id("dateOfBirthInput"));
   public By MONTH_SELECT = By.xpath("//select[@class='react-datepicker__month-select']");
   public By OPTION_MONTH = By.xpath("//*[@value='7' and text()='August']");
   public By YEAR_SELECT = By.xpath("//*[@class='react-datepicker__year-select']");
   public By OPTION_YEAR = By.xpath("//*[@value='1978' and text()='1978']");
   public By OPTION_DAY = By.xpath("//*[@class='react-datepicker__day react-datepicker__day--013' and text()='13']");
   public By INPUT_SUBJECTS = By.xpath("//input[@id='subjectsInput']");
   public By CHECKBOX_HOBBIES = By.xpath("//label[@for='hobbies-checkbox-1']");
   public By SELECT_UPLOAD = By.id("uploadPicture");
   public By ADDRESS_CURRENT_INPUT = By.id("currentAddress");
   public By INPUT_STATE = By.xpath("//*[@id='react-select-3-input' and @type='text']");
   public By CITY_INPUT = By.xpath("//*[@id='react-select-4-input' and @type='text']");
   public By SUBMIT_BUTTON = By.id("submit");
   public By VALIDATION_OF_SUBMITTING_FORM = By.xpath("//*[@id='example-modal-sizes-title-lg' and text()='Thanks for submitting the form']");
   public By CLOSE_BUTTON = By.xpath("//*[@id='closeLargeModal' and @type='button']");









   public void sendFirstName(String string) {
      getDriver().findElement(INPUT_FIRSTNAME).sendKeys(string);
   }

   public void sendLastName(String string) {
      getDriver().findElement(INPUT_LASTNAME).sendKeys(string);
   }

   public void sendUserEmail(String string) {
      getDriver().findElement(INPUT_EMAIL_USER).sendKeys(string);
   }

   public void sendGenderRadioClick() {
      getDriver().findElement(GENDER_RADIO).click();
   }

   public void sendUserNumber(String string) {
      getDriver().findElement(INPUT_NUMBER).sendKeys(string);
   }

   public void clickDateOfBirth(String string) {
      getDriver().findElement(INPUT_DATE_OF_BIRTH).click();
   }

   public void clickMonthSelectList(String string) {
      getDriver().findElement(MONTH_SELECT).click();
   }

   public void clickMonthOption() {
      getDriver().findElement(OPTION_MONTH).click();
   }

   public void clickSelectYear() {
      getDriver().findElement(YEAR_SELECT).click();
   }

   public void clickYearOption() {
      getDriver().findElement(OPTION_YEAR).click();
      // getDriver(). findElement(subjectsContainerList).sendKeys(String string);
   }

   public void clickDayOption() {
      getDriver().findElement(OPTION_DAY).click();
   }

   public void enterSubject() {
      getDriver().findElement(INPUT_SUBJECTS).sendKeys(Keys.ENTER);
   }

   public void clickHobbiesCheckbox() {
      getDriver().findElement(CHECKBOX_HOBBIES).click();
   }

   public void clickSelectPicture(String string) {
      getDriver().findElement(SELECT_UPLOAD).sendKeys(string);
   }

   public void sendCurrentAddress(String string) {
      getDriver().findElement(ADDRESS_CURRENT_INPUT).sendKeys(string);
   }

   public void sendState(String string) {
      getDriver().findElement(INPUT_STATE).sendKeys(string);
   }

   public void enterState() {
      getDriver().findElement(INPUT_STATE).sendKeys(Keys.ENTER);
   }

   public void sendCity(String string) {
      getDriver().findElement(CITY_INPUT).sendKeys(string);
   }

   public void enterCity() {
      getDriver().findElement(CITY_INPUT).sendKeys(Keys.ENTER);
   }

   public void validations(String expectSubmittingForm) {
      assertEquals(getDriver().findElement(VALIDATION_OF_SUBMITTING_FORM).getText(), expectSubmittingForm);
   }

   {
      //public void clickCloseButton () {
      //getDriver().findElement(CLOSE_BUTTON).click();

   }

   //public void clickSubmitButton () {
   //getDriver().findElement(CLOSE_BUTTON).click();




}












