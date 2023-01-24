import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2
{
    public static void main (String args[])
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of the book is " + driver.getTitle());
        driver.findElement(By.xpath("//input[contains (@class,'Username')]")).sendKeys("Venba");
        driver.findElement(By.xpath("//input[contains (@class,'Password')]")).sendKeys("Dhamini");
        driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input")).sendKeys("Dhamini");
        driver.findElement(By.xpath("//label[text()='Email']/following::input")).sendKeys("bhuvana@gmail.com");
        driver.findElement(By.xpath("//button [text() = 'Sign Up']")).click();
        String finalText = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login Message : " + finalText);



    }
}
