package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SSlvDemo {

    @Test
        public void suniUnKuceni(){
            String driverPath = "C:\\Users\\Лера\\IdeaProjects\\Selenium2\\src\\test\\resources\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", driverPath);
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.ss.lv/");
        driver.findElement(By.id("mtd_300")).click();
        driver.findElement(By.id("f_o_8_max")).sendKeys("1000");
        driver.findElement(By.id("f_o_1276_min")).sendKeys("1");
        driver.findElement(By.xpath("//input[@class='b s12']")).click();
    }

    @Test
    public void cars(){
        String driverPath = "C:\\Users\\Лера\\IdeaProjects\\Selenium2\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv/");
        driver.findElement(By.id("mtd_97")).click();
        Select yearMax = new Select(driver.findElement(By.id("f_o_18_max")));
        yearMax.selectByVisibleText("2020");

    }

    @Test
    public void carSearch(){
        String driverPath = "C:\\Users\\Лера\\IdeaProjects\\Selenium2\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.lv/");
        driver.findElement(By.id("mtd_97")).click();
        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");
        Select yearMin = new Select(driver.findElement(By.id("f_o_18_min")));
        yearMin.selectByVisibleText("2001");
        Select tilpMax = new Select(driver.findElement(By.id("f_o_15_max")));
        tilpMax.selectByVisibleText("3.0");
        Select colour = new Select(driver.findElement(By.id("f_o_17")));
        colour.selectByValue("6318");
        driver.findElement(By.xpath("//input[@class='b s12']")).click();
        driver.findElements(By.xpath("//a[@class='a18']")).get(4).click();
        driver.quit();


    }


}
