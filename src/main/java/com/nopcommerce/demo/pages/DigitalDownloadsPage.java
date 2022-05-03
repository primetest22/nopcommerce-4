package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadsPage extends Utility {

    By digitalDownloadsTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]");


    public String getDigitalDownloadsTab(){

        return getTextFromElement(digitalDownloadsTab);


    }





}
