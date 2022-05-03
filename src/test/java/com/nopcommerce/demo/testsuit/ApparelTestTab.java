package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.Apparel;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApparelTestTab extends TestBase {

    HomePage homePage = new HomePage();
    Apparel apparelpage = new Apparel();

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //click on apparel tab and validate
        homePage.clickOnApparelTab();
        String expectedMessage = "Apparel";
        String actualMessage = apparelpage.getApparelTab();
        Assert.assertEquals(expectedMessage,actualMessage,"error");
    }
}
