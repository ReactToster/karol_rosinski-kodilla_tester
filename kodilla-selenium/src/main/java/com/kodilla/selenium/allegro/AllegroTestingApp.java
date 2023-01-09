package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/karolrosinski/Documents/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement cookieDialog = driver.findElement(By.xpath("//div[@role=\"alertdialog\"]/div/div/button[@data-role=\"accept-consent\"]"));
        cookieDialog.click();

        WebElement inputSearch = driver.findElement(By.xpath("//div[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/input[1]"));
        inputSearch.sendKeys("mavic mini");

        WebElement categoryCombo = driver.findElement(By.xpath("//div[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/div/div/select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByValue("/kategoria/elektronika");

        WebElement searchButton = driver.findElement(By.xpath("//div[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/button"));
        searchButton.submit();
    }
}
