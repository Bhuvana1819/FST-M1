 package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6
{
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod()
    {
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/login-form");
    }
    @Test
    @Parameters ({"username","password"})
    public void testcase(String username, String Password)
    {
        driver.findElement(By.id("username")).sendKeys("username");
        driver.findElement(By.id("password")).sendKeys("password ");
        driver.findElement(By.xpath("//button [text()='Log in']")).click();
        Assert.assertEquals(driver.findElement(By.id("action-confirmation")).getText(),"Welcome Back, admin");

    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }

}
