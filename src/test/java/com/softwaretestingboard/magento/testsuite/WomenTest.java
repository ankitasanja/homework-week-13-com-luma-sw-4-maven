package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenTestPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class WomenTest extends BaseTest {

    WomenTestPage testPage = new WomenTestPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        testPage.mouseHoverOnWomenMenuTab();
        testPage.mouseHoverOnTopTab();
        testPage.clickOnJackets();
        testPage.selectSortByFilterProductName();

        //Verify the products name display in alphabetical order
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(testPage.returnListOfProductNamesElementsLocator());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(testPage.returnListOfProductNamesElementsLocator());

        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in alphabetical order");
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        testPage.mouseHoverOnWomenMenuTab();
        testPage.mouseHoverOnTopTab();
        testPage.clickOnJackets();
        testPage.selectSortByFilterPrice();

        //Verify the products price display in Low to High
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(testPage.returnListOfPriceElementsLocator());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(testPage.returnListOfPriceElementsLocator());


        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in alphabetical order");

    }
}
