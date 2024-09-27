package com.automation.tests;

import com.automation.pages.*;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    HomePage homePage;
    MensSectionPage mensSectionPage;
    MensTShirtPage mensTShirtPage;
    TShirtPage tShirtPage;


    @BeforeMethod
    public void setUp(){
        DriverManager.initDriver();
        ConfigReader.initConfigReader();
        homePage = new HomePage();
        mensSectionPage = new MensSectionPage();
        mensTShirtPage = new MensTShirtPage();
        tShirtPage = new TShirtPage();
    }

    @AfterMethod
    public void cleanUp(){
        DriverManager.getDriver().quit();
    }
}
