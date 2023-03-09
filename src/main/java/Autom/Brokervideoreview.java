package Autom;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Brokervideoreview extends Setup{
	
//String project;

	
	
	





@Test(priority=17)
public void verifylink() throws InterruptedException {

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("broker.crexi@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
Thread.sleep(28000);
driver.findElement(By.xpath("//strong[contains(text(),'"+project+"')]")).click();
Thread.sleep(2000);
String link2 = driver.findElement(By.xpath("//table[@id='Aerial_Maps_-_Version_1']/tbody/tr/td[2]/span/a")).getText();
Thread.sleep(2000);
System.out.println(link2);
}

@Test(priority=18)
public void addCommentOnVideo() throws InterruptedException {
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("broker.crexi@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//strong[contains(text(),'"+project+"')]")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("//table[@id='Aerial_Maps_-_Version_1']/tbody/tr/td[2]/span/a")).click();
Thread.sleep(4000);	
ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
//switch to active tab
driver.switchTo().window(wid.get(1));
Thread.sleep(4000);	
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/button[1]/*[1]")).click();
Thread.sleep(9000);	
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/input[1]")).sendKeys("Automation test comment");
Thread.sleep(2000);	
driver.findElement(By.xpath("//button[contains(text(),'Comment')]")).click();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("broker.crexi@gmail.com");
Thread.sleep(2000);	
driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
Thread.sleep(4000);	
}



@AfterMethod
public void tearDown() {
	
driver.quit();
}


}

