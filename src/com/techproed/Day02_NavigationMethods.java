package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {


    public static void main(String[] args) {
        // Java projemize, chromedriver'ı tanıttık.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        // ekrani kaplama

// driver'a google.com'a gitmesini söyledik.
        webDriver.get("http://google.com");
// get methodu ile aynı işlemi yapıyor
        webDriver.navigate().to("http://amazon.com");
// navigate().back() methodu bir önceki sayfaya geri dönmeye yarıyor.
        webDriver.navigate().back();
// navigate().forward() methodu geri geldiğimiz sayfaya gitmemizi sağlıyor
// örnek : google -> amazona gittik -> amazondan google'a geri geldik
// eğer forward yaparsak, amazona geri gideriz.
        webDriver.navigate().forward();
        // navigate().refresh() methodu sayfayı yenilemeye yarıyor.
        webDriver.navigate().refresh();


    }
}