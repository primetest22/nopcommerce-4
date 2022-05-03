package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.Apparel;
import com.nopcommerce.demo.pages.DigitalDownloadsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigitalDownloadTabTest extends TestBase {

    HomePage homePage = new HomePage();
    DigitalDownloadsPage digitalDownloadPage = new DigitalDownloadsPage();

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on digital downloads and validate
        homePage.clickOnDigitalDownloadTab();
        String expectedMessage = "Digital downloads";
        String actualMessage = digitalDownloadPage.getDigitalDownloadsTab();
        Assert.assertEquals(expectedMessage, actualMessage, "error");
    }


}
