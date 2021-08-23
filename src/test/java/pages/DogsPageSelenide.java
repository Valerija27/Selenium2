package pages;

import helpers.Common;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DogsPageSelenide {

    private final By minPrice = By.id("f_o_8_min");
    private final By maxPrice = By.id("f_o_8_max");
    private final By minAge = By.id("f_o_1276_min");
    private final By maxAge = By.id("f_o_1276_max");
    private final By searchButton = By.xpath("//input[@class='b s12']");

    public void fillPrice(String min, String max){
        $(minPrice).sendKeys(min);
        $(maxPrice).sendKeys(max);

    }

    public void fillAge(String min, String max){
        $(minAge).sendKeys(min);
        $(maxAge).sendKeys(max);
    }

    public void pressSearchButton(){
        $(searchButton).click();
    }


//        $(By.id("f_o_8_max")).sendKeys("1000");
//        $(By.id("f_o_1276_min")).sendKeys("1");
//        $(By.xpath("//input[@class='b s12']")).click();

}
