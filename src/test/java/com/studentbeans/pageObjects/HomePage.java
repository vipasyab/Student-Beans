package com.studentbeans.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class HomePage {
    @FindBy(className = "_129yvzv")
    private WebElement searchBar;
    @FindBy(className = "_1g5dvk1")
    private WebElement searchTextBox;
    @FindBy(css = "a._mtchbu")
    private WebElement searchItems;
    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookies;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSearchBar() {
        searchBar.click();
    }

    public void enterSearchText(String item) {
        searchTextBox.sendKeys(item);
    }

    public void searchList() {
        assertTrue(searchItems.isDisplayed());
    }

    public void acceptCookies() {
        cookies.click();
    }
}
