package com.mdejesus.selenium;

import java.util.Set;

public interface WebDriver extends SearchContext{
    void close();
    void get();
    String getCurrentUrl();
    String getPageSource();
    String getTitle();
    String getWindowHandle();
    Set<String> getWindowHandles();
    void quit();
}
