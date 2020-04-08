package com.orangehrmlive.demo.opensource.testbase;

import com.orangehrmlive.demo.opensource.basepage.BasePage;
import com.orangehrmlive.demo.opensource.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

        //object creation
        BrowserSelector browserSelector = new BrowserSelector();
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        //open browser
        @BeforeMethod
        public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        }

        //close browser
        @AfterMethod
        public void closeBrowser() {
            driver.quit();
        }
}