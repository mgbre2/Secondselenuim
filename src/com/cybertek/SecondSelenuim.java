package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondSelenuim {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/mussietewolde/Desktop/seleniumfolder/driver/geckodriver");


        WebDriver driver= new FirefoxDriver();


        driver.get("https://etsy.com");

        driver.navigate().to("https://amazon.com");

        driver.navigate().back();//take to the privouse page

        driver.navigate().forward();//take you for word

        driver.navigate().refresh();//refresh the page


    }
}
