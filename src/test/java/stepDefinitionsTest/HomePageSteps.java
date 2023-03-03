package stepDefinitionsTest;

import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.HomePage;
import utils.Browsers;

public class HomePageSteps {
    public static final Logger logger = (Logger) LogManager.getLogger(HomePage.class);

    public HomePage homepage = new HomePage(Browsers.getDriver());

    @When("user Open Games page")
    public void open_games_page()
    {
        homepage.openGames();
    }
    @When("user Open Diggi Games page")
    public void open_diggigames_page()
    {
        homepage.openDiggiGames();
    }



}


