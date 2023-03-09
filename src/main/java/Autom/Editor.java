package Autom;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Editor extends Setup{
	
	
//String project;


	
	

	


	

@Test(priority=12)
public void verifyActiveProject() throws InterruptedException {
	
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("piyush.soni@47billion.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Pirat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
Thread.sleep(1000);
String project1=driver.findElement(By.xpath("//h5[contains(text(),'"+project+"')]")).getText();
Assert.assertEquals(project1, project);

}

@Test(priority=13)
public void acceptInvitation() throws InterruptedException {
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("piyush.soni@47billion.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Pirat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
Thread.sleep(3000);
driver.findElement(By.xpath("//h5[contains(text(),'"+project+"')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(text(),'Accept Project')]")).click();

}



@Test(priority=14)

public void projectInAssset() throws InterruptedException {

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("piyush.soni@47billion.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Pirat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
driver.findElement(By.cssSelector("#project-asset-toggler")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div[2]/div[3]/ul/div/div/div[1]/input")).sendKeys(project);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
String project2 =driver.findElement(By.xpath("//h6[contains(text(),'"+project+"')]")).getText();
System.out.println(project2);
Assert.assertEquals(project2, project);

}


@Test(priority=15)
public void uploadVideo() throws InterruptedException {

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("piyush.soni@47billion.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Pirat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
driver.findElement(By.cssSelector("#project-asset-toggler")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/div[2]/div[3]/ul/div/div/div[1]/input")).sendKeys(project);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[4]/a[1]/div[1]/div[1]/span[1]")).click();	
driver.findElement(By.xpath("//button[contains(text(),'Upload')]")).click();
driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("C:\\Users\\47Billion\\Desktop\\Sample Image\\ZX-86 Highway 15 and County Rd,Greenville,WI_Video Drafts_Draft-1_asset_1.mp4");
Thread.sleep(19000);	
}




@AfterMethod
public void tearDown() {
	
driver.quit();
}

}




