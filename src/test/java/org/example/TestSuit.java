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
    //Creating object for EmailAFriend
    EmailAFriend emailSFriend = new EmailAFriend();
    //Creating object for EmailResultPage
    EmailResultPage emailResultPage =new EmailResultPage();
    //Creating object for Facebook
    Facebook facebook = new Facebook();
    //Creating object for NewsDetails
    NewsDetails newsDetails = new NewsDetails();
    //Creating object for NewsCommentResult
    NewsCommentResult newsCommentResult = new NewsCommentResult();
    Nike nike = new Nike();
    CellPhone cellPhone = new CellPhone();
CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
    @Test//This a test method
    public void verifyUserIsOnRegisterPage() {
    //click on registration button.
   homePage.verifyRegisterButtonPresent();
   //verify user is on register page
   registerPage.verifyUserIsOnRegistrationPage();
   //enter registration details
   registerPage.enterRegistrationDetails();
   //verify user has been registered successfully
   //registerResultPage.verifyUserHasBeenRegisteredSuccessfully();
        }
   @Test
   public void verifyEmailAFriend() {
       //verify user is on register page
       registerPage.verifyUserIsOnRegistrationPage();
       //enter registration details
       registerPage.enterRegistrationDetails();
       //enter emailSFriend details
       emailSFriend.enterEmaildetails();
       //verify user has been EmailMessageIsSent successfully
       emailResultPage.verifyEmailMessageIsSentSuccessfully();
    }
    @Test
    public void verifyVoteAlertMessage(){
        //verify user has click on the vote button
       homePage.voteMessage();
    }
    @Test
    public void verifySetFacebook(){
        //verify user is on facebookPage
        facebook.faceBookPage();
    }
    @Test
    public void verifyNewsComment(){
        //verify user has Enter news Details
        newsDetails.newsComment();
        //verify user has been verifyMessage is Sent successfully
        newsCommentResult.verifyMessageIsSentSuccessfully();
    }
    @Test
    public void verifyCurrency(){
        //verify user has select currency
       homePage.selectCurrency();
    }

    @Test
    public void verifyForTheHover(){

        homePage.hoverOverAndNavigateToDesiredCategoryPage("Electronics","Camera & photo");
        cameraAndPhoto.cameraAndPhotoResult();
    }

    @Test
    public void verifySearchBarProduct(){
        homePage.searchSStore();
        nike.nikeProducts();
    }
@Test
    public void verifyCellPhone(){
    registerPage.verifyUserIsOnRegistrationPage();
    //enter registration details
    registerPage.enterRegistrationDetails();
        homePage.extra();
        //cellPhone.cellPhoneExtra();
}

}
