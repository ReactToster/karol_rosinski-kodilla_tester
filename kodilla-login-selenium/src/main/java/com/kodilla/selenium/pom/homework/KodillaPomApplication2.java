package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaPomApplication2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/karolrosinski/IdeaProjects/kodilla-course/kodilla-login-selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStorePom kodillaStorePom = new KodillaStorePom(driver);
        kodillaStorePom.search("NoteBook");
        kodillaStorePom.close();
    }
}
