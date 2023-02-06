package Alchemy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.Set;

public class SuiteCRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\BhuvaneswariThangave\\.eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://alchemy.hguy.co/crm");

			//1. Verify the website title
			System.out.println(driver.getTitle());
			String Title = driver.getTitle();
			if (Title.equals("SuiteCRM")) {
			System.out.println("Title Matched");
			}

			//2. Get the url of the header image
			String url = driver.findElement(By.tagName("img")).getAttribute("src");
			System.out.println(url);

			//3. Get the copyright text
			WebElement footer = driver.findElement(By.xpath("//a[@id='admin_options']"));
			System.out.println("Footer :" + footer);
			
			//4. Logging into the site
			driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
			driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
			
			//5. Getting colors
			String color = driver.findElement(By.xpath("//div[@id='toolbar']")).getCssValue("color");
			System.out.println(color);
			
			//6. Menu checking
			List<WebElement> L1 = driver.findElements(By.xpath("//a[@class='dropdown-toggle grouptab']"));
			System.out.println(L1.size());
			for (WebElement x : L1) {
				String Navibar1 = x.getText();
				
				if (Navibar1.equalsIgnoreCase("ACTIVITIES")) {
					System.out.println("Present");
				}
				
			}
			
			//7. Reading additional information
			WebElement sales = driver.findElement(By.id("grouptab_0"));
			sales.click();
			driver.findElement(By.id("moduleTab_9_Leads")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@class='suitepicon suitepicon-action-info']")).click();
			Thread.sleep(5000);
			Set<String> NextWindow = driver.getWindowHandles();
						
			for (String s : NextWindow) {
				
				driver.switchTo().window(s);
				WebElement phone = driver.findElement(By.xpath("//span[@class = 'phone']"));
				System.out.println( "Phone :"+ phone);
						
				}
			
								
	}

}
