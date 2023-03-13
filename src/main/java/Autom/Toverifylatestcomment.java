package Autom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Toverifylatestcomment extends Setup{
	
	@Test(priority=24)
	public void vefiryPilotDetailsLatestcomment() throws InterruptedException {
		
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testh@mailinator.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Virat");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();		
	Thread.sleep(2000);
	driver.findElement(By.xpath("//header/nav[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[contains(text(),'"+project+"')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'Videos')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/button[1]")).click();
	Thread.sleep(1000);
	WebElement notes = driver.findElement(By.xpath("//input[@id='noteText']"));
	notes.sendKeys("Latest comment added by pilot\n");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='close']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'Project Detail')]")).click();
	Thread.sleep(1000);
	String latest = driver.findElement(By.cssSelector("div.pilot-main-wrapper div.container-fluid div.row div.tab-content.px-md-3 div.tab-pane.active:nth-child(1) div.row div.col-sm-8 div.mt-4.border-radius-8px.border-0.shadow.card.card-body:nth-child(3) div.card-body div.row div:nth-child(1) div.col-sm-12 div:nth-child(1) > p:nth-child(3)")).getText();
	Assert.assertEquals(latest, "Latest comment added by pilot");
	}	
		
		

	@Test(priority=25)

	public void verifyLatestCommentPM() {
		
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pm.vms47@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

	driver.findElement(By.xpath("//h5[contains(text(),'"+project+"')]")).click();
	String latest =driver.findElement(By.xpath("//p[text()='Latest comment added by pilot']")).getText();
	Assert.assertEquals(latest, "Latest comment added by pilot");
		
	}
		

	@Test(priority=26)	
	public void VerifyLatestCommentAddedByPM() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pm.vms47@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SK47Bill@n");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//h5[contains(text(),'"+project+"')]")).click();	
	driver.findElement(By.xpath("//input[@id='noteText']")).sendKeys("Latest comment added by pm");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();
	String latest =driver.findElement(By.xpath("//p[text()='Latest comment added by pm']")).getText();
	Assert.assertEquals(latest, "Latest comment added by pm");
	}

	@Test(priority=27)

	public void VerifyPMcommentONPilotPortal() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testh@mailinator.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Virat");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();		
	Thread.sleep(2000);
	driver.findElement(By.xpath("//header/nav[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[contains(text(),'"+project+"')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'Project Detail')]")).click();
	String latest =driver.findElement(By.cssSelector("div.pilot-main-wrapper div.container-fluid div.row div.tab-content.px-md-3 div.tab-pane.active:nth-child(1) div.row div.col-sm-8 div.mt-4.border-radius-8px.border-0.shadow.card.card-body:nth-child(3) div.card-body div.row div:nth-child(1) div.col-sm-12 div:nth-child(1) > p:nth-child(3)")).getText();
	Assert.assertEquals(latest, "Latest comment added by pm");
	}	

	

}


