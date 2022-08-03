package com.itacademy.onlinerBdd.definitions;

import com.codeborne.selenide.Condition;
import com.itacademy.onlinerBdd.framework.OnlinerHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.itacademy.onlinerBdd.framework.OnlinerHomePage.HOUSES_SECTION_HEADER;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HousesSectionMenuSteps {

    private OnlinerHomePage onlinerHomePage = new OnlinerHomePage();


    @Given("the user opens Onliner website and find House section")
    public void userOpensOnlinerWebsiteAndFindHomeSection() {
        onlinerHomePage.openOnlinerWebsite();
        onlinerHomePage.findSectionChildMenu(HOUSES_SECTION_HEADER).isDisplayed();
    }

    @When("the user hovers on the 'Houses and apartments' section")
    public void theUserHoverOnTheHouseSectionLink() {
        onlinerHomePage.findSectionLinkInMainMenu(HOUSES_SECTION_HEADER).hover().should(Condition.visible);
    }

    @Then("section child menu contains columns with price ranges, cities, number of rooms")
    public void houseSectionColumnsAreDisplayed() {
        assertThat(onlinerHomePage.isSectionChildMenuColumnDisplayed("price"))
                .as("Section child menu doesn't contain columns with price rages")
                .isTrue();
        assertThat(onlinerHomePage.isSectionChildMenuColumnDisplayed("bound"))
                .as("Section child menu doesn't contain columns with cities")
                .isTrue();
        assertThat(onlinerHomePage.isSectionChildMenuColumnDisplayed("rooms"))
                .as("Section child menu doesn't contain columns with number of rooms")
                .isTrue();
    }
}
