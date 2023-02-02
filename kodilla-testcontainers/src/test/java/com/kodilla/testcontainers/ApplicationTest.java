package com.kodilla.testcontainers;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.DefaultRecordingFileFactory;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

@Testcontainers
public class ApplicationTest {
    private static final ChromeOptions chromeOptions = new ChromeOptions();

    @Rule
    public Network network = Network.newNetwork();

    @Container
    public GenericContainer webServer =
            new GenericContainer(
                    new ImageFromDockerfile()
                            .withFileFromClasspath("/tmp/index.html", "index.html")
                            .withDockerfileFromBuilder(builder ->
                                    builder
                                            .from("httpd:2.4")
                                            .copy("/tmp/index.html", "/usr/local/apache2/htdocs")
                                            .build()))
                    .withNetwork(network)
                    .withNetworkAliases("my-server")
                    .withExposedPorts(80);

    @Container
    public BrowserWebDriverContainer chrome =
            new BrowserWebDriverContainer<>()
                    .withNetwork(network)
                    .withRecordingMode(RECORD_ALL, new File("./build/"))
                    .withRecordingFileFactory(new DefaultRecordingFileFactory())
                    .withCapabilities(chromeOptions);


    @Test
    public void customImageTest() throws InterruptedException, IOException {
//        RemoteWebDriver driver = await().atMost(20, TimeUnit.SECONDS).until(() -> {
//            return new RemoteWebDriver(chrome.getSeleniumAddress(), chromeOptions);
//        }, Objects::nonNull);
        RemoteWebDriver driver = chrome.getWebDriver();

        driver.get("http://my-server/");

        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        String title = driver.findElement(By.id("title")).getText();
        assertEquals("My dockerized web page.", title);
    }
}
