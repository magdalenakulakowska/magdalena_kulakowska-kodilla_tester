package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.AbstractPom;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KodillaStorePom extends AbstractPom {

    @FindBy(css = "input[name='search']")
    WebElement searchField;

    public KodillaStorePom (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> search(String searchPhrase) {
        searchField.sendKeys(searchPhrase);
        List<WebElement> items = driver.findElements(By.cssSelector(".element"));

        if (items.isEmpty()) {
            return Collections.emptyList();
        }

        return items;
    }
}
