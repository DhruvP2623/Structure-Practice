//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium.By
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
//Assertions in TestNG is Use to verify that the expected result and the actual result matched or not.
import org.testng.Assert;
//extends keyword Is used to Inherit child class(HomePage) from parent class(Utils).
public class HomePage extends Utils{
    private By _voteButton = By.id("vote-poll-1");
    private By _currency = By.id("customerCurrency");
String regmss = "Only registered users can vote.";


    //This method is use for the register button icon
    public void verifyRegisterButtonPresent(){

        //assertEquals() is used to validate two values are equal.
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","verifyRegistrationButtonPresent");
    }

    public void voteMessage(){
        //.clickOnElement() command works to simulate user click
        clickOnElement(_voteButton);
        driver.switchTo().alert().accept();
        //assertEquals() is used to validate two values are equal.
        Assert.assertEquals(regmss,"User Need To register","You Need to Select Option");

    }
    public void selectCurrency (){
        //The <select> element is used to create a drop-down Value.
        selectFromDropDownByValue(_currency,"Euro");
        selectFromDropDownByValue(_currency,"US Dollar");

    }
}
