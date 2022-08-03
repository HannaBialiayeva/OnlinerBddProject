package com.itacademy.onlinerBdd.definitions;

import com.codeborne.selenide.Condition;
import com.itacademy.onlinerBdd.framework.OnlinerHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.itacademy.onlinerBdd.framework.OnlinerHomePage.AUTO_SECTION_HEADER;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AutoSectionMenuSteps {

    private OnlinerHomePage onlinerHomePage = new OnlinerHomePage();

    @Given("the user opens Onliner website and find Auto section")
    public void userOpensOnlinerWebsiteAndFindAutoSection() {
        onlinerHomePage.openOnlinerWebsite();
        onlinerHomePage.findSectionChildMenu(AUTO_SECTION_HEADER).isDisplayed();

    }

    @When("the user hovers on the 'Автобарахолка' section")
    public void theUserHoverOnTheAutoSectionLink() {
        onlinerHomePage.findSectionLinkInMainMenu(AUTO_SECTION_HEADER).hover().should(Condition.visible);
    }

    @Then("section child menu contains columns with price, location, car make")
    public void autoSectionColumnIsDisplayed() {
        assertThat(onlinerHomePage.isSectionChildMenuColumnDisplayed("price"))
                .as("Section child menu doesn't contain columns with price rages")
                .isTrue();
        assertThat(onlinerHomePage.isSectionChildMenuColumnDisplayed("city"))
                .as("Section child menu doesn't contain columns with cities")
                .isTrue();
        assertThat(onlinerHomePage.isSectionChildMenuColumnDisplayed("bmw"))
                .as("Section child menu doesn't contain columns with at least 1 carmake")
                .isTrue();
    }
}

