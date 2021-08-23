package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aliexpress {

    @Test
    public void tattoo(){
        String driverPath = "C:\\Users\\Лера\\IdeaProjects\\Selenium2\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//img[@class='btn-close']")).click();
        driver.findElement(By.id("search-key")).sendKeys("tattoo");
        driver.findElement(By.xpath("//input[@class='search-button']")).click();
        driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");
        driver.findElement(By.xpath("//a[@class='ui-button narrow-go']")).click();
        driver.quit();

 }
}