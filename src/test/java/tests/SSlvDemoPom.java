package tests;

import helpers.Common;
import org.junit.Test;
import pages.CarsPage;
import pages.DogsPage;
import pages.HomePage;

public class SSlvDemoPom {

    Common common = new Common();
    HomePage homePage = new HomePage();
    DogsPage dogsPage = new DogsPage();
    CarsPage carsPage = new CarsPage();

    @Test
    public void suniUnKuceni(){
        common.startChrome();
        homePage.openHomePage();
        homePage.openCategory("Dogs");
        dogsPage.fillPrice("1","100");
        dogsPage.fillAge("1","100");
        dogsPage.pressSearchButton();
        common.stopChrome();



    }

    @Test

    public void cars(){
        common.startChrome();
        homePage.openHomePage();
        homePage.openCategory("Cars");
        carsPage.fillPrice("1000","10000");
        carsPage.fillYear("2000","2019");
        carsPage.fillTilp("1.0","3.0");
        carsPage.fillDzinejs("Benzins");
        carsPage.fillKarba("Manuala");
        carsPage.fillColour("Yellow");
        carsPage.pressSearchButton();
        common.stopChrome();
    }
}

