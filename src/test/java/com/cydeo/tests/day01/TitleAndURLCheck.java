package com.cydeo.tests.day01;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndURLCheck {
    public static void main(String[] args) throws InterruptedException {

            /*
                            TC #2: Title and Url check
                1. Open Chrome browser
                2. Go to https://www.facebook.com/
                3. Verify url contains facebook
                4. Verify title contains Facebook
                5. Navigate to https://www.google.com/
                6. Verify url contains google
                7. Verify title contains Google
                8. Navigate back
                9. Verify url contains facebook
                10.Navigate forward
                11.Verify url contains google

             */
        //TC #2: Title and Url check
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        // creating object
        WebDriver driver = new ChromeDriver();
        //maximize
        driver.manage().window().maximize();

       // 2. Go to https://www.facebook.com/
        driver.get("https://www.facebook.com/");

       // 3. Verify url contains facebook
        String expectedURL = "facebook";

        String actualURL = driver.getCurrentUrl();

        if (!actualURL.contains(expectedURL)){
            System.out.println("verification failed on url!!!");
            System.exit(-1);}

        //4. Verify title contains Facebook
        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();

        if (!actualTitle.contains(expectedTitle)) {
            System.err.println("Title verification FAILED on Facebook!!!");
            System.exit(-1);
        }

        //5. Navigate to https://www.google.com/
        driver.navigate().to("https://www.google.com/");

        // 6. Verify url contains google
        if (!driver.getCurrentUrl().contains("google")){
            System.err.println("FAILED!");
            System.exit(-1);
        }


        //7. Verify title contains Google
        if (!driver.getTitle().contains("Google")){
            System.out.println("FAILED!!");
            System.exit(-1);
        }
            Thread.sleep(3000);


       // 8. Navigate back
            driver.navigate().back();
            Thread.sleep(3000);

      //  9. Verify url contains facebook
            if (!driver.getCurrentUrl().contains("facebook")){
                System.out.println("Failed verification on facebook");
                System.exit(-1);
            }
            Thread.sleep(3000);

        //10.Navigate forward
            driver.navigate().forward();

       // 11.Verify url contains google
            if (!driver.getCurrentUrl().contains("google")){
                System.out.println("Failed on URL Verification of google");
                System.exit(-1);
            }
            System.out.println("Successfully verified!!!");
           driver.close();


    }
}
