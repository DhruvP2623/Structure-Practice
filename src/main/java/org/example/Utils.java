//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium.By
import org.openqa.selenium.By;
//An expectation for checking if the given element is selected.
import org.openqa.selenium.support.ui.ExpectedConditions;
//importing a package of AfterMethod
import org.openqa.selenium.support.ui.Select;
//Implicit Wait directs the Selenium WebDriver to wait for a certain measure of time before throwing an exception.
import org.openqa.selenium.support.ui.WebDriverWait;
//It allows for formatting (date -> text), parsing (text -> date), and normalization.
import java.text.SimpleDateFormat;
//Sets the amount of time to wait for an asynchronous script to finish execution before throwing an error.
import java.time.Duration;
//extends keyword Is used to Inherit parent class(Utils) from Grand parent class(BasePage).
public class Utils extends BasePage {
    // method simulates a mouse-click on an element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    //to input content in editable text fields or password fields in a webpage.
    public void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    // verifying messages, errors, asserting WebElements, and many more.
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    //The TIMESTAMP data type is used for values that contain both date and time parts.
    public static String getTimeStamp() {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timeStamp;
    }
//enables WebDriver to check if one or more web elements are visible
    public void waitForElementToBeVisible(By by, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
    //enables WebDriver to check if one or more web elements are clickable
    public void WaitForElementToBeClickable(By by,int duration) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(by));


    }
    //These methods check that the URL is an expected one. With the timeout parameter that needs to be provided to the method
    public void WaitForUrlTobe(String url,int duration){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));

    }
    //that allows the user to choose one value from a list
    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //that allows the user to choose one value from a list

    public static void selectFromDropDownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    // creating dropdown method to select value from list
    public static void selectFromDropDownByIndex(By by, int num) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(num);
    }
}
