package com.cybertek;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyURLTest {
    public static void main(String[] args) {
        /*1.  Open chrome browser
        2. go to url "https://google.com"
        3. Verify urlExpected url:
         "https://www.google.com/"*/

            // THIS TEST IS SUPPOSED TO FAIL,
            // mmy code is failing
            // your may passpublic static void main(String[] args)
            // {
        System.setProperty("webdriver.chrome.driver",
            "/Users/mussietewolde/Desktop/seleniumfolder/driver/chromedriver");


             WebDriver driver = new ChromeDriver();

             driver.get("http://google.com");

            String expectedUrl = "https://www.google.com/";

             String actualUrl = driver.getCurrentUrl() ;

             if (expectedUrl.equals(actualUrl)){

             System.out.println("PASS");

             } else {
             System.out.println("FAIL");
             System.out.println("actualUrl = " + actualUrl);
             System.out.println("expectedUrl = " + expectedUrl);
             }
             System.out.println(driver.getPageSource());
             //gets the HTML of the page
        }
    }

