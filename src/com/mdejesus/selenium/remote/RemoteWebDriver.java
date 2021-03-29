package com.mdejesus.selenium.remote;

import com.mdejesus.selenium.By;
import com.mdejesus.selenium.WebDriver;
import com.mdejesus.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class RemoteWebDriver implements WebDriver {
    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public void get() {

    }

    @Override
    public String getPageSource() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public Set<String> getWindowHandles() {
        return null;
    }

    @Override
    public void quit() {

    }
}
