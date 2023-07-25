package uk.co.library.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultsPage;

public class JobSearchSteps {
    @Given("I am on homePage")
    public void iAmOnHomePage() {
    }

    @When("I accept cookies")
    public void iAcceptCookies() throws InterruptedException {
        new HomePage().accpetCookies();
    }

    @And("I enter Job Title {string}")
    public void iEnterJobTitle(String jobTitle) throws InterruptedException {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I Enter Location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select Distance {string}")
    public void iSelectDistance(String distance) throws InterruptedException {
        new HomePage().selectDistance(distance);
    }

    @And("I click On more Search Option Link")
    public void iClickOnMoreSearchOptionLink() throws InterruptedException {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter Min Salary {string}")
    public void iEnterMinSalary(String minSalary) {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("I enter Max Salary {string}")
    public void iEnterMaxSalary(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("I select salary Type {string}")
    public void iSelectSalaryType(String salaryType) throws InterruptedException {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select Job Type {string}")
    public void iSelectJobType(String jobType) throws InterruptedException {
        new HomePage().selectJobType(jobType);
    }

    @And("I click On find Job Button")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("Verify the Result Display")
    public void verifyTheResultDisplay() throws InterruptedException {
        new ResultsPage().verifyResultText();
    }
}
