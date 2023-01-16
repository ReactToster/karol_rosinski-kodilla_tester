package com.kodilla.selenium.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestingApp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/test/login");
        driver.manage().window().maximize();

        WebElement inputEmailField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
        inputEmailField.sendKeys("testuser@gmail.com");
        WebElement inputPasswordField = driver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
        inputPasswordField.sendKeys("Haslo");
        WebElement buttonLogin = driver.findElement(By.xpath("//html/body/section/form/button[1]"));
        buttonLogin.submit();
    }
}
