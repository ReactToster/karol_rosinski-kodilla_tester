package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("/Users/karolrosinski/Documents/Development/Kodilla/results"))
                .snapshotPath(Paths.get("/Users/karolrosinski/Documents/Development/Kodilla/snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(webDriver);
        page.open();
        page.compare();
        page.close();
    }
}
