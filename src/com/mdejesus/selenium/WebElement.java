package com.mdejesus.selenium;

public interface WebElement extends SearchContext{
    void clear();
    void click();
    String getAttribute(String name);
    String getCssValue(String propertyName);
    String getTagName();
    String getText();
    boolean isDisplayed();
    boolean isEnabled();
    boolean isSelected();
    void sendKeys(CharSequence... keysToSend);
    void submit();
}

