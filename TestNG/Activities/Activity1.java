package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1
{
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }
    @Test
    public void exampleTestcase()
    {
        System.out.println("Title of the book is : " + driver.getTitle());
        Assert.assertEquals("Training Support" , driver.getTitle());
        driver.findElement(By.id("about-link")).click();
        System.out.println("Title of the book is : " + driver.getTitle());
        Assert.assertEquals("About Training Support" , driver.getTitle());
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}
