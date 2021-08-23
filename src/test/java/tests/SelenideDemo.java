package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.CatsPage;
import pages.DogsPageSelenide;

import static com.codeborne.selenide.Selenide.*;


public class SelenideDemo {

    CatsPage catsPage = new CatsPage();
    DogsPageSelenide dogsPageSelenide = new DogsPageSelenide();

    @Test
    public void firstTest(){
        Configuration.startMaximized=true;
        Configuration.holdBrowserOpen=true;
        open("https://www.ss.lv/");
        $(By.id("mtd_301")).click();
        catsPage.fillAge("1","10");
        catsPage.fillPrice("1","100");
        catsPage.changeDistrict("riga_f");
        catsPage.pressSearchButton();
        closeWindow();

    }

    @Test
    public void dogsTest(){
        Configuration.startMaximized=true;
        Configuration.holdBrowserOpen=true;
        open("https://www.ss.lv/");
        $(By.id("mtd_300")).click();
        dogsPageSelenide.fillPrice("1","50");
        dogsPageSelenide.fillAge("1","10");
        dogsPageSelenide.pressSearchButton();
    }
}
