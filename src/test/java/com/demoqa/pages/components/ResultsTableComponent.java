package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class ResultsTableComponent {

    SelenideElement
            modalWindow = $(".modal-dialog"),
            modalTitle = $("#example-modal-sizes-title-lg"),
            resultsTable = $(".table-responsive table"),
            closeModalWindowButton = $("#closeLargeModal");

    private final static String TITLE_TEXT = "Thanks for submitting the form";

    public void checkVisible() {
        modalWindow.should(appear);
        modalTitle.shouldHave(text(TITLE_TEXT));

    }

    public void checkResult(String key, String value) {
        resultsTable.$(byText(key)).parent().shouldHave(text(value));

    }

    public void checkCloseModal() {
        closeModalWindowButton.click();
        modalWindow.should(disappear);
    }
}



