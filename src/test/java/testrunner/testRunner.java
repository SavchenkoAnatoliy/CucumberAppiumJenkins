package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = ".//Features/login.feature",
            glue = {"stepDefinitionsTest"},
            dryRun = false,
            monochrome = false,
            plugin = {"pretty",
                    "json:target/cucumber-reports/Cucumber.json",
                    "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})
    public class testRunner {

    }