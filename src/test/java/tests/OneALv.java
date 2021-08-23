package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OneALv {

    @Test
    public void lenovoDatori(){
        String driverPath = "C:\\Users\\Лера\\IdeaProjects\\Selenium2\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.1a.lv/");

//        Select mainMenu =  new Select (driver.findElement(By.className("main-menu__handle")));
//        mainMenu.selectByIndex(1);




//        driver.findElement(By.id("q")).sendKeys("Lenovo");
//        driver.findElement(By.className("main-search-submit")).click();
//        driver.findElement(By.xpath("//div[@class='ks-new-product-name']")).click();


//        driver.manage().deleteAllCookies();
//        driver.getLocalStorage().clear();
//        driver.getSessionStorage().clear();
 //       driver.quit();

    }
}
