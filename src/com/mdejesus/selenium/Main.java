package com.mdejesus.selenium;

import com.mdejesus.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        WebElement element = driver.findElement(new By());

        element.click();
    }
}

