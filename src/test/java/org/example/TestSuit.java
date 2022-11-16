//A package in Java is used to group related classes.
package org.example;
//importing a package of Test
import org.testng.annotations.Test;
//extends keyword Is used to Inherit child class(TestSuit) from parent class(BaseTest).
public class TestSuit extends BaseTest {
    //Creating object for HomePage
    HomePage homePage = new HomePage();
    //Creating object for RegisterPage
    RegisterPage registerPage = new RegisterPage();
    //Creating object for RegisterResultPage
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Test//This a test method
    public void register() {
    //click on registration button
   homePage.verifyRegisterButtonPresent();
   //verify user is on register page
   registerPage.verifyUserIsOnRegistrationPage();
   //enter registration details
   registerPage.enterRegistrationDetails();
   //verify user has been registered successfully
   registerResultPage.verifyUserHasBeenRegisteredSuccessfully();

    }
}
