package pages;

import helpers.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {

    public void openHomePage(){
        driver.get("https://www.ss.lv/");
    }

    public void openCategory(String categoryName){
        if("Dogs".equals(categoryName)){
            driver.findElement(By.id("mtd_300")).click();
        }        else if ("Cars".equals(categoryName)){
            driver.findElement(By.id("mtd_97")).click();
        }

    }


}
