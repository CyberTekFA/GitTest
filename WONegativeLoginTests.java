package com.Test;

import com.Utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WONegativeLoginTests extends BrowserUtils {

    WebElement username;
    WebElement password;

    @BeforeClass
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void test1(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String currentUrl = driver.getCurrentUrl();
        username = driver.findElement(By.id("ctl00_MainContent_username"));
        password = driver.findElement(By.id("ctl00_MainContent_password"));
        username.sendKeys("Test");
        password.sendKeys("Test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Assert.assertEquals("Web Orders Login",driver.getTitle());
        System.out.println("The Title is Still "+driver.getTitle());
    }
    @Test
    public void test2(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String currentUrl = driver.getCurrentUrl();
        username = driver.findElement(By.id("ctl00_MainContent_username"));
        password = driver.findElement(By.id("ctl00_MainContent_password"));
        username.sendKeys("Tester");
        password.sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Assert.assertEquals("Web Orders Login",driver.getTitle());
        System.out.println("The Title is Still "+driver.getTitle());
        verifyTextMatches(currentUrl,driver.getCurrentUrl());
    }

    @Test
    public void test3(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String currentUrl = driver.getCurrentUrl();
        username = driver.findElement(By.id("ctl00_MainContent_username"));
        password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("Test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Assert.assertEquals("Web Orders Login",driver.getTitle());
        System.out.println("The Title is Still "+driver.getTitle());
        verifyTextMatches(currentUrl,driver.getCurrentUrl());
    }
    @Test
    public void test4(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String currentUrl = driver.getCurrentUrl();
        username = driver.findElement(By.id("ctl00_MainContent_username"));
        password = driver.findElement(By.id("ctl00_MainContent_password"));
        username.sendKeys("Test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Assert.assertEquals("Web Orders Login",driver.getTitle());
        System.out.println("The Title is Still "+driver.getTitle());
        verifyTextMatches(currentUrl,driver.getCurrentUrl());
    }

}
