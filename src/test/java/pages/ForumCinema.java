import helpers.Common;
import org.junit.Test;
import pages.HomePageForum;
import pages.LoginForumCinemas;


public class ForumCinema {
    Common common = new Common();
    HomePageForum homePageForum = new HomePageForum();
    LoginForumCinemas loginForumCinemas = new LoginForumCinemas();


    @Test

    public void loginForum(){
        common.startChrome();
        homePageForum.openHomePageForum();
        loginForumCinemas.spiedIenakt();
        loginForumCinemas.fillData("test@test.lv","Test1");
        loginForumCinemas.scroll();
        loginForumCinemas.pressLogin();
        loginForumCinemas.pressProfile();
        loginForumCinemas.pressLabot();
        loginForumCinemas.scroll();
        loginForumCinemas.clearFields();
        loginForumCinemas.fillName("123","123");
        loginForumCinemas.fillBirthDate("1","March","2002");
        loginForumCinemas.scroll();
        loginForumCinemas.pressSubmit();
        common.stopChrome();

    }

}
