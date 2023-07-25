package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement keywords;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement loc;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;

    public void enterJobTitle(String jobTitle) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(keywords,jobTitle);
        log.info("Enter JobTitle "+jobTitle);
    }

    public void enterLocation(String location) {
        sendTextToElement(loc,location);
        log.info("Enter Location "+location);
    }

    public void selectDistance(String distance) throws InterruptedException {
        selectByVisibleTextFromDropDown(distanceDropdown,distance);
        Thread.sleep(1000);
        log.info("Select Distance "+distance);
    }

    public void clickOnMoreSearchOptionLink() throws InterruptedException {
        clickOnElement(moreSearchOptionsLink);
        Thread.sleep(1000);
        log.info("Click on more search options link ");
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin,minSalary);
        log.info("Enter Minimum Salary "+minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax,maxSalary);
        log.info("Enter Maximum Salary "+maxSalary);
    }

    public void selectSalaryType(String salaryType) throws InterruptedException {
        selectByVisibleTextFromDropDown(salaryTypeDropDown,salaryType);
        Thread.sleep(1000);
        log.info("Select Salary Type "+salaryType);
    }

    public void selectJobType(String jobType) throws InterruptedException {
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
        Thread.sleep(1000);
        log.info("Select Job Type "+jobType);
    }

    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
        log.info("Click on Find Jobs ");
    }

    public void accpetCookies() throws InterruptedException {
        switchToFrame("gdpr-consent-notice");
        Thread.sleep(1000);
        clickOnElement(acceptCookies);
        log.info("Accept Cookies ");
        switchToDefaultContent();
    }

}
