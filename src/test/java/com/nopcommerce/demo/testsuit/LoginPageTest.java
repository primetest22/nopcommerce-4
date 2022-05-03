package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
     //click on login link
      homePage.clickOnLoginLink();
      String expectedMessage = "Welcome, Please Sign In!";
      String actualMessage = loginPage.getWelcomeText();//getlogouttext();

      Assert.assertEquals(expectedMessage,actualMessage,"Login page not displayed");

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //click on log in button with valid values
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("jjjjj112@yahoo.com");
        loginPage.enterPassword("password");
        loginPage.clickOnLoginButton();

        //click on logout link
        String expectedDisplay = "Log out";
        String actualDisplay = loginPage.getLoginSuccessMessage();

        Assert.assertEquals(expectedDisplay,actualDisplay,"error");


    }
    @Test
    public void verifyErrorMessageWithInvalidCredentials(){

    homePage.clickOnLoginLink();
    loginPage.enterEmailId("prime123@gmail.com");
    loginPage.enterPassword("prime123");
    loginPage.clickOnLoginButton();

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();

        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");


    }


}
