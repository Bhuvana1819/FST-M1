import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity7_1
{
    public static void main (String args[])
    {
        WebDriver driver = new FirefoxDriver();
        driver.get ("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of the book is " + driver.getTitle());
        driver.findElement(By.xpath("//input [starts-with(@class, 'username')]")).sendKeys("Bhuvana");
        driver.findElement(By.xpath("//input [contains(@class, 'password')]")).sendKeys("Suresh");
        driver.findElement(By.xpath( "//button [contains(@text(),'Log in'' )]")).click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
    }
}
