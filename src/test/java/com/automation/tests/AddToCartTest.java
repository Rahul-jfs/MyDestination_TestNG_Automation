package com.automation.tests;

import com.automation.utils.ConfigReader;
import com.automation.utils.ExtentReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void addToCartTest(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        ExtentReportManager.attachScreenshot();
        ExtentReportManager.getTest().pass("Home Page displayed");
        homePage.clickMensSection();

        Assert.assertTrue(mensSectionPage.isMensSectionDisplayed());
        ExtentReportManager.attachScreenshot();
        ExtentReportManager.getTest().pass("Mens Section page displayed");
        mensSectionPage.clickOnTShirtCategory();

        Assert.assertTrue(mensTShirtPage.isMensTShirtPageDisplayed());
        ExtentReportManager.attachScreenshot();
        ExtentReportManager.getTest().pass("Mens TShirt page displayed");
        mensTShirtPage.addOneTShirtToCart();

        tShirtPage.selectSmallSize();
        tShirtPage.clickAddToCartBtn();
        ExtentReportManager.attachScreenshot();
        ExtentReportManager.getTest().pass("Items added to cart successfully");
        Assert.assertTrue(tShirtPage.isItemAddedToCart());
    }
}
