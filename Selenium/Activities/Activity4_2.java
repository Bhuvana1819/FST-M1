import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2
{
    public static void main (String args[])
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title of this website is : " + driver.getTitle());

        driver.findElement(By.xpath("//input[@id = 'firstName']")).sendKeys("Bhuvana");
        driver.findElement(By.xpath("//input [@id = 'lastName']")).sendKeys("Suresh");
        driver.findElement(By.xpath("//input [@id = 'email']")).sendKeys("bhuvana@gmail.com");
        driver.findElement(By.xpath("//input [@id = 'number']")).sendKeys("9876543291");
        driver.findElement(By.xpath("//input [contains(@class , 'green')]")).click();

        //driver.quit();


    }
}
