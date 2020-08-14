package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://youtube.com");
        String titleYoutube = driver.getTitle();
        if (titleYoutube.contains("video")){
            System.out.println("Video kelimesini icerir");
        }else{
            System.out.println("Video kelimesini icermez");
        }
        driver.quit();


    }
}
