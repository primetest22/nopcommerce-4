package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicTestTab extends TestBase {

    HomePage homePage = new HomePage();
    Electronics electronicPage = new Electronics();

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on elenctonics and validate
        homePage.clickOnElectronicTab();
        String expectedMessage = "Electronics";
        String actualMessage = electronicPage.getElectronicTab();
        Assert.assertEquals(expectedMessage,actualMessage,"error");
    }

}
