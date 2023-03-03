package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage {
    public WebDriver driver;
    //Login btn
    By signin_btn = By.xpath("//a[contains(@id,\"loginPopup\")]");
    By userid = By.xpath("//input[contains(@id,\"loginEmail\")]");
    By password = By.xpath("//input[@id=\"password\"]"); // can't use contains here because there
    // another element that is also starting with password, moreover this element does not have any dymanic values.
    By login_btn = By.xpath("//button[@data-msg=\"Your changes have been saved\" and text()=\"Sign In\"]");
    //multiple elements containing same text, btn name and no values are dynamic here

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public String getLoginPageTitle() throws InterruptedException {
        Thread.sleep(1000);
        return driver.getTitle();
    }
    public void clickonsigninbtn() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(signin_btn).click();
        Thread.sleep(1000);
    }
    public void enterusername(String username) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(userid).sendKeys(username);
        Thread.sleep(1000);
    }
    public void enterpassword(String pwd) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(password).sendKeys(pwd);
        Thread.sleep(3000);
    }
    public void clickonloginbtn() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(login_btn).click();
        Thread.sleep(5000);
    }
}
