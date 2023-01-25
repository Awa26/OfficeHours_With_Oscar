package com.cydeo.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification {
    public static void main(String[] args) {
           //TC #1: Facebook title verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com/
        //3. Verify title:
        //Expected: “Facebook – log in or sign up”


        //setting up your browser driver (chrome)
        WebDriverManager.chromedriver().setup();
        //1. OS -windows, browser - chrome

        //creating our diver object for automation
        WebDriver driver = new ChromeDriver();
        //maximize my page
        driver.manage().window().maximize();

        //go to this page
        driver.get("https://www.facebook.com/");

        ////3. Verify title:
        //        //Expected: “Facebook – log in or sign up”
        String expectedTitle = "Facebook - log in or sign up";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!!!");
        }else {
            System.out.println("Title verification FAILED!!!");
        }
       // System.out.println("actualTitle = " + actualTitle);
       // System.out.println("expectedTitle = " + expectedTitle);
        driver.close();

    }
}
