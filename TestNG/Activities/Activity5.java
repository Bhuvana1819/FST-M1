package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5
{
    WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test(groups = {"HeaderTests","ButtonTests"})
    public void pageTitle()
    {
        System.out.println("Title : " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Target Practice");
    }
    @Test(dependsOnMethods={"pageTitle"},groups = {"HeaderTests"})
    public void HeaderTest1()
    {
        WebElement h3tag = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(h3tag.getText(),"Third header");
    }

    @Test(dependsOnMethods={"pageTitle"},groups={"HeaderTests"})
    public void HeaderTest2()
    {
        WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
    }

    @Test(dependsOnMethods={"pageTitle"},groups={"ButtonTests"})
    public void buttonTest1()
    {
        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(button1.getText(), "Olive");
    }

    @Test(dependsOnMethods={"pageTitle"},groups={"ButtonTests"})
    public void buttonTest2()
    {
        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod()
    {
        driver.quit();
    }
}
