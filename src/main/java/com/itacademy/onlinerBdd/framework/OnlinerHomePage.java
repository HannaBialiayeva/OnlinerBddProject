package com.itacademy.onlinerBdd.framework;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;

public class OnlinerHomePage extends AbstractPage {

    public static final String ONLINER_URL = "https://onliner.by/";
    public static final String AUTO_SECTION_HEADER ="Автобарахолка";
    public static final String HOUSES_SECTION_HEADER ="Дома и квартиры";

    private static final String MAIN_MENU_SECTION_LINK_PATTERN = "//span[@class = 'b-main-navigation__text' and contains(text(), '%s')]/ancestor::a";
    private static final String CHILD_MENU_PATTERN = "//span[@class = 'b-main-navigation__text' and contains(text(), '%s')]/ancestor::a/following-sibling::div";
    private static final String CHILD_MENU_ITEM_PATTERN = "//*[contains(@class, 'b-main-navigation__dropdown-advert-link') and contains(@href, '%s')]";

    public void openOnlinerWebsite() {
        System.setProperty("selenide.browser", "chrome");
        open(ONLINER_URL);
    }

    public SelenideElement findSectionLinkInMainMenu(String linkText) {
        return find(By.xpath(format(MAIN_MENU_SECTION_LINK_PATTERN, linkText)));
    }

    public SelenideElement findSectionChildMenu(String linkText){
        return find(By.xpath(format(CHILD_MENU_PATTERN, linkText)));
    }

    public List<SelenideElement> findSectionChildMenuItem(String text){
        return findAll(By.xpath(format(CHILD_MENU_ITEM_PATTERN, text)));
    }

    public boolean isSectionChildMenuColumnDisplayed(String text){
        return isElementsListPresented(By.xpath(format(CHILD_MENU_ITEM_PATTERN, text)));
    }

}
