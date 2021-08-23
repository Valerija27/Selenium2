package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DogsPage;

public class DogsPageSteps {

    DogsPage dogsPage =  new DogsPage();

    @When("^Fill min price (.*) and max price (.*)$")

    public void fillMinPriceAndMaxPrice(String min, String max) {
        dogsPage.fillPrice(min,max);
    }

    @And("^Fill min age (.*) and max age (.*)$")
    public void fillMinAgeAndMaxAge(String min, String max) {
        dogsPage.fillAge(min,max);
    }

    @Then("Press search button")
    public void pressSearchButton() {
        dogsPage.pressSearchButton();
    }
}
