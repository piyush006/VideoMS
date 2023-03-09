package Autom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;


public class Videomspmportal extends Setup {
	
//String project;
	
/*@BeforeMethod
public void PMloginsetup() {
	
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://videoms-qa.47billion.com/");
	driver.manage().window().maximize();
	}*/




	
	
	
	





@Test(priority=2)
public  void VerifyNameinProjectList() throws InterruptedException {
	
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pm.vms47@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

String projectname1 = driver.findElement(By.xpath("//h5[contains(text(),'"+project+"')]")).getText();
Assert.assertEquals(projectname1, project);	




	
	
}

@Test(priority=3)
public  void verifyProjectinassets(){

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pm.vms47@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/button[1]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(project);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
String projectname2 = driver.findElement(By.xpath("//h6[contains(text(),'"+project+"')]")).getText();
Assert.assertEquals(projectname2, project);



}



@Test(priority=4)
public void inviteEditor() throws InterruptedException{
	

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pm.vms47@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");	
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/button[1]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(project);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//tbody/tr/td[3]/button[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='videoCreation']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='Invite External Editor']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("piyush");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("piyush.soni@47billion.com");
driver.findElement(By.xpath("//input[@id='projectStartDate']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@aria-label='Choose Friday, December 30th, 2022']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='projectCompleteDate']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@aria-label='Choose Friday, December 30th, 2022']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='Send Invite']")).click();
Thread.sleep(5000);
}
@Test(priority=5)

public void invitepilot() throws InterruptedException {
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pm.vms47@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");	
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/button[1]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(project);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();	
Thread.sleep(2000);
driver.findElement(By.xpath("//tbody/tr[1]/td[4]/button[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Piyush Soni");
driver.findElement(By.xpath("//input[@id='exampleEmail']")).sendKeys("testh@mailinator.com");
driver.findElement(By.xpath("//button[contains(text(),'Send Invite')]")).click();
Thread.sleep(5000);

}


@Test(priority=6)

public void pilotAlreadyExitcheck() throws InterruptedException {
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pm.vms47@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");	
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/button[1]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(project);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();	
driver.findElement(By.xpath("//tbody/tr[1]/td[4]/button[1]")).click();
Thread.sleep(2000);
String pexit = driver.findElement(By.xpath("//h5[contains(text(),'Pilot Invite Exist')]")).getText();
Assert.assertEquals(pexit, "Pilot Invite Exist");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
Thread.sleep(2000);
}

//@AfterMethod
//public void tearDown() {
	
//driver.quit();
//}







}
