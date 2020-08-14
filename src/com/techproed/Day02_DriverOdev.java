package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
// 1 - ilk önce google.com'a gidelim.
        driver.get("http://google.com");
// 2 - sayfanın title'ını alalım ve ekrana yazdıralım.
        String titleGoogle = driver.getTitle();
        System.out.println(titleGoogle);
// 3 - daha sonra youtube.com'a gidelim.
        driver.navigate().to("http://youtube.com");
// 4 - sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
        String titleYoutube = driver.getTitle();
        String urlYoutube = driver.getCurrentUrl();
        System.out.println(titleYoutube);
        System.out.println(urlYoutube);
// 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
        driver.navigate().back();
        String urlGoogle = driver.getCurrentUrl();
        System.out.println(urlGoogle);
// 6 - driver'ımızı kapatalım.
        driver.quit();
    }
}
