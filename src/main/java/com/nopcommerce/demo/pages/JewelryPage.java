package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {

    By jewelryTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");


    public String getJewelryTab(){

        return getTextFromElement(jewelryTab);


    }

}
