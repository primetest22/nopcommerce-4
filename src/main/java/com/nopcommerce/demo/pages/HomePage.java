package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By computers = By.linkText("Computers");
    By electronics = By.linkText("Electronics");
    By apparel = By.linkText("Apparel");
    By digitaldownloads = By.linkText("Digital downloads");
    By jewelry = By.linkText("Jewelry");
    By clickbooks = By.xpath("//ul[@class='top-menu notmobile']//li//a[contains(text(),'Books')]");

    public void clickOnBooksTab() {
        clickOnElement(clickbooks);
    }

    public void clickOnLoginLink() {

        clickOnElement(loginLink);

    }

    public void registerLink() {

    }

    public void clickOnComputerTab() {
        clickOnElement(computers);
    }

    public void clickOnElectronicTab() {
        clickOnElement(electronics);
    }

    public void clickOnApparelTab() {
        clickOnElement(apparel);
    }

    public void clickOnDigitalDownloadTab() {
        clickOnElement(digitaldownloads);
    }

    public void clickOnJewelryTab() {
        clickOnElement(jewelry);
    }
    public void clickOnRegisterTab() {
        clickOnElement(registerLink);
    }



}
