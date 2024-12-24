package com.seleniumwithmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestRun{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.tgsrtc.telangana.gov.in/");
        driver.findElement(By.xpath("(//img[@class='img-fluid'])[2]")).click();
       // driver.findElement(By.xpath("//class[text()='About Us']")).click();
        driver.close();

    }
}
