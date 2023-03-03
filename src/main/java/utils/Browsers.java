package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browsers {
    public WebDriver driver;

     public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
     public void browsers(WebDriver driver)
     {
         this.driver=driver;
     }



    public static WebDriver init_driver(String browser)
    {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();

        System.out.println("browser value is: " + browser);

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        } else if (browser.equals("edge")) {
            tlDriver.set(new EdgeDriver());
        } else {
            System.out.println("Please pass the correct browser value: " + browser);
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();


        return getDriver();

    }


    public static synchronized WebDriver getDriver()
    {
        return tlDriver.get();
    }
}
