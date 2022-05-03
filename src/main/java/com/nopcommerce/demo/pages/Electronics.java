package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {

    By electronicTab = By.linkText("Electronics");
    public String getElectronicTab(){

        return getTextFromElement(electronicTab);


    }

}
