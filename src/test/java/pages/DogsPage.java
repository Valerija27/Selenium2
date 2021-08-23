package pages;

import helpers.Common;
import org.openqa.selenium.By;

public class DogsPage extends Common {

    private final By minPrice = By.id("f_o_8_min");
    private final By maxPrice = By.id("f_o_8_max");
    private final By minAge = By.id("f_o_1276_min");
    private final By maxAge = By.id("f_o_1276_max");
    private final By searchButton = By.xpath("//input[@class='b s12']");

    public void fillPrice(String min, String max){
        driver.findElement(minPrice).sendKeys(min);
        driver.findElement(maxPrice).sendKeys(max);

    }

    public void fillAge(String min, String max){
        driver.findElement(minAge).sendKeys(min);
        driver.findElement(maxAge).sendKeys(max);
    }

    public void pressSearchButton(){
        driver.findElement(searchButton).click();
    }


//        driver.findElement(By.id("f_o_8_max")).sendKeys("1000");
//        driver.findElement(By.id("f_o_1276_min")).sendKeys("1");
//        driver.findElement(By.xpath("//input[@class='b s12']")).click();

}
