package steps;

import cucumber.api.java.en.And;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @And("Open homepage")
    public void openHomepage() {
        homePage.openHomePage();
    }


    @And("^Open (Dogs|Cars) tab$")
    public void openSpecificTab(String tabName) {
        homePage.openCategory(tabName);
    }
}