import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity8_1
{
    public static void main (String args[])
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        System.out.println("Title of the book is " + driver.getTitle());
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
        List<WebElement> rows = driver.findElements(By.xpath ("//table[contains(@class,'striped')]/tbody/tr"));
        System.out.println("Column Size : " + cols.size());
        System.out.println("Row Size : " + rows.size());
        List<WebElement> thirdrow = driver.findElements(By.xpath ("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
        for ( WebElement cellValue  : thirdrow )
        {
            System.out.println("Third Row Value : " + cellValue.getText());
        }
        //WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/tr[2]"));
        WebElement secondrow2value = driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/tr[2]"));
       System.out.println("Second row - Second Value : " + secondrow2value.getText() );

    }
}