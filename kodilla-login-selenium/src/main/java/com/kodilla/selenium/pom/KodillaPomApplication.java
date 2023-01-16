package com.kodilla.selenium.pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaPomApplication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/login");
        driver.manage().window().maximize();
        KodillaLoginPom pom = new KodillaLoginPom(driver);
        pom.login("test@test.com", "pass222");
        pom.close();
    }
}
