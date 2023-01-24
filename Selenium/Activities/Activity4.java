import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4
{
    public static void main (String args[])
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/");
        System.out.println("Title of this website is : " + driver.getTitle());
        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
        System.out.println("Title of this website is : " + driver.getTitle());
        //driver.quit();


    }
}
