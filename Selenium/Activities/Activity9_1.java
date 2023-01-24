import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1
{
    public static void main (String args[])
    {
        WebDriver driver = new FirefoxDriver();
        driver.get ("https://training-support.net/selenium/selects");
        System.out.println("Title of the book is " + driver.getTitle());
        WebElement Chosen = driver.findElement(By.id("single-value"));
        Select dropdown = new Select(Chosen);
        dropdown.selectByVisibleText("Option 1");
        System.out.println(Chosen.getText());
        dropdown.selectByIndex(3);
        System.out.println(Chosen.getText());
        dropdown.selectByValue("4");
        System.out.println(Chosen.getText());
        List<WebElement> options = dropdown.getOptions();
        for(WebElement option : options)
        {
        System.out.println("Option: " + option.getText());

        }


    }
}
