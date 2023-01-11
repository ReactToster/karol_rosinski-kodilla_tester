package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaPomApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/karolrosinski/IdeaProjects/kodilla-course/kodilla-login-selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/login");
        KodillaLoginPom pom = new KodillaLoginPom(driver);
        pom.login("test@test.com", "pass222");
        pom.close();
    }
}
