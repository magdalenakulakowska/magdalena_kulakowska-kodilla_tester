package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.KodillaLoginPom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStorePomTestSuite {

    KodillaStorePom storePom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }

    @ParameterizedTest
    @CsvSource(value = {"NoteBook,2", "School,1", "Brand,1", "Gaming,1", "Powerful,0"})
    public void testStorePage_CheckSearchedItems(String searchPhrase, int expected) {
        List<WebElement> items = storePom.search(searchPhrase);

        assertEquals(expected, items.size());
    }

    @ParameterizedTest
    @CsvSource(value = {"NoTeBoOk,2", "school,1", "bRand,1", "GaminG,1", "PoWeRful,0"})
    public void testStorePage_CheckCaseSensitivity(String searchPhrase, int expected) {
        List<WebElement> items = storePom.search(searchPhrase);

        assertEquals(expected, items.size());
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}