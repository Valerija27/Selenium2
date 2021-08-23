package steps;

import cucumber.api.java.en.And;
import pages.CarsPage;

public class CarsPageSteps {
    CarsPage carsPage = new CarsPage();

    @And("^Fill min year (.*) and max year (.*)$")
    public void fillMinYearAndMaxYear(String min, String max) {
        carsPage.fillYear(min,max);
    }

    @And("^Fill engine min (.*) and engine max (.*)$")
    public void fillEngineMinAndEngineMax(String min, String max) {
        carsPage.fillTilp(min,max);
    }

    @And("^Select Engine type (Benzins|Dizelis)$")
    public void selectEngineTypeBenzins(String num) {
        carsPage.fillDzinejs(num);
    }


    @And("^Select color (White|Yellow|Blue)$")
    public void selectColorWhite(String num) {
        carsPage.fillColour(num);
    }

    @And("^Select gear type (Manuala|Automats)$")
    public void selectGearTypeManuala(String type) {
        carsPage.fillKarba(type);
    }
}
