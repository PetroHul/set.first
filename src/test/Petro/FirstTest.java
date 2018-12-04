package Petro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class FirstTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://taqc-opencart.epizy.com");
//        driver.get("http://localhost/3.0.2.0-OpenCart/upload/index.php");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        //driver.findElement(By.xpath());
    }

    @Test
    public void tesChangePassword() {

//        driver.get("http://taqc-opencart.epizy.com");
//        driver.get("http://localhost/3.0.2.0-OpenCart/upload/index.php");
        boolean flag = true;

        //arenge

        //act

        //assert

        /* Click login */
        driver.findElement(By.cssSelector("i.fa.fa-user")).click();
        driver.findElement(By.cssSelector(".dropdown-menu.dropdown-menu-right > li > a[href*='index.php?route=account/login']")).click();
        /* Write e-mail */
        driver.findElement(By.cssSelector("input[type='text'][name='email'].form-control")).click();
        driver.findElement(By.cssSelector("input[type='text'][name='email'].form-control")).clear();
        driver.findElement(By.cssSelector("input[type='text'][name='email'].form-control")).sendKeys("barzoom5@gmail.com");
        /* Write password */
        driver.findElement(By.cssSelector("input[type='password'][name='password'].form-control")).click();
        driver.findElement(By.cssSelector("input[type='password'][name='password'].form-control")).clear();
        driver.findElement(By.cssSelector("input[type='password'][name='password'].form-control")).sendKeys("529440");
        /* Click 'Login'*/
        driver.findElement(By.cssSelector("input[type='submit'][value='Login'].btn.btn-primary")).click();
        /*  Change your password */
        driver.findElement(By.cssSelector("div.col-sm-9 > ul > li > a[href*='index.php?route=account/password']")).click();
        /* Change Password page */
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='password'][placeholder='Password'].form-control")).click();
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='password'][placeholder='Password'].form-control")).clear();
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='password'][placeholder='Password'].form-control")).sendKeys("268405");
        /* Password confirm */
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='confirm'][placeholder='Password Confirm'].form-control")).click();
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='confirm'][placeholder='Password Confirm'].form-control")).clear();
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='confirm'][placeholder='Password Confirm'].form-control")).sendKeys("268405");
        driver.findElement(By.cssSelector("input.btn.btn-primary[value='Continue']")).click();
        /* Check message */
        String actual = driver.findElement(By.cssSelector("div.alert.alert-success")).getText();
        System.out.println("Actual1=" + actual);
        String expected = "Success: Your password has been successfully updated.";
        assertEquals(actual,expected);
        /* Logout */
        driver.findElement(By.cssSelector("div.list-group > a[href*='index.php?route=account/logout']")).click();

        /* Part #2*/
        /* Click login #2*/
        driver.findElement(By.cssSelector("div.list-group > a[href*='index.php?route=account/login']")).click();
        /* Write e-mail #2*/
        driver.findElement(By.cssSelector("input[type='text'][name='email'].form-control")).click();
        driver.findElement(By.cssSelector("input[type='text'][name='email'].form-control")).clear();
        driver.findElement(By.cssSelector("input[type='text'][name='email'].form-control")).sendKeys("barzoom5@gmail.com");
        /* Write password #2*/
        driver.findElement(By.cssSelector("input[type='password'][name='password'].form-control")).click();
        driver.findElement(By.cssSelector("input[type='password'][name='password'].form-control")).clear();
        driver.findElement(By.cssSelector("input[type='password'][name='password'].form-control")).sendKeys("268405");
        /* Click 'Login' #2*/
        driver.findElement(By.cssSelector("input[type='submit'][value='Login'].btn.btn-primary")).click();


        driver.findElement(By.cssSelector("div.col-sm-9 > ul > li > a[href*='index.php?route=account/password']")).click();
        /* Change Password page #2*/
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='password'][placeholder='Password'].form-control")).click();
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='password'][placeholder='Password'].form-control")).clear();
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='password'][placeholder='Password'].form-control")).sendKeys("529440");
        /* Password confirm #2*/
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='confirm'][placeholder='Password Confirm'].form-control")).click();
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='confirm'][placeholder='Password Confirm'].form-control")).clear();
        driver.findElement(By.cssSelector("div.col-sm-10 > input[name='confirm'][placeholder='Password Confirm'].form-control")).sendKeys("529440");
        driver.findElement(By.cssSelector("input.btn.btn-primary[value='Continue']")).click();
        /* Logout #2*/
        driver.findElement(By.cssSelector("div.list-group > a[href*='index.php?route=account/logout']")).click();
        /* Go to home page*/
        driver.findElement(By.cssSelector("div.buttons > div.pull-right > a[href*='index.php?route=common/home']")).click();
        //assertTrue(flag);
    }
}