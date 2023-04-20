package com.telus.registerdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterDemo {

	public WebDriver driver;

	// Parameterize all the Input Values
	String url = "https://nxtgenaiacademy.com/";
	String registerFormDemo = "Register For Demo";
	String firstNameValue = "Vinoth";
	String lastNameValue = "R";
	String streetAddressInput = "Street 1234#, Baster Street";
	String aptBuildingInput = "Building suite, 10th Floor";
	String stateNameValue = "Kashmir";
	String cityNameValue = "Srinagar";
	String postalCodeValue = "560078";
	String countryValue = "India";
	String emailId = "vinoth@gmail.com";
	String dateOfDemoValue = "02/10/2023";
	String timeInHour = "09";
	String timeInMinute = "30";
	String mobileNumberValue = "334466889";
	String enterYourQueryValue = "Registration has been completed." + "\r\n" + "Kindly submit the form.";
	String successfulMessageText = "Registration Form is Successfully Submitted.";

	// Parameterize all the WebElement
	String regTitleTextLocator = "//h3[contains(text(),'Register For Demo')]";
	String firstNameLocator = "vfb-5";
	String lastNameLocator = "vfb-7";
	String maleGenderLocator = "//input[@id ='vfb-31-1' or @value='Male']";
	String addressNameLocator = "vfb-13[address]";
	String streetAddressNameLocator = "vfb-13-address-2";
	String cityLocator = "vfb-13[city]";
	String stateLocator = "vfb-13[state]";
	String postalCodeLocator = "vfb-13[zip]";
	String countryLocator = "//select[@id ='vfb-13-country']";
	String emailIdLocator = "//input[@name='vfb-14']";
	String dateOfDemoLocator = "vfb-18";
	String hourLocator = "vfb-16[hour]";
	String minuteLocator = "vfb-16[min]";
	String mobileNumberLocator = "vfb-19";
	String uftLocator = "//input[@id='vfb-20-1']";
	String seleniumWebDriverLocator = "//input[@id='vfb-20-1']//preceding::span[1]";
	String enterYourQueryLocator = "//textarea[@id='vfb-23']";
	String enterTwoDigitsLocator = "vfb-3";
	String submitBtnLocator = "vfb-submit";
	String successfulMsgTextLocator = "//div[(@class ='elementor-widget-container')]";

	@BeforeClass
	public void launchApplication() {
		
		// ChromeOptions option = new ChromeOptions();
       		// option.addArguments("--remote-allow-origins=*");

		// WebDriver driver = new ChromeDriver(option);

		// Set the system property for the Edge browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");

		// Create the instance of Edge driver in Webdriver interface
		driver = new ChromeDriver();
		
		// Implicity wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Launch the application
		driver.get(url);

		// Maximize the window
		driver.manage().window().maximize();

		System.out.println("Application Launched Successfully");

	}
	

	@AfterClass
	public void closeApplication() {

		// Close the application
		driver.quit();
		System.out.println("Application is closed");

	}

	@Test(priority = 1)
	public void navigateToRegisterDemoPage() throws InterruptedException {

		/*
		 * Create an Instance in Action Class and pass the WebDriver Instance as the
		 * argument
		 */
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the Demo sites
		WebElement demoSite = driver.findElement(By.linkText("Demo Sites"));
		action.moveToElement(demoSite).perform();
		//Thread.sleep(2000);

		// Performing the mouse hover action on the Practice Automation
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAutomation).perform();

		// Click on Demo Site – Registration Form
		WebElement registrationForm = driver.findElement(By.partialLinkText("Demo Site – Registration"));
		registrationForm.click();

		System.out.println("Register Demo Page is displayed");

	}

	@Test(priority = 2)
	public void registerDemo() throws InterruptedException {

		// Identify the Registration Title
		WebElement regTitleText = driver.findElement(By.xpath(regTitleTextLocator));
		// Verify Registration Title is Displayed or not
		if (regTitleText.isDisplayed()) {
			System.out.println("Registration Title is Displayed");
		} else {
			System.out.println("Registration Title is not Displayed");
		}

		// Verify Registration Title page is Enabled or not
		if (regTitleText.isEnabled()) {
			System.out.println("Registration Title is Enabled");
		} else {
			System.out.println("Registration Title is not Enabled");
		}

		// Validating Registration Title Text
		String actualRegTitleText = regTitleText.getText();
		String expectedRegTitleText = registerFormDemo;

		if (actualRegTitleText.equals(expectedRegTitleText)) {
			System.out.println("The Registration Title Text is: " + actualRegTitleText);
		} else {
			System.out.println("Actual and expected Registration Title Text are not same");
			System.out.println("Actual Registration Text is " + actualRegTitleText);
			System.out.println("Expected Registration Text is " + expectedRegTitleText);
		}

		// Fill the Registration form by entering the all fields

		// First name
		WebElement firstName = driver.findElement(By.name(firstNameLocator));
		// Verify the First Name is displayed or not
		if (firstName.isDisplayed()) {
			System.out.println("First Name is Displayed");
		} else {
			System.out.println("First Name is not Displayed");
		}

		// Verify the First Name is Enabled or not
		if (firstName.isEnabled()) {
			System.out.println("First Name is Enabled");
			// Enter First Name
			firstName.sendKeys(firstNameValue);
			System.out.println("First Name Value is: " + firstNameValue);
		} else {
			System.out.println("First Name is not Enabled");
		}

		// Last Name

		WebElement lastName = driver.findElement(By.name(lastNameLocator));
		// Verify the First Name is displayed or not
		if (lastName.isDisplayed()) {
			System.out.println("Last Name is Displayed");
		} else {
			System.out.println("Last Name is not Displayed");
		}

		// Verify the First Name is Enabled or not
		if (lastName.isEnabled()) {
			System.out.println("Last Name is Enabled");
			// Enter Last Name
			lastName.sendKeys(lastNameValue);
			System.out.println("Last Name Value is: " + lastNameValue);
		} else {
			System.out.println("Last Name is not Enabled");
		}

		//Thread.sleep(2000);

		// Gender
		// Male Radio Button
		WebElement maleradioBtn = driver.findElement(By.xpath(maleGenderLocator));
		// Verify Male Radio Button is Displayed or not
		if (maleradioBtn.isDisplayed()) {
			System.out.println("Male Radio Button is Displayed");
		} else {
			System.out.println("Male Radio Button is not Displayed");
		}

		// Verify male Radio Button is Enabled or not
		if (maleradioBtn.isEnabled()) {
			System.out.println("Male Radio Button is enabled");
		} else {
			System.out.println("Male Radio Button is not enabled");
		}

		// Verify Male Radio Button is Selected
		if (maleradioBtn.isSelected()) {
			System.out.println("Male Radio Button is selected");
		} else {
			System.out.println("Male Radio Button is not selected");
			// Click on the Radio Button - Male
			maleradioBtn.click();
			System.out.println("Male Radio Button is now selected");
		}

		// Address
		// Street Address
		WebElement streetAddr = driver.findElement(By.name(addressNameLocator));
		// Verify the Street Address is displayed or not
		if (streetAddr.isDisplayed()) {
			System.out.println("Street Address is Displayed");
		} else {
			System.out.println("Street Address is not Displayed");
		}

		// Verify the Street Address is enabled or not
		if (streetAddr.isEnabled()) {
			System.out.println("Street Address is Enabled");
			// Enter Street Address
			streetAddr.sendKeys(streetAddressInput);
			System.out.println("Street Address Value is: " + streetAddressInput);
		} else {
			System.out.println("Street Address is not Enabled");
		}

		// Apartment Number
		WebElement apartmentNo = driver.findElement(By.id(streetAddressNameLocator));
		// Verify the Apartment Number is displayed or not
		if (apartmentNo.isDisplayed()) {
			System.out.println("Apartment Number is Displayed");
		} else {
			System.out.println("Apartment Number is not Displayed");
		}

		// Verify the Apartment Number is enabled or not
		if (apartmentNo.isEnabled()) {
			System.out.println("Apartment Number is Enabled");
			// Enter Apartment Number
			apartmentNo.sendKeys(aptBuildingInput);
			System.out.println("Apartment Number Value is : " + aptBuildingInput);
		} else {
			System.out.println("Apartment Number is not Enabled");
		}

		// City
		WebElement cityName = driver.findElement(By.name(cityLocator));
		// Verify the City Name is displayed or not
		if (cityName.isDisplayed()) {
			System.out.println("City Name is Displayed");

		} else {
			System.out.println("City Name is not Displayed");
		}

		// Verify the City Name is enabled or not
		if (cityName.isEnabled()) {
			System.out.println("City Name is enabled");
			// Enter City Name
			cityName.sendKeys(cityNameValue);
			System.out.println("City Name Value is : " + cityNameValue);
		} else {
			System.out.println("City Name is not enabled");
		}

		// State
		WebElement stateName = driver.findElement(By.name(stateLocator));
		// Verify the State is displayed or not
		if (stateName.isDisplayed()) {
			System.out.println("State is Displayed");
		} else {
			System.out.println("State is not Displayed");
		}

		// Verify the State is enabled or not
		if (stateName.isEnabled()) {
			System.out.println("State is enabled");
			// Enter State Name
			stateName.sendKeys(stateNameValue);
			System.out.println("State Value is : " + stateNameValue);
		} else {
			System.out.println("State is not Enabled");
		}

		// Postal code
		WebElement postalCode = driver.findElement(By.name(postalCodeLocator));
		// Verify the Postal Code is displayed or not
		if (postalCode.isDisplayed()) {
			System.out.println("Postal Code is Displayed");
		} else {
			System.out.println("Postal Code is not Displayed");
		}

		// Verify the Postal Code is enabled or not
		if (postalCode.isEnabled()) {
			System.out.println("Postal Code is Enabled");
			// Enter Postal Code
			postalCode.sendKeys(postalCodeValue);
			System.out.println("Postal Code Value is : " + postalCodeValue);
		} else {
			System.out.println("Postal Code is not Enabled");
		}
		// Country Drop Down
		WebElement countryDropDown = driver.findElement(By.xpath(countryLocator));
		// Verify Country Drop Down is displayed or not
		if (countryDropDown.isDisplayed()) {
			System.out.println("Country Drop Down is Displayed");
		} else {
			System.out.println("Country Drop Down is not Displayed");
		}

		// Verify Country Drop Down is enabled or not
		if (countryDropDown.isEnabled()) {
			System.out.println("Country Drop Down is Enabled");

			/*
			 * Create the object of the select and select the Item from country DropDown
			 */
			Select countryDropDownValue = new Select(countryDropDown);
			countryDropDownValue.selectByVisibleText(countryValue);
			System.out.println("Country value selected is: " + countryValue);


		} else {
			System.out.println("Country Drop Down is not Enabled");
		}


		// Email
		WebElement email = driver.findElement(By.xpath(emailIdLocator));
		// Verify the Email is Displayed or not
		if (email.isDisplayed()) {
			System.out.println("Email is Displayed");
		} else {
			System.out.println("Email is not Displayed");
		}

		// Verify the Email is enabled or not
		if (email.isEnabled()) {
			System.out.println("Email Id is Enabled");
			// Enter Email Id
			email.sendKeys(emailId);
			System.out.println("Email Id is: " + emailId);
		} else {
			System.out.println("Email is not Enabled");
		}

		// Date of Demo
		WebElement demoDate = driver.findElement(By.name(dateOfDemoLocator));
		// Verify the Demo Date is Displayed or not
		if (demoDate.isDisplayed()) {
			System.out.println("Date of Demo is Displayed");
		} else {
			System.out.println("Date of Demo is not Displayed");
		}

		// Verify the Date of Demo is enabled or not
		if (demoDate.isEnabled()) {
			System.out.println("Date of Demo is Enabled");
			// Enter Date of Demo Value
			demoDate.sendKeys(dateOfDemoValue);
			System.out.println("Date of Demo Value is : " + dateOfDemoValue);
		} else {
			System.out.println("Date of Demo is not Enabled");
		}

		// Convenient Time
		// Hour Drop Down
		WebElement convenientTimeHour = driver.findElement(By.name(hourLocator));
		// Verify Convenient Time Hour Drop Down is Displayed or not
		if (convenientTimeHour.isDisplayed()) {
			System.out.println("Hour DropDown is Displayed");
		} else {
			System.out.println("Hour DropDown is not Displayed");
		}

		// Verify Convenient Time Hour Drop Down is Enabled or not
		if (convenientTimeHour.isEnabled()) {
			System.out.println("Hour DropDown is Enabled");
			/*
			 * Create the object of the Select class and select the Item from Convenient
			 * Time Hour DropDown
			 */
			Select hourDropDown = new Select(convenientTimeHour);
			// Select Using Visible Text
			hourDropDown.selectByVisibleText(timeInHour);
			System.out.println("Hour dropdown value is: " + timeInHour);
		} else {
			System.out.println("Hour DropDown is not Enabled");
		}

		// Minute Drop Down
		WebElement convenientTimeMinute = driver.findElement(By.name(minuteLocator));
		// Verify MM Drop Down is Displayed or not
		if (convenientTimeMinute.isDisplayed()) {
			System.out.println("Minute DropDown is Displayed");
		} else {
			System.out.println("Minute DropDown is not Displayed");
		}

		// Verify Minute Drop Down is Enabled or not
		if (convenientTimeMinute.isEnabled()) {
			System.out.println("Minute DropDown is Enabled");

			// Create the Select Object and Select the Item from Minute DropDown
			Select minuteDropDown = new Select(convenientTimeMinute);
			// Select Using Visible Text
			minuteDropDown.selectByVisibleText(timeInMinute);
			System.out.println("Minute Drop Down Value is : " + timeInMinute);

		} else {
			System.out.println("Minute DropDown is not Enabled");
		}

		// Mobile Number
		WebElement mobileNum = driver.findElement(By.name(mobileNumberLocator));
		// Verify the Mobile Number is Displayed or not
		if (mobileNum.isDisplayed()) {
			System.out.println("Mobile Number is Displayed");
		} else {
			System.out.println("Mobile Number is not Displayed");
		}

		// Verify the Mobile Number is enabled or not
		if (mobileNum.isEnabled()) {
			System.out.println("Mobile Number is Enabled");
			// Enter Mobile Number
			mobileNum.sendKeys(mobileNumberValue);
			System.out.println("Mobile Number value is : " + mobileNumberValue);
		} else {
			System.out.println("Mobile Number is not Enabled");
		}

		// Course Interested
		// UFT Testing Check Box
		WebElement uftChk = driver.findElement(By.xpath(uftLocator));
		// Verify The Functional Testing Check Box is displayed or Not
		if (uftChk.isDisplayed()) {
			System.out.println("UFT Check Box is Displayed");
		} else {
			System.out.println("UFT Check Box is not Displayed");
		}

		// Verify UFT Check Box is Enabled or Not
		if (uftChk.isEnabled()) {
			System.out.println("UFT Check Box is Enabled");
		} else {
			System.out.println("UFT Check Box is NOT Enabled");
		}

		// Verify UFT Check Box is Selected
		if (uftChk.isSelected()) {
			System.out.println("UFT Check Box is selected");
		} else {
			System.out.println("UFT Check Box is not selected");
			// Click on UFT check Box
			uftChk.click();
			System.out.println("UFT Check Box is now selected");
		}

		// Selenium WebDriver Check Box
		WebElement seleniumWebDriverCheck = driver.findElement(By.xpath(seleniumWebDriverLocator));
		// Verify Selenium WebDriver Check Box is displayed or Not
		if (seleniumWebDriverCheck.isDisplayed()) {
			System.out.println("Selenium WebDriver Check Box is Displayed");
		} else {
			System.out.println("Selenium WebDriver Check Box is not Displayed");
		}

		// Verify Selenium WebDriver Check Box is Enabled or Not
		if (seleniumWebDriverCheck.isEnabled()) {
			System.out.println("Selenium WebDriver Check Box is Enabled");
		} else {
			System.out.println("Selenium WebDriver Check Box is not Enabled");
		}

		// Verify Selenium WebDriver Check Box is Selected or Not
		if (seleniumWebDriverCheck.isSelected()) {
			System.out.println("Selenium WebDriver Check Box is Selected");
		} else {
			System.out.println("Selenium WebDriver Check Box is not selected");
			// Click on Selenium WebDriver check Box
			seleniumWebDriverCheck.click();
			System.out.println("Selenium WebDriver Check Box is now selected");
		}

		// Enter Your Query
		WebElement enterYourQuery = driver.findElement(By.xpath(enterYourQueryLocator));
		// Verify the Enter Your Query is Displayed or not
		if (enterYourQuery.isDisplayed()) {
			System.out.println("Enter Your Query is Displayed");
		} else {
			System.out.println("Enter Your Query is not Displayed");
		}
		// Verify the Enter Your Query is enabled or not
		if (enterYourQuery.isEnabled()) {
			System.out.println("Enter Your Query is Enabled");
			// Enter Your Query Value in multiple lines
			enterYourQuery.sendKeys(enterYourQueryValue);
			System.out.println("Enter Your Query is: " + enterYourQueryValue);
		} else {
			System.out.println("Enter Your Query is not Enabled");
		}

		// Enter Any Two Digits
		WebElement enterTwoDigits = driver.findElement(By.id(enterTwoDigitsLocator));
		// Verify the Enter Any Two Digits is Displayed or not
		if (enterTwoDigits.isDisplayed()) {
			System.out.println("Enter Any Two Digits is Displayed");
		} else {
			System.out.println("Enter Any Two Digits is not Displayed");
		}

		// Verify whether Enter Any Two Digits is enabled or not
		if (enterTwoDigits.isEnabled()) {
			System.out.println("Enter Any Two Digits is Enabled");
			// Retrieve the Verification Number
			String verificationText = driver.findElement(By.xpath("//label[contains(text(),'Example:')]")).getText();
			String number[] = verificationText.split(":");
			enterTwoDigits.sendKeys(number[1].trim());
			// Remove spaces before and after digits and display 2 digits
			System.out.println("Enter Any Two Digits is: " + number[1].trim());
		} else {
			System.out.println("Enter Any Two Digits is not Enabled");
		}

		// Submit button
		WebElement submitButton = driver.findElement(By.name(submitBtnLocator));
		// Click on Submit Button 
		submitButton.click();
		System.out.println("Submit Button is Clicked");

	}

	@Test(priority = 3)
	public void validateSuccessfulMessage() throws InterruptedException {
		// Validating the successfull message
		WebElement successfulMsgText = driver.findElement(By.xpath(successfulMsgTextLocator));

		// Verify Successful message Text displayed or not
		if (successfulMsgText.isDisplayed()) {
			System.out.println("Successful Registration Message Text is Displayed");
		} else {
			System.out.println("Successful Registration Message Text is not Displayed");
		}

		// Validating Successful registration message text
		String actualSuccessfulMsgText = successfulMsgText.getText();
		String expectedSuccessfulMsgText = successfulMessageText;

		if (actualSuccessfulMsgText.contains(expectedSuccessfulMsgText)) {
			System.out.println("Actual and expected successful message text are the same");
			
			//Thread.sleep(3000);
			
			// Retrieve Confirmation Registration message Text only
			System.out.println("Successful Registration Message Text is: " + actualSuccessfulMsgText);
			// Retrieve Transaction ID only
			System.out.println("Transaction number is: " + actualSuccessfulMsgText.substring(82));
		} else {
			System.out.println("Actual and expected successful message text are not same");
			System.out.println("Actual Registration Message Text is: " + actualSuccessfulMsgText);
			System.out.println("Expected Registration Message Text is: " + expectedSuccessfulMsgText);
		}
	}


}
