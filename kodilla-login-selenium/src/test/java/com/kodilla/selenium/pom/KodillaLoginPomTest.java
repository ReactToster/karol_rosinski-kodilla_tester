package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaLoginPomTest {
    KodillaLoginPom kodillaLoginPom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/login");
        driver.manage().window().maximize();
        kodillaLoginPom = new KodillaLoginPom(driver);
    }

    @Test
    public void testLoginPage_CheckErrorValidation() {
        String email = "blabla@blabla.com";
        String password = "1111";
        boolean isLoggedIn = kodillaLoginPom.login(email, password);
        Assertions.assertFalse(isLoggedIn);
    }

    @Test
    public void testLoginPage_CheckPositiveValidation() {
        String email = "test@kodilla.com";
        String password = "kodilla123";
        boolean isLoggedIn = kodillaLoginPom.login(email, password);
        Assertions.assertTrue(isLoggedIn);
    }

    @AfterEach
    public void testDown() {
        kodillaLoginPom.close();
    }
}
