//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium.By
import org.openqa.selenium.By;
//Assertions in TestNG is Use to verify that the expected result and the actual result matched or not.
import org.testng.Assert;
//extends keyword Is used to Inherit child class(HomePage) from parent class(Utils).
public class HomePage extends Utils{
//This method is use for the register button icon
    public void verifyRegisterButtonPresent(){

        //assertEquals() is used to validate two values are equal.
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","verifyRegistrationButtonPresent");
    }
}
