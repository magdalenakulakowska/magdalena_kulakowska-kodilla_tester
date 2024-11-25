package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppWithCssSelector {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");

        WebElement categoryCombo = driver.findElement(By.id("gh-cat"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(9);
        WebElement searchField = driver.findElement(By.id("gh-ac"));
        searchField.sendKeys("Mavic mini");
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("s-item")));
        List<WebElement> itemCards = driver.findElements(By.className("s-item"));
        itemCards.forEach(item -> System.out.println(item.getText()));
    }
}
