package com.mdejesus.selenium;

import java.util.List;

public interface SearchContext {
    WebElement findElement(By by);
    List<WebElement> findElements(By by);
}
