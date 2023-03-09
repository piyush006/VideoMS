package Autom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Projectcheckout extends Setup{
	
	




@Test(priority=1)
public void checkout() throws InterruptedException {
	

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("broker.crexi@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'View Detail/Change')]")).click();
driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/button[1]")).click();
driver.findElement(By.xpath("//input[@id='auction']")).click();
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("neil");
driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Order Summary')]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/button[1]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
driver.findElement(By.xpath("//button[contains(text(),'Okay, Got it')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/*[1]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
Thread.sleep(4000);
String project1 = driver.findElement(By.cssSelector("div.themed-container.container-fluid div.row div.content-quad.px-4.col div.row div.col-sm-12:nth-child(1) div.row div.col div.management-scroll div.react-bootstrap-table table.table.project-table tbody:nth-child(2) tr:nth-child(1) td:nth-child(1) div.d-flex > strong.text-truncate.d-inline-block.align-middle")).getText();
Thread.sleep(4000);
Assert.assertEquals(project1, project);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/span[1]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();


//return project;


}

/*@Test(priority=1)
public void checkOutSilver() throws InterruptedException {
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("broker.crexi@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'View Detail/Change')]")).click();
driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/button[1]")).click();
driver.findElement(By.xpath("//input[@id='auction']")).click();
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("mathew");
driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Order Summary')]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/button[1]")).click();
String success =driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show div.modal-dialog.modal-dialog-centered div.modal-content div.modal-body div.text-center.px-3.py-3 > h4.py-3:nth-child(2)")).getText();
Assert.assertEquals(success, "Your order summary has been sent to your email.");
driver.findElement(By.xpath("//button[contains(text(),'Okay, Got it')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]/span[1]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
}*/



/*@Test(priority=2)
public void checkOutGold() throws InterruptedException {
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("broker.crexi@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'View Detail/Change')]")).click();
driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='auction']")).click();
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("niel");
driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'Interior Video Contact')]")).click();
driver.findElement(By.xpath("//input[@id='interiorVideoContact.name']")).sendKeys("piyush");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("piyush@mailinator.com");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("7999934710");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='shootDate']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[6]/div[5]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='shootTime']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//li[contains(text(),'3:00 AM')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/button[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/button[1]")).click();
Thread.sleep(2000);
boolean flag =driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show div.modal-dialog.modal-dialog-centered div.modal-content div.modal-body div.text-center.px-3.py-3 > h4.py-3:nth-child(2)")).isDisplayed();
Assert.assertTrue(flag);
driver.findElement(By.xpath("//button[contains(text(),'Okay, Got it')]")).click();	
Thread.sleep(4000);
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]/span[1]")).click();
driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
}

@Test(priority=3)
public void checkOutPlatinum() throws InterruptedException {
String packagename = "PLATINUM";
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("broker.crexi@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
String packagen =driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h6[1]")).getText();
String packagep = packagen.replace(" ", "");


if(!(packagep.equals(packagename))) {
	
	driver.findElement(By.xpath("//button[contains(text(),'View Detail/Change')]")).click();
	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
}
	driver.findElement(By.xpath("//input[@id='auction']")).click();
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sean");
	driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Interior Video Contact')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("interiorVideoContact.name")).click();
//WebElement p	= driver.findElement(By.id("interiorVideoContact.name"));
//p.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
	driver.findElement(By.xpath("//input[@id='interiorVideoContact.name']")).sendKeys(Keys.CONTROL,Keys.chord("A"),Keys.DELETE);
	driver.findElement(By.xpath("//input[@id='interiorVideoContact.name']")).sendKeys("piyush");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.CONTROL,Keys.chord("A"),Keys.DELETE);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("piyush@mailinator.com");
	driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys(Keys.CONTROL,Keys.chord("A"),Keys.DELETE);
	driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("7999934710");
	driver.findElement(By.xpath("//input[@id='shootDate']")).sendKeys(Keys.CONTROL,Keys.chord("A"),Keys.DELETE);
	driver.findElement(By.xpath("//input[@id='shootDate']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[6]/div[5]")).click();
	driver.findElement(By.xpath("//input[@id='shootTime']")).sendKeys(Keys.CONTROL,Keys.chord("A"),Keys.DELETE);
	driver.findElement(By.xpath("//input[@id='shootTime']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//li[contains(text(),'3:00 AM')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/button[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/button[1]")).click();
	boolean flag =driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show div.modal-dialog.modal-dialog-centered div.modal-content div.modal-body div.text-center.px-3.py-3 > h4.py-3:nth-child(2)")).isDisplayed();
	Assert.assertTrue(flag);
	driver.findElement(By.xpath("//button[contains(text(),'Okay, Got it')]")).click();	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]/span[1]")).click();
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();

	
}*/






//@AfterMethod
//public void tearDown() {
	
//driver.quit();
//}

}
