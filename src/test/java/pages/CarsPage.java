package pages;

import helpers.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CarsPage extends Common {

    private final By minPrice = By.id("f_o_8_min");
    private final By maxPrice = By.id("f_o_8_max");
    private final By minYear = By.id("f_o_18_min");
    private final By maxYear = By.id("f_o_18_max");
    private final By minTilp = By.id("f_o_15_min");
    private final By maxTilp = By.id("f_o_15_max");
    private final By dzinejs = By.id("f_o_34");
    private final By karba = By.id("f_o_35");
    private final By tips = By.id("f_o_32");
//    private final By karba = By.id("f_o_35");
    private final By colourSelectorElement = By.id("f_o_17");
    private final By searchButton = By.xpath("//input[@class='b s12']");

    public void fillPrice(String min, String max){
        driver.findElement(minPrice).sendKeys(min);
        driver.findElement(maxPrice).sendKeys(max);
    }

    public void fillYear(String min, String max){
        Select yearMinSelector = new Select(driver.findElement(minYear));
        yearMinSelector.selectByVisibleText(min);
        Select yearMaxSelector = new Select(driver.findElement(maxYear));
        yearMaxSelector.selectByVisibleText(max);
    }



//    public void fillYear(String min, String max){
//
//
//
//        Select minimalYear = new Select(driver.findElement(minYear));
//        switch (min){
//            case "2000":
//                minimalYear.selectByVisibleText("2000");
//                break;
//            case "2001":
//                minimalYear.selectByVisibleText("2001");
//                break;
//            case "2002":
//                minimalYear.selectByVisibleText("2002");
//                break;
//            default:
//                minimalYear.selectByVisibleText("2005");
//        }
//
//        Select maximalYear = new Select(driver.findElement(maxYear));
//                switch (max){
//                    case "2017":
//                        maximalYear.selectByVisibleText("2017");
//                        break;
//                    case "2018":
//                        maximalYear.selectByVisibleText("2018");
//                        break;
//                    case "2019":
//                        maximalYear.selectByVisibleText("2019");
//                        break;
//                    default:
//                        maximalYear.selectByVisibleText("2020");
//    }
//    }

//    public void fillTilp(String min, String max){
//        Select minimalTilp = new Select(driver.findElement(minTilp));
//        switch (min){
//            case "0.1":
//                minimalTilp.selectByVisibleText("0.1");
//                break;
//            case "0.6":
//                minimalTilp.selectByVisibleText("0.6");
//                break;
//            case "0.7":
//                minimalTilp.selectByVisibleText("0.7");
//                break;
//            default:
//                minimalTilp.selectByVisibleText("0.9");
//            }
//        Select maximalTilp = new Select(driver.findElement(maxTilp));
//        switch (max){
//            case "6.3":
//                maximalTilp.selectByVisibleText("6.3");
//                break;
//            case "6.5":
//                maximalTilp.selectByVisibleText("6.5");
//                break;
//            case "6.8":
//                maximalTilp.selectByVisibleText("6.8");
//                break;
//            default:
//                maximalTilp.selectByVisibleText("7.5");
//        }
//    }


    public void fillTilp(String min, String max){

        Select tilpMinSelector = new Select(driver.findElement(minTilp));
        tilpMinSelector.selectByVisibleText(min);
        Select tilpMaxSelector = new Select(driver.findElement(maxTilp));
        tilpMaxSelector.selectByVisibleText(max);
    }



    public void fillDzinejs(String num){
        Select dzinejaTips = new Select(driver.findElement(dzinejs));
        switch(num){
            case "Benzins":
                dzinejaTips.selectByValue("493");
                break;
            case "Benzins/gaze":
                dzinejaTips.selectByValue("495");
                break;
            case"Dizelis":
                dzinejaTips.selectByValue("494");
                break;
            default:
                dzinejaTips.selectByValue("7434");
        }

    }

    public void fillKarba(String num){
        Select atrKarba = new Select(driver.findElement(karba));
        switch (num){
            case "Manuala":
                atrKarba.selectByValue("496");
                break;
            default:
                atrKarba.selectByValue("497");
        }

    }

//    public void fillKarba(String num){
//        Select karb = new Select(driver.findElement(By.id(karba)));
//        karb.selectByVisibleText(num);
//    }
//
//    public void fillTips(String num){
//        Select tip = new Select(driver.findElement(By.id(tips)));
//        tip.selectByVisibleText(num);
//    }

    public void fillColour(String color){
        Select colorSelector = new Select(driver.findElement(colourSelectorElement));
        switch (color){
            case "White":
                colorSelector.selectByValue("6318");
                break;
            case "Yellow":
                colorSelector.selectByValue("6311");
                break;
            default:
                colorSelector.selectByValue("137");
        }
    }
    
    public void pressSearchButton(){
//        driver.findElement(By.xpath("//input[@class='b s12']")).click();
        driver.findElement(searchButton).click();
    }







}
