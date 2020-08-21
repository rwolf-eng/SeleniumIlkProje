package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com");
        // xpath kullanımında, attribute kullanmaya gerek duymazsanız,
// sadece tagName yazılarakta webelement bulunabilir.
        WebElement welcomeYazisi = driver.findElement(By.xpath("//h1"));
        System.out.println(welcomeYazisi.getText());
        //input[@type='email'] -> tagName input olan, attribute olarak type='email'
//*[@type='email'] -> tagName ne olursa olsun, attribute olrk type='email'
       // type='email' e sahip tüm webelementleri bulur.
//*[.='Sign up'] -> içerdiği yazı Sign up olan tüm webelementleri bulur.
//*[(text()='Sign up')] -> üsttekinin aynısı
//div[.='Sign up'] -> içerdiği yazı Sign up olan ve tagnamei "div" tüm webelementleri bulur.
//*[contains(text(),'ign')]  -> içerisinde "ign" geçen tüm elementleri bulur. (örnek : Sign in ya da Sign out' u bulabilir.)




    }
}
