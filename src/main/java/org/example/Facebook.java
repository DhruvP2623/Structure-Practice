//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium.By
import org.openqa.selenium.By;
//Assertions in TestNG is Use to verify that the expected result and the actual result matched or not.
import org.testng.Assert;
//extends keyword Is used to Inherit child class(Facebook) from parent class(Utils).
public class  Facebook extends Utils {
    private By _facebookLogo = By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]");
    //Inputting the Message
    String regMsg = "http://www.facebook.com/nopCommerce";

    public void faceBookPage() {
        // Store the current window handle
        String MainWindowHandleBefore = driver.getWindowHandle();
        // Perform the click operation that opens new window
        clickOnElement(_facebookLogo);
        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        // Perform the actions on new window
        System.out.println(driver.getCurrentUrl());
        // Close the new window, if that window no more required
        driver.close();
        // Switch back to original browser (first window)
        driver.switchTo().window(MainWindowHandleBefore);
        //assertEquals() is used to validate two values are equal.
        Assert.assertEquals(regMsg,"http://www.facebook.com/nopCommerce","You are not On facebook page.");
        // Continue with original browser (first window)
    }
}
