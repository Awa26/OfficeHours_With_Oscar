package com.cydeo.tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EtsyTest {

    public static void main(String[] args) {

        /*
        go to https://www.etsy.com/
    locate Help Center link and click
    verify that url contains "help"
         */
        //setting up
        WebDriverManager.chromedriver().setup();
        //creating object of ChromeDriver and store in to driver
        WebDriver driver = new ChromeDriver();
        //Maximize page
        driver.manage().window().maximize();

        // go to https://www.etsy.com/
        driver.get("https://www.etsy.com/");


        // using xpath and the text of the element
        // WebElement helpLink = driver.findElement(By.xpath("//a[.='Go to Help Center']"));

        // for link we have linkText or partialLinkText we can use directly
        WebElement helpLink = driver.findElement(By.partialLinkText("Help Center"));
        helpLink.click();

        if (driver.getCurrentUrl().contains("help")){
            System.out.println("Verification PASSED!!!");
        }
    }
}
