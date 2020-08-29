package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Ders_2 {
    public static void main(String[] args) {
//webDriversetproperty nin yerine kullaniyoruz.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        WebElement email =driver.findElement(By.id("email"));
        email.sendKeys("esay25@hotmail.com");
       WebElement sifre =driver.findElement(By.name("pass"));
       sifre.sendKeys("2656"+ Keys.ENTER);
        driver.get("https://www.facebook.com");
        driver.navigate().to("http://amazon.com");
        driver.quit();



    }
}
