package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingAppWithXpath {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@id=\"gh-cat-box\"]/select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(9);
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"gh-ac-box2\"]/input"));
        searchField.sendKeys("Mavic mini");
        WebElement searchButton = driver.findElement(By.xpath("//*[contains(@class, \"gh-sch-btn\")]/input"));
        searchButton.click();
    }
}
