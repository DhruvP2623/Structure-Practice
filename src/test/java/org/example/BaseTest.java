//A package in Java is used to group related classes.
package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
//importing a package of AfterMethod
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//importing a package of BeforeMethod
import org.testng.annotations.BeforeMethod;
//extends keyword Is used to Inherit child class(BaseTest) from parent class(Utils).
public class BaseTest extends Utils{
    // To communicate test scripts with Google Chrome
    DriverManager driverManager = new DriverManager();
    @BeforeMethod//Executes before each test method
    public void setUp()
    {
        //The open() method opens a new browser window, or a new tab.
        driverManager.openBrowser();

    }
    @AfterMethod//Executes after each test method
    public void teardown(ITestResult result)
    {
        //If statement is use for to Capture ScreenShot when any class fail
        if (!result.isSuccess()){
captureScreenshot(result.getName());
        }
        // to close the browser
        driver.close();
    }
}
