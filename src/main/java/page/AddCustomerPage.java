package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div/div/header/div/strong")
	WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[1]/div/input")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[2]/div/select")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[3]/div/input")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[5]/div/input")
	WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='city']")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"port\"]")
	WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[8]/div[1]/select")
	WebElement COUNTRY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"customer_group\"]")
	WebElement GROUP_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='save_btn']")
	WebElement SUBMIT_ELEMENT;

	public String getNewCustomerValidaitonText() {
		String actualNewCustomerHeaderText = ADD_CUSTOMER_HEADER_ELEMENT.getText();
		return actualNewCustomerHeaderText;
	}
 static String name;
	public void insertFullName(String fullName) {
		 name = fullName + generateRandomNum(999);
		FULL_NAME_ELEMENT.sendKeys(name);
	}

	public void clearInsertedFullName() {
		FULL_NAME_ELEMENT.clear();
	}
	public void selectCompany(String company) {
		selectFromDropdown(COMPANY_DROPDOWN_ELEMENT, company);
	}

	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNum(99) + email);
	}

	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone + generateRandomNum(999));
	}

	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);

	}

	public void selectCountry(String country) {
		selectFromDropdown(COUNTRY_DROPDOWN_ELEMENT, country);

	}

	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
	}

	public void insertZip(String zip) {
		ZIP_ELEMENT.sendKeys(zip);

	}

	public void selectGroup(String group) {
		selectFromDropdown(GROUP_DROPDOWN_ELEMENT, group);

	}

	public void clickOnSubmitButton() {
		SUBMIT_ELEMENT.click();
	}
//	// tbody/tr[1]/td[2]/a         //tbody/tr[1]/td[2]/a
//	// tbody/tr[2]/td[2]/a
//	// tbody/tr[3]/td[2]/a
//	// tbody/tr[i]/td[2]/a
//	//tbody/tr[1]/td[9]/button // for delete
//
//	String before_xpath = "//tbody/tr[";
//	String after_xpath = "]/td[2]/a";
//	String after_xpath_delete = "]/td[9]/button";
//	
//	public void validateAndDeleteInsertedName() {
//		for (int i = 1; i <= 5; i++) {
//			String actualName = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[2]/a")).getText();
//			System.out.println(actualName);
//	          if(actualName.contains(name)) {
//	        	System.out.println("Inserted name exist. ");  
//	        	driver.findElement(By.xpath(before_xpath + i + after_xpath_delete)).click() ;
//	          }
//	          break;
//		}
//	}

}
