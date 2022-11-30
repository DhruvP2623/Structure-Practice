//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium.By
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
//Assertions in TestNG is Use to verify that the expected result and the actual result matched or not.
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

//extends keyword Is used to Inherit child class(HomePage) from parent class(Utils).
public class HomePage extends Utils{
    private By _voteButton = By.id("vote-poll-1");
    private By _currency = By.id("customerCurrency");
    private By _searchStore = By.id("small-searchterms");
    private By _searchBar = By.xpath("//button[@class=\"button-1 search-box-button\"]");
   // private By _electronic = By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/electronics\"]");
   private By _PasswordField = By.id("Password");
    private By _emailField = By.id("Email");
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
//div[2]/ul[1]/li[1]/ul/li[1]/a


    }
    public void selectCurrency (){
        //The <select> element is used to create a drop-down Value.
        selectFromDropDownByValue(_currency,"Euro");
        selectFromDropDownByValue(_currency,"US Dollar");

    }
    public void hoverOverAndNavigateToDesiredCategoryPage(String category, String subCategory){
        WebElement categoryLink = driver.findElement((By.xpath("//ul[contains(@class,'notmobile')]//a[contains(.,'"+category+"')]")));
        String beforeHover = categoryLink.getCssValue("color");
        System.out.println("Before hover color for category link = " +beforeHover);
        Actions builder = new Actions(driver);
        Action mouseOverCategory = builder.moveToElement(categoryLink).build();
        mouseOverCategory.perform();
        String afterHover = categoryLink.getCssValue("color");
        System.out.println("After hover color for category link = " +afterHover);
        clickOnElement(By.linkText(subCategory));

    }

    public void searchSStore(){
        typeText(_searchStore,"nike");
        clickOnElement(_searchBar);
    }
public void extra(){
    Actions actions = new Actions(driver);
    WebElement element = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/electronics\"]"));
    actions.moveToElement(element).perform();
    clickOnElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/cell-phones\"]"));
    clickOnElement(By.linkText("Nokia Lumia 1020"));
    clickOnElement(By.id("add-to-cart-button-20"));
    waitForElementToBeVisible(By.xpath("//span[@class=\"close\"]"),10);
clickOnElement(By.xpath("//span[@class=\"close\"]"));
WebElement element1 = driver.findElement(By.className("cart-label"));
    actions.moveToElement(element1).perform();
    waitForElementToBeVisible(By.cssSelector("button.button-1.cart-button"),10);
clickOnElement(By.cssSelector("button.button-1.cart-button"));
driver.findElement(By.className("qty-input")).sendKeys(Keys.BACK_SPACE);
driver.findElement(By.className("qty-input")).sendKeys("2");
clickOnElement(By.id("updatecart"));
clickOnElement(By.id("termsofservice"));
clickOnElement(By.id("checkout"));

}

}
