import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2
{
    public static void main (String args[])
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/");
        System.out.println ("Title is :" + driver.getTitle());
        //Find the About Us link using id()
        WebElement idlocator = driver.findElement(By.id("about-link"));
        System.out.println("ID locator : "+ idlocator.getText());
        WebElement classnamelocator = driver.findElement(By.className("green"));
        System.out.println("Class Name is : " + classnamelocator.getText());
        WebElement linktestlocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Link Text Name is : " + linktestlocator.getText());
        WebElement cssselectorlocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("CSS Name is : " + cssselectorlocator.getText());
        //driver.close();

    }
}
