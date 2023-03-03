package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Mouse;
import org.sikuli.script.Screen;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.sikuli.script.Mouse.at;
import static org.sikuli.script.Mouse.move;

public class Utilities {
    static String imagePath = "src/test/resources/game image/";
    static File imageFile = new File(imagePath);
    static String absImagePath = imageFile.getAbsolutePath();
    static final String screenshotPath = "src/test/screenshots/";
    static File screenFile = new File(screenshotPath);
    static String absScreenshotPath = screenFile.getAbsolutePath();

    public static String screenshot(WebDriver driver, String event) throws IOException {
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String time = formatter.format(ts);
        time = time.replace("-", "");
        time = time.replace(" ", "");
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destFile = absScreenshotPath + "\\screen" + event + "_" + time + ".jpg";
        System.out.println("SCREENSHOTS " + destFile);
        FileUtils.copyFile(f, new File(destFile));
        return destFile;
    }

    public static String getAbsImagePath() {
        return absImagePath;
    }

    public static void scrolldown() throws InterruptedException {
        Mouse sc = null;
        sc.wheel(Mouse.WHEEL_DOWN,1);
        //Thread.sleep(2000);
    }

    public static void scrollup() throws InterruptedException {
        Mouse sc = null;
        sc.wheel(Mouse.WHEEL_UP, 1);
        Thread.sleep(2000);
    }

    public static void mouse() throws AWTException {
        try {
            // These coordinates are screen coordinates
            int xCoord = 200;
            int yCoord = 200;

            // Move the cursor
            Robot robot = new Robot();
            robot.mouseMove(xCoord, yCoord);
        } catch (AWTException e) {
        }
    }
    /*public static void launchApplication() throws FindFailed {

        try {
            Pattern p = Pattern.compile("C://Users//nesea//Desktop//progetto_automation//Cucumber-DiggiGames//src//test//resources//game image//Gold Blast");
            Matcher m = p.matcher("C://Users//nesea//Desktop//progetto_automation//Cucumber-DiggiGames//src//test//resources//game image//Gold Blast//ok_option.png");
            if (m.find()) {
                Screen s = new Screen();
                Mouse sc = null;
                s.click(p + "//try.png");
            }
        } catch (FindFailed e) {
            Pattern p = Pattern.compile("C://Users//nesea//Desktop//progetto_automation//Cucumber-DiggiGames//src//test//resources//game image//Gold Blast");
            Mouse sc = null;
            Screen s = new Screen();
            sc.wheel(Mouse.WHEEL_DOWN, -1);
            s.click(p + "//ok_option.png");
        }*/
    }


