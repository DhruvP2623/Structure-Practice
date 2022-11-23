//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium.By
import org.openqa.selenium.By;
//Assertions in TestNG is Use to verify that the expected result and the actual result matched or not.
import org.testng.Assert;
//extends keyword Is used to Inherit child class(EmailResultPage) from parent class(Utils).
public class EmailResultPage extends Utils{
    //Inputting the Message
    String regMess1 = "Your message has been sent.";

    public void verifyEmailMessageIsSentSuccessfully(){
        //These methods check that the URL is an expected one. With the timeout parameter that needs to be provided to the method
        WaitForUrlTobe("https://demo.nopcommerce.com/productemailafriend/4",10);
        // verifying messages, errors, asserting WebElements, and many more.
        String regMsg1 = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        //assertEquals() is used to validate two values are equal.
        Assert.assertEquals(regMsg1,regMess1,"Your message has been sent.");
    }
}
