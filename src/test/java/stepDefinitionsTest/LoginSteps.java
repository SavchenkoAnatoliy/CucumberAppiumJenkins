package stepDefinitionsTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.Browsers;
import utils.DetailsReader;

import java.net.URL;


public class LoginSteps {
    public static final Logger logger = (Logger) LogManager.getLogger(LoginSteps.class);
    private static String title;
    public LoginPage loginPage = new LoginPage(Browsers.getDriver());
    public DiggiGamesPage diggiGamespage = new DiggiGamesPage(Browsers.getDriver());
    private DetailsReader detailsreader = new DetailsReader();
//    private pages.diggiGamespage diggiGamespage = new diggiGamespage(browsers.getDriver());
    public String baseImagePath;
    public URL resourceFolderURL = this.getClass().getClassLoader().getResource("rgsimages");


    @Given("user opens url")
    public void open_url()
    {
        Browsers.getDriver()
                .get("https://gasc1playdigital.dev.igt.com/en-us/home.html");

    }
    @When("user gets the title of the page")
    public void get_page_title() throws InterruptedException {
        title = loginPage.getLoginPageTitle();
        System.out.println("Page title is: " + title);
    }
    @When("user click on sign in button")
    public void user_click_on_signin_button() throws InterruptedException {
        loginPage.clickonsigninbtn();
    }
    @When("user enters the user id")
    public void enter_the_userid() throws InterruptedException {
        detailsreader.init_prop();
        loginPage.enterusername(detailsreader.prop.getProperty("username1"));

    }
    @And("user enters the password")
    public void enters_the_pwd() throws InterruptedException {
            detailsreader.init_prop();
            loginPage.enterpassword(detailsreader.prop.getProperty("pwd1"));
    }
    @And("click on Login button")
    public void click_on_login_button() throws InterruptedException {
        loginPage.clickonloginbtn();;
    }

}





