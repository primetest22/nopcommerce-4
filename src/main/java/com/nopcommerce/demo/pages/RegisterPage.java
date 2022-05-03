package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By firsnameField = By.id("FirstName");
    By lastnameField = By.id("LastName");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmpasswordField = By.id("ConfirmPassword");

    By registerbutton = By.id("register-button");
    By registerCompletionText = By.xpath("//div[contains(text(),'Your registration completed')]");


    public String getRegisterTab() {

        return getTextFromElement(registerText);


    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firsnameField, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastnameField, lastname);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmpassword) {
        sendTextToElement(confirmpasswordField, confirmpassword);
    }

    public void clickOnRegisterButton() {

        clickOnElement(registerbutton);
    }

    public String getRegisterCompletionText() {

        return getTextFromElement(registerCompletionText);
    }


}
