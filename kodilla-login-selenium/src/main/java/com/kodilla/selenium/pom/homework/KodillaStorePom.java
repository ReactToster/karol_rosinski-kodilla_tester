package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom extends AbstractKodillaStorePom {

    @FindBy(id = "searchField")
    private WebElement searchField;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> search(String searchValue) {
        searchField.sendKeys(searchValue);
        List<WebElement> searchResults = driver.findElements(By.className("element"));
        return searchResults;
    }

    public void close() {
        driver.close();
    }

}
