package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

public class ScreenshotUtil {

    public static void capture(WebDriver driver, String testName, String status) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Create folder
            File folder = new File("screenshots");
            if (!folder.exists()) {
                boolean isCreated = folder.mkdir();

                if (!isCreated) {
                    System.out.println("Failed to create screenshots folder");
                }
            }

            // File name
            String fileName = testName + "_" + status + "_" + System.currentTimeMillis() + ".png";
            File dest = new File(folder, fileName);

            FileHandler.copy(src, dest);

        } catch (Exception e) {
            System.out.println("Screenshot failed: " + e.getMessage());
        }
    }
}