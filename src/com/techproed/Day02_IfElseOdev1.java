package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElseOdev1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        String sayfaBasligi = driver.getTitle();

        System.out.println(sayfaBasligi);
    if (sayfaBasligi.contains("Car")){
        System.out.println("Car kelimesini icerir");
    }else{
        System.out.println("Car kelimesini icermez");
    }
    driver.quit();
    }
}
