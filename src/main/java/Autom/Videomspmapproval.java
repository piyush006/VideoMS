package Autom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Videomspmapproval extends Setup {
	

	
	

	
//String project;







	
	


@Test(priority=16)
public void approveVideo() throws InterruptedException {

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pm.vms47@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/button[1]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(project);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[4]/a[1]/div[1]/div[1]/span[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/button[1]/i[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
Thread.sleep(2000);
String getreview = driver.findElement(By.xpath("//button[contains(text(),'Get Review Link')]")).getText();
Assert.assertEquals(getreview, "Get Review Link");
driver.findElement(By.xpath("//button[contains(text(),'Get Review Link')]")).click();
String link = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")).getText();
System.out.println(link);
}




@AfterMethod
public void tearDown() {
	
driver.quit();
}

}



