package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsGiris {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("http://a.testaddressbook.com/");
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver1.manage().window().maximize();
        driver1.get("http://a.testaddressbook.com/");
        WebElement signInLink = driver1.findElement(By.id("sign-in"));
        signInLink.click();
        WebElement emailKutusu = driver1.findElement(By.className("form-control"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        WebElement sifreKutusu = driver1.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");
        WebElement signInButonu = driver1.findElement(By.name("commit"));
        signInButonu.click();





    }


}
