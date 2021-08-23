package steps;

import cucumber.api.java.en.And;
import pages.HomePageForum;

public class HomePageForumSteps {

    HomePageForum homePageForum = new HomePageForum();


        @And("Open homepage Forum")
            public void openHomePageForum(){
                homePageForum.openHomePageForum();
            }


}
