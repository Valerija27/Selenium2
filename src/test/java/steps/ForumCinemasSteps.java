package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginForumCinemas;

public class ForumCinemasSteps {

    LoginForumCinemas loginForumCinemas = new LoginForumCinemas();


    @When("Press Login button")
    public void pressLoginButton() {
        loginForumCinemas.spiedIenakt();
    }


    @And("^Fill user name (.*) and pass (.*)$")
    public void fillUserNameTestTestLvAndPassTest(String name,String pass) {
        loginForumCinemas.fillData(name,pass);
    }

    @And("Scroll page")
    public void scrollPage() {
        loginForumCinemas.scroll();
    }

    @And("Press Login")
    public void pressLogin() {
        loginForumCinemas.pressLogin();
    }

    @Then("Go to profile")
    public void goToProfile() {
        loginForumCinemas.pressProfile();
    }

    @And("Press change")
    public void pressChange() {
        loginForumCinemas.pressLabot();
    }

    @And("Clear fields")
    public void clearFields() {
        loginForumCinemas.clearFields();
    }

    @And("^Fill name (.*) and surname (.*)$")
    public void fillNameAndSurname(String name, String surname) {
        loginForumCinemas.fillName(name,surname);
    }

    @And("^Fill new date day (.*) month (.*) year (.*)$")
    public void fillNewDateDayMonthMarchYear(String day, String month, String year) {
        loginForumCinemas.fillBirthDate(day,month,year);
    }

    @And("Press submit button")
    public void pressSubmitButton() {
        loginForumCinemas.pressSubmit();
    }
}
