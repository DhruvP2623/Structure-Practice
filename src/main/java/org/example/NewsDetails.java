//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium.By
import org.openqa.selenium.By;
//to interact with visible and invisible elements on the web page.
import org.openqa.selenium.WebElement;
//Stores the collection of elements in a sequential order
import java.util.List;
//extends keyword Is used to Inherit child class(NewsDetails) from parent class(Utils).
public class NewsDetails extends Utils{
    //By.id locate a particular web element using the value of its id attribute.
    //we can access the members of a class within the class itself and we can't access them outside the class.

    private By _NewsDetails = By.xpath("//div[@class=\"news-items\"]/div/div[3]//a[@href=\"/nopcommerce-new-release\"]");
    private By _Tittle = By.id("AddNewComment_CommentTitle");
    private By _Comment = By.id("AddNewComment_CommentText");
    private By _newCommentButton = By.xpath("//button[@class=\"button-1 news-item-add-comment-button\"]");


    public void newsComment(){
        //.clickOnElement() command works to simulate user click
        clickOnElement(_NewsDetails);
        //to input content in editable text fields or password fields in a webpage.
        typeText(_Tittle,"It's a good Product");
        typeText(_Comment,"Very Easy to Use");
        //.clickOnElement() command works to simulate user click
        clickOnElement(_newCommentButton);
        List<WebElement> commentList = driver.findElements(By.xpath("//div[@class=\"comments\"]"));
        for (WebElement element:commentList){
        System.out.println(element.getText());

        }
    }
}
