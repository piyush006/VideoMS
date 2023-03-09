package Autom;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Excel.utility.Xls_Reader;




public class Setup {
	
	
static WebDriver driver;
String project;	
	

	
	

@BeforeMethod()
public void setUpVideomsLogin() {
driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver","C:\\Users\\47Billion\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://videoms-qa.47billion.com/");
driver.manage().window().maximize();
Xls_Reader reader = new Xls_Reader("C:\\Users\\47Billion\\Desktop\\xlsx\\Book2.xlsx");
project =reader.getCellData("test", "project", 2);
System.out.println(project);	    		
}

@AfterMethod
public void tearDown() {
	
driver.quit();
}


}
