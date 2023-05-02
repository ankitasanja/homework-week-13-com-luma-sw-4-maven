package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenTestPage extends Utility {

    By menMenu = By.xpath("//a[@id='ui-id-5']");
    By bottomsMenu = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pantsMenu = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By productsName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By productsSize = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By productColor = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By addToCartButton = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
    By cronusYogaPantText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By textShoppingCart = By.xpath("//span[@class='base']");
    By yogaPantProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("//dd[contains(text(),'32')]");
    By blackColorProduct = By.xpath("//dd[contains(text(),'Black')]");

    public void mouseHoverOnMenMenuTab() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottomsMenuTab() {
        mouseHoverToElement(bottomsMenu);
    }

    public void clickOnPants() {
        mouseHoverToElementAndClick(pantsMenu);
    }

    public void mouseHoverOnProductsName() {
        mouseHoverToElement(productsName);
    }

    public void clickOnProductSize() {
        mouseHoverToElementAndClick(productsSize);
    }

    public void clickOnProductColor() {
        mouseHoverToElementAndClick(productColor);
    }

    public void clickOnAddToCart() {
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getCronasYogaPantAddedText() {
        return getTextFromElement(cronusYogaPantText);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);
    }

    public String getShoppingCartText() {
        return getTextFromElement(textShoppingCart);
    }

    public String getCronusYogaPantText() {
        return getTextFromElement(yogaPantProductName);
    }

    public String getProductSize32Text() {
        return getTextFromElement(size32);
    }

    public String getBlackColorProductText() {
        return getTextFromElement(blackColorProduct);
    }


}
