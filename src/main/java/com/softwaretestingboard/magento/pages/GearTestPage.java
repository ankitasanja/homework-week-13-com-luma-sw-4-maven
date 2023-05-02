package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearTestPage extends Utility {
    By gearMenu = By.xpath("//a[@id='ui-id-6']");
    By bags = By.xpath("//span[contains(text(),'Bags')]");
    By overnightDuffle = By.xpath("//a[contains(text(),'Overnight Duffle')]");
    By overnightDuffleText = By.xpath("//span[contains(text(),'Overnight Duffle')]");
    By quantity3 = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//span[contains(text(),'Add to Cart')]");
    By addedDuffleText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By productNameDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By text3 = By.cssSelector(".input-text.qty");
    By price135 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By quantity5 = By.cssSelector(".input-text.qty");
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By productPrice225 = By.xpath("//span[contains(text(),'$225.00')]");


    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void mouseHoverAndClickOnBags() {
        mouseHoverToElementAndClick(bags);
    }

    public void clickOnOvernightDuffleProductName() {
        clickOnElement(overnightDuffle);
    }

    public String getOvernightDuffleText() {
        return getTextFromElement(overnightDuffleText);
    }

    public void changeQuantity3() {
        clearValueFromTextBox(quantity3);
        sendTextToElement(quantity3, "3");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    public String getProductAddedToShoppingCartText() {
        return getTextFromElement(addedDuffleText);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public String getProductNameOvernightDuffleText() {
        return getTextFromElement(productNameDuffle);
    }

    public String getTextFromTheEnteredQuantity(){
        return driver.findElement(text3).getAttribute("value");
    }

    public String getProductPriceText() {
        return getTextFromElement(price135);
    }

    public void changeQuantity5() {
        clearValueFromTextBox(quantity5);
        sendTextToElement(quantity5, "5");
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);
    }

    public String verifyProductPrice() {
        return getTextFromElement(productPrice225);
    }
}
