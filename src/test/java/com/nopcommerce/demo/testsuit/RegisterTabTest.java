package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.Apparel;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTabTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){

        homePage.clickOnRegisterTab();
        String expectedMessage = "Register";
        String actualMessage = registerPage.getRegisterTab();
        Assert.assertEquals(expectedMessage,actualMessage,"error");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){

        homePage.clickOnRegisterTab();
        registerPage.enterFirstName("india");
        registerPage.enterLastName("guj");
        registerPage.enterEmail("jjjjj112@yahoo.com");
        registerPage.enterPassword("password");
        registerPage.enterConfirmPassword("password");
        registerPage.clickOnRegisterButton();

        String expectedDisplay = "Your registration completed";
        String actualDisplay = registerPage.getRegisterCompletionText();
        Assert.assertEquals(expectedDisplay,actualDisplay,"error");



    }
}
