package com.studentbeans.stepDefinition;

import com.studentbeans.base.PagesBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleSearch {

    @Given("I am on the studentbeans homepage")
    public void i_am_on_the_studentbeans_homepage() {
        PagesBase.driver.navigate().to(PagesBase.prop.getProperty("url"));
        PagesBase.homePage.acceptCookies();
    }

    @Given("I open the search bar")
    public void i_open_the_search_bar() {
        PagesBase.homePage.clickOnSearchBar();
    }

    @When("I enter {string}")
    public void i_enter(String item) {
        PagesBase.homePage.enterSearchText(item);
    }

    @Then("I should be shown a search listing for {string}")
    public void i_should_be_shown_a_search_listing_for(String string) {
        PagesBase.homePage.searchList();
    }

}
