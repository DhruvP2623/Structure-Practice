//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium.By
import org.openqa.selenium.By;
//extends keyword Is used to Inherit child class(EmailAFriend) from parent class(Utils).
public class EmailAFriend extends Utils {
    //By.className Initializes a new instance of the By class.
    //By.id locate a particular web element using the value of its id attribute.
    private By _appleMacbookPro = By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/apple-macbook-pro-13-inch\"]");
    private By _EmilAFriend = By.xpath("//div[@class=\"email-a-friend\"]");
    private By _freiendsEmail = By.id("FriendEmail");
    private By _personalMessage = By.id("PersonalMessage");
    private By _semdemail = By.className("buttons");

    public void enterEmaildetails ()
    {
        //.clickOnElement() command works to simulate user click
        clickOnElement(_appleMacbookPro);
        clickOnElement(_EmilAFriend);
        //to input content in editable text fields or password fields in a webpage.
        typeText(_freiendsEmail, "anshpatel21" + getTimeStamp() + "@gmail.com");
        typeText(_personalMessage, "It's good item");
        //.clickOnElement() command works to simulate user click
        clickOnElement(_semdemail);
    }
}
