package com.amfam;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected WebDriver driver;


    @Before
    public void SetUp() {
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Albina Karimova\\Downloads\\chromedriver_win32\\chromedriver.exe" );

        driver = new ChromeDriver( );

        driver.manage().window().fullscreen();

        driver.get( "https://www.amfam.com/" );

        System.out.println("Start");

    }

    @After
    public void Quit() {

        System.out.println("Finish");

      //  driver.quit();

    }




}
