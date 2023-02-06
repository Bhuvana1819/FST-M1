package Alchemy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Job_Board {

	public static void main(String[] args) throws InterruptedException {
		
		// 

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\BhuvaneswariThangave\\.eclipse\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://alchemy.hguy.co/jobs/");
		String Title = driver.getTitle();
		System.out.println("Title:"+Title);
		//1. Verify the website title			
				
			if (Title.equals("Alchemy Jobs – Job Board Application")) {
				System.out.println("Matching");
				
			} else {
				System.out.println("Not Matching:");

			}
		
			//driver.close();
			//2. Verify the website heading
		
			String Heading = driver.findElement(By.className("entry-title")).getText();
			
			if (Heading.equals("Welcome to Alchemy Jobs")) {
				
				System.out.println("Heading Matched");
				
			}
			
			System.out.println(driver.getCurrentUrl());
			
			//3. Get the url of the header image
			String img = driver.findElement(By.tagName("img")).getAttribute("src");
			System.out.println("imgurl" + img);
			
			//4. Verify the website’s second heading
			
			String SecondHeading = driver.findElement(By.tagName("h2")).getText();
			System.out.println("SecondHeading :" + SecondHeading);
			
			if (SecondHeading.equals("Quia quis non")) {
				System.out.println("Second Heading Matched");
				
			}
			//5. Navigate to another page
			driver.findElement(By.linkText("Jobs")).click();
			String url = driver.getCurrentUrl();
			System.out.println(url);
			if (url.equals("https://alchemy.hguy.co/jobs/jobs/")) {
			
			System.out.println("Jobs Url Matching");	
			}
			//6. Apply to a job
			driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("Bank");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//h3[contains(text(),'BankingTester2')")).click();
			driver.findElement(By.tagName("h3")).click();
			driver.findElement(By.xpath("//input[@value='Apply for job']")).click();	
			String Mailid = driver.findElement(By.className("job_application_email")).getText();
			System.out.println(Mailid);
			
			//Create a new job listing
			driver.findElement(By.linkText("Post a Job")).click();
			
			
			
			
			
	}

}
