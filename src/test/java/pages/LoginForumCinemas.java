package pages;

import helpers.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class LoginForumCinemas extends Common {

    private final By loginButton = By.xpath("//a[@class='btn btn-login btn-default']");
    private final By username = By.xpath("//input[@id='input-userName']");
    private final By password = By.xpath("//input[@id='input-password']");
    private final By ienaktButton = By.xpath("//button[@class='btn btn-primary btn-block']");
    private final By profileButton = By.xpath("//a[@class='btn btn-user btn-default']");
    private final By labotButton = By.xpath("//a[@class='margin-bottom-quarter inline-block']");
    private final By nameField = By.xpath("//input[@id='inputFirstName']");
    private final By surnameField = By.xpath("//input[@id='inputLastName']");
    private final By birthDay = By.id("bdDay");
    private final By birthMonth = By.id("bdMonth");
    private final By birthYear = By.id("bdYear");
    private final By submitButton = By.xpath("//button[@class='btn btn-primary']");


    public void spiedIenakt(){
        driver.findElement(loginButton).click();
    }

    public void fillData(String name, String pass){

        driver.findElement(username).sendKeys(name);
        driver.findElement(password).sendKeys(pass);

    }

    public void scroll(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

    }

    public void pressLogin(){

        driver.findElement(ienaktButton).click();

    }

    public void pressProfile(){
        driver.findElement(profileButton).click();

    }

    public void pressLabot(){
        driver.findElement(labotButton).click();
    }

    public void fillName(String name,String surname){
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(surnameField).sendKeys(surname);
    }


    public void clearFields(){

        driver.findElement(nameField).clear();
        driver.findElement(surnameField).clear();
    }

    public void fillBirthDate(String day, String month, String year){



        Select daySelector = new Select(driver.findElement(birthDay));
        daySelector.selectByVisibleText(day);

        Select monthSelector = new Select(driver.findElement(birthMonth));
        switch (month){
            case "January":
                monthSelector.selectByValue("1");
                break;
            case "February":
                monthSelector.selectByValue("2");
                break;
            case "March":
                monthSelector.selectByValue("3");
                break;
            case "April":
                monthSelector.selectByValue("4");
                break;
            case "June":
                monthSelector.selectByValue("5");
                break;
            default:
                monthSelector.selectByValue("6");

        }

        Select yearSelector = new Select(driver.findElement(birthYear));
        yearSelector.selectByVisibleText(year);

    }

    public void pressSubmit(){
         driver.findElement(submitButton).click();

    }

}
