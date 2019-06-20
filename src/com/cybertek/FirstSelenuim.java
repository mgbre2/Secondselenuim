package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenuim {
    public static void main(String[] args) {

//we cannot open the browser without setting the path drivers
//this line must to  come before creating the webdriver object

        //Frist argument is the type driver
        System.setProperty("webdriver.chrome.driver",
    //location of driver

                "/Users/mussietewolde/Desktop/seleniumfolder/driver/chromedriver");

        //this line open the chrome browser

        WebDriver driver = new ChromeDriver();
        //open the website
        driver.get("https://google.com");

        ///git
    }

}
