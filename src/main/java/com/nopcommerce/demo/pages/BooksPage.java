package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {

    By booksTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");
    By clickbooks = By.xpath("//ul[@class='top-menu notmobile']//li//a[contains(text(),'Books')]");

    public void clickOnBooksTab() {
        clickOnElement(clickbooks);
    }

    public String getBooksTab() {

        return getTextFromElement(booksTab);


    }

}
