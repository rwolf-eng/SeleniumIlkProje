package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        String sayfaBasligi = driver.getTitle();  // Car
// contains methodu, bir yazının içerisinde bir kelime grubunun geçip geçmediğini kontrol eder.
        if(sayfaBasligi.toLowerCase().contains("books")){
            System.out.println("books kelimesi geçiyor : " + sayfaBasligi);
        }else{
            System.out.println("books kelimesi geçmiyor." + sayfaBasligi);
              }
        driver.quit();
    }
}
