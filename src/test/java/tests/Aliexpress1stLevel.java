package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aliexpress1stLevel {

    @Test
    public void TattooSearch() {
        String driverPath = "C:\\Users\\Лера\\IdeaProjects\\Selenium2\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
        driver.switchTo().frame("pc_1455_24317_20200925").findElement(By.xpath("//*[@id=\"6216442440\"]/div/div/img")).click();
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//input[@name='SearchText']")).sendKeys("tattoo");
        driver.findElement(By.xpath("//input[@class='search-button']")).click();
        driver.findElement(By.xpath("//input[@placeholder='min']")).click();
        driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");
        driver.findElement(By.xpath("//a[@class='ui-button narrow-go']")).click();
        driver.quit();
    }
}

