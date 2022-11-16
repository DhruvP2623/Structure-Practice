//A package in Java is used to group related classes.
package org.example;
//importing a package of ChromeDriver
import org.openqa.selenium.chrome.ChromeDriver;
//extends keyword Is used to Inherit child class(DriverManager) from parent class(Utils).
public class DriverManager extends Utils {
//The open() method opens a new browser window, or a new tab.
    public void openBrowser() {
        //.setProperty command is used for sets the property of the system which is indicated by a key
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        // To communicate test scripts with Google Chrome
        driver = new ChromeDriver();
        // To maximize the browser
        driver.manage().window().maximize();
        //.get() method is used to open URL and it will wait till the whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");
    }
}
