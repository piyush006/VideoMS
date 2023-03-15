package Autom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class pilot extends Setup {
	
	//String project;

	


	
	
	






@Test(priority=7)

public void verifyProjectInvitation() throws InterruptedException {

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testh@mailinator.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Virat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
Thread.sleep(2000);
driver.findElement(By.xpath("//header/nav[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
String project1 =driver.findElement(By.xpath("//span[contains(text(),'"+project+"')]")).getText();
Assert.assertEquals(project1, project);
System.out.println(project1);
	
}


@Test(priority=8)

public void verifynewprojectlabel() throws InterruptedException {
	
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testh@mailinator.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Virat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();		
Thread.sleep(2000);
driver.findElement(By.xpath("//header/nav[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
Thread.sleep(2000);
String newinvite = driver.findElement(By.xpath("//span[contains(text(),'New invite')]")).getText();
Assert.assertEquals(newinvite, "New invite");

}

@Test(priority=9)
public void acceptProjectInvitation() throws InterruptedException {
	
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testh@mailinator.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Virat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();		
Thread.sleep(2000);
driver.findElement(By.xpath("//header/nav[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'"+project+"')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(text(),'Accept Project')]")).click();
	
}


@Test(priority=10)
public void addPilotNotes() throws InterruptedException {
	
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testh@mailinator.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Virat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();		
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Videos')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/button[1]")).click();
for(int i=1;i<=10;i++) {
WebElement notes = driver.findElement(By.xpath("//input[@id='noteText']"));
notes.sendKeys("Test notest added by test user \n");
}
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='close']")).click();
}



@Test(priority=11)
public void testpilotfileupload() throws InterruptedException {
		
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testh@mailinator.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Virat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Videos')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/button[1]")).click();
driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("C:\\Users\\47Billion\\Desktop\\Sample Image\\ZX-86 Highway 15 and County Rd,Greenville,WI_Video Drafts_Draft-1_asset_1.mp4");
Thread.sleep(25000);
}

/*@Test(priority=7)
public void testpilotcustomfileupload() throws InterruptedException {
	
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testh@mailinator.com");

driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Virat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Custom Shots / B-Roll')]")).click();

driver.findElement(By.xpath("//button[contains(text(),'Upload')]")).click();
for(int i=1;i<=10;i++) {
driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("C:\\Users\\47Billion\\Desktop\\GoToWebinar 014.png");
Thread.sleep(3000);*/





/*pilot() throws InterruptedException{
setUpVideomsLogin();		
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testh@mailinator.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Virat");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
Thread.sleep(2000);
project = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h5[1]")).getText();
Thread.sleep(1000);
driver.findElement(By.xpath("//header/nav[1]/div[3]/div[1]/div[1]/a[1]/img[1]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//header/nav[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[2]")).click();
System.out.println(project.length());	
	
	
	
}*/

@AfterMethod
public void tearDown() {
	
driver.quit();
}



}


