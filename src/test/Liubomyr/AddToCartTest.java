package Liubomyr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddToCartTest {

    @Test
    public void testAddToCartTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://taqc-opencart.epizy.com/");
        driver.findElement(By.cssSelector("[href*='account']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();

        //
        driver.findElement(By.xpath("//*[@id='input-email']")).click();
        driver.findElement(By.xpath("//*[@id='input-email']")).clear();
        driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("Liubomyr@gmail.com");
        //
        driver.findElement(By.cssSelector("input.form-control[type='password']")).click();
        driver.findElement(By.cssSelector("input.form-control[type='password']")).clear();
        driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys("qwerty");
        //
        driver.findElement(By.xpath("//*[@value='Login']")).click();
        //
        driver.findElement(By.cssSelector("[href*= 'category&path=18']")).click();
        driver.findElement(By.cssSelector("[href*= 'category&path=18_45']")).click();
        driver.findElement(By.cssSelector("[href*= 'product&path=18_45&product_id=47']")).click();
        driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg.btn-block")).click();
        //
        driver.findElement(By.cssSelector("[href*= 'checkout/cart']" + "[title*='Shopping Cart']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[action *= 'checkout/cart/edit'] .text-left a[href*='product']")).getText().equals("HP LP3065"));
    }


}
