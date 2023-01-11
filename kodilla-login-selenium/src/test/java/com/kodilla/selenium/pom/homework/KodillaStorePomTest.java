package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaStorePomTest {

    KodillaStorePom kodillaStorePom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        kodillaStorePom = new KodillaStorePom(driver);
        driver.navigate().to("https://kodilla.com/pl/test/store");
    }

    @Test
    public void testSearchResults_ShouldGive2Elements() {
        Assertions.assertEquals(2, kodillaStorePom.search("NoteBook").size());
    }

    @Test
    public void testSearchResultsCaseSensitive_ShouldGive2Elements() {
        Assertions.assertEquals(2, kodillaStorePom.search("notebook").size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"School", "Brand", "Gaming"})
    public void testSearchResults_ShouldGive1Elements(String searchValue) {
        Assertions.assertEquals(1, kodillaStorePom.search(searchValue).size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"school", "brand", "gaming"})
    public void testSearchResultsCaseSensitive_ShouldGive1Elements(String searchValue) {
        Assertions.assertEquals(1, kodillaStorePom.search(searchValue).size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Business", "Powerful"})
    public void testSearchResults_ShouldGive0Elements(String searchValue) {
        Assertions.assertEquals(0, kodillaStorePom.search(searchValue).size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"business", "powerful"})
    public void testSearchResultsCaseSensitive_ShouldGive0Elements(String searchValue) {
        Assertions.assertEquals(0, kodillaStorePom.search(searchValue).size());
    }

    @AfterEach
    public void testDown() {
        kodillaStorePom.close();
    }
}
