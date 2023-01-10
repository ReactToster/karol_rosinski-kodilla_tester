package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        Duration waitDelayListOfObjects = Duration.ofSeconds(15);

        System.setProperty("webdriver.chrome.driver", "/Users/karolrosinski/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement cookieDialog = driver.findElement(By.cssSelector("#opbox-gdpr-consents-modal > div > div[class*=dg8gwj] > div > div[class*=msts_pt] > button[data-role=accept-consent]"));
        cookieDialog.click();

        WebElement inputSearch = driver.findElement(By.cssSelector("input[class*=msts_pt]"));
        inputSearch.sendKeys("mavic mini");

        WebElement categoryCombo = driver.findElement(By.cssSelector("select[class*=mr3m_1]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByValue("/kategoria/elektronika");

        WebElement searchButton = driver.findElement(By.cssSelector("button[data-role=search-button]"));
        searchButton.submit();

        WebDriverWait wait = new WebDriverWait(driver, waitDelayListOfObjects);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article")));

        List<WebElement> articles = driver.findElements(By.cssSelector("section > article"));
        articles.stream()
                .forEach(article -> System.out.println(article.getText() + "\n-------------------"));
    }
}
