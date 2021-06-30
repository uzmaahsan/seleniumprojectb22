package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowPractice {
    WebDriver driver ;
    // TC # : Window Handle practice
    //1. Create a new class called: WindowHandlePractice
    //2. Create new test and make set ups
    //3. Go to : http://practice.cybertekschool.com/windows
    //4. Assert: Title is “Practice”
    //5. Click to: “Click Here” text
    //6. Switch to new Window.
    //7. Assert: Title is “New Window”
    @BeforeMethod
    public void setupClass() {
        //Printing out the window handle of the first page opened
        //Storing the first windowHandle into a string is a useful practice for future needs when we need
        // to switch back to it
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }
    @Test
    public void window_practice(){
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        String actualTitleBeforeClick = driver.getTitle();
        String expectedTitleBeforeClick = "Practice";
        WebElement ClickHere= driver.findElement(By.linkText("Click Here"));
        for (String each : driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("Current title with Switching" + driver.getTitle());
           // if(driver.getTitle().contains("something")){
              //  break;
            }
        String actualTitleAfterClick = driver.getTitle();

        System.out.println("actualTitleAfterClick = " + actualTitleAfterClick);

        }



        }


