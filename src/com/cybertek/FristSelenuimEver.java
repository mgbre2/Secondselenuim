package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FristSelenuimEver {
    public static void main(String[] args) {
        //1 step open chrome
        System.setProperty("webdriver.chrome.driver",


                "/Users/mussietewolde/Desktop/seleniumfolder/driver/chromedriver");


        WebDriver driver = new ChromeDriver();
        //step 2 go to url"https://google.com"

        driver.get("https://google.com");
        //step 3 verifieying the tilte
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle=" + actualTitle);

        String expectedTitle = "Google";
        //verfieynig
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("PASS");
            System.out.println("Expected:"+expectedTitle);
            System.out.println("Actual:"+actualTitle);


        }else {
            System.out.println("FAIL");
            System.out.println("Expected:"+expectedTitle);
            System.out.println("Actual:"+actualTitle);
        }
    }

}