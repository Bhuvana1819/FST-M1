import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3
{
    public static void main (String args[])
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title of this website is : " + driver.getTitle());
        WebElement firstname = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        firstname.sendKeys("Bhuvana");
        lastname.sendKeys("Suresh");
        driver.findElement(By.id("email")).sendKeys("bhuvana@gmail.com");
        driver.findElement(By.id("number")).sendKeys("1234567789");
        driver.findElement(By.cssSelector(".ui.green.button")).click(); //why cssSelector?
        //driver.quit();


    }
}
