package stepDefinitionsTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.Browsers;
import utils.DetailsReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Properties;

//import static pages.DiggiGamesPage.driver;

public class ApplicationHooks {
    public static final Logger logger = (Logger) LogManager.getLogger(ApplicationHooks.class);
    public Browsers browsers;
    private WebDriver driver;
    private DetailsReader detailsreader;
    Properties prop;

    @Before(order = 0)
    public void getProperty() {
        detailsreader = new DetailsReader();
        prop = detailsreader.init_prop();
    }

    @Before(order = 1)
    public void launchBrowser() {
        String browserName = prop.getProperty("browser");
        browsers = new Browsers();
        driver = browsers.init_driver(browserName);
    }

    @After(order = 1)
    public void quitBrowser() {
        //driver.quit();
    }


    @After(order = 0)
    public void af(Scenario scenario1) throws InterruptedException, IOException, IllegalMonitorStateException {
        scenario1.log("After Hook");
        if (scenario1.isFailed()) {
            Thread.sleep(5000);
            Allure.addAttachment("Error", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        }
        driver.quit();
    }


}

