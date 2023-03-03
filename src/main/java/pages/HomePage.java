package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    By openGames = By.xpath("//a[contains(@title,\"Games\")]");
    By openDiggiGames = By.xpath("//a/span[contains(@class,\"sprite-dglogo-bdr-sm\")]");
    public void openGames()
    {
        driver.findElement(openGames).click();
    }

    public void openDiggiGames()
    {
        driver.findElement(openDiggiGames).click();
    }
}
