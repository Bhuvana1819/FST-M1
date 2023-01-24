package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2
{
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
    public void testcase1()
    {
        System.out.println("Title of the book is : " + driver.getTitle());
        Assert.assertEquals("Target Practice" , driver.getTitle());

    }
    @Test
    public void testcase2()
    {
        WebElement black = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(black.isDisplayed()) ;
        Assert.assertEquals(black.getText(), "black");
    }
    @Test
    public void testcase3()
    {
        String T3 = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(T3.contains("Practice"));

    }
    @Test (enabled = false)
    public void testcase4()
    {
        throw new SkipException("Skipping");
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}
