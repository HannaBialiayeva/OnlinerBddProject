package com.itacademy.onlinerBdd.framework;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class AbstractPage {

    public SelenideElement find(By by) {
        return $(by);
    }

    public List<SelenideElement> findAll(By by) {
        return $$(by);
    }

    public boolean isElementDisplayed(By by) {
        return find(by).isDisplayed();
    }

    public boolean isElementsListPresented(By by) {
        return !findAll(by).isEmpty();
    }

}

