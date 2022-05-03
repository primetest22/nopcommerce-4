package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTabTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerpage = new ComputerPage();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on computer tab and validate
        homePage.clickOnComputerTab();
        String expectedMessage = "Computers";
        String actualMessage = computerpage.getComputerTab();
        Assert.assertEquals(expectedMessage,actualMessage,"error");
    }





}
