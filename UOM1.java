package MyProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;


public class UOM1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yehasha.hettiarachch\\Desktop\\New folder (3)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mrt.ac.lk/web/");
		driver.manage().window().maximize();
		
		 Select selectByValue = new Select(driver.findElement(By.id("lang-dropdown-select-lang_dropdown_form5c3c1bdb7093c5.91364949")));
		 selectByValue.selectByValue("ta-lk");
		 
		 driver.navigate().back();
		 
		 String expectedTitle = "Articles | University of Moratuwa";

		driver.findElement(By.id("main-menu-link-contentf759e6f5-6af5-4a1d-8bd9-4e17ebfeb1f8")).click();
			 
		String actualTitle = driver.getTitle();

		
		System.out.println(actualTitle);
		 
	    if (expectedTitle.equals(actualTitle)) {
	    	
	    	System.out.println("Validated");
	    }else {
	    	System.out.println("not Validated");
	    }
	    
	    WebElement Search =driver.findElement(By.id("edit-submit"));
	    
	    if(Search.isEnabled()) {
	    	
	    	Search.sendKeys("Courses");
	    	Search.click();
	    }else {
	    	
	    	System.out.println("Search button is not enabled");
	    }
		
	    driver.findElement(By.cssSelector("a[title=\"Home\"]")).click();					
	    
	    String Actual1 = driver.getTitle();
	
	    
	    String Expected1 = "Welcome to University of Moratuwa | University of Moratuwa";
	    
	    if(Actual1.equals(Expected1)) {
	    	
	    	System.out.println("Image is perfectly running");
	    }else {
	    	
	    	System.out.println("Image is not perfectly running");
	    }
	    
	    
		}
}
