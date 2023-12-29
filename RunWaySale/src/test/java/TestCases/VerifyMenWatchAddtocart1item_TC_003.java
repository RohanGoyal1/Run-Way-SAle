package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Utilites.BaseClass;
import pomclass.Accessories;
import pomclass.Homepage;
import pomclass.MenPage;

public class VerifyMenWatchAddtocart1item_TC_003 extends BaseClass
{

	@Test
	public void TC_Login_003() throws Throwable  {
		System.out.println("Third Test case");
		
		
		Homepage hp=new Homepage(driver);
		
		hp.getMen().click();
		Thread.sleep(3000L);
		hp.getAccessoriesbutton().click();
		Thread.sleep(3000L);
	
		Accessories AS=new Accessories(driver);
		Thread.sleep(2000L);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("scrollBy(0,500);");
				AS.getEMPORIOAddToCartButton().click();
	
		MenPage MN=new MenPage(driver);
		Thread.sleep(1000L); 
		MN.getAddtocartbutton().click();
		Thread.sleep(1000L);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scrollBy(0,0);");
		Thread.sleep(2000L);
			MN.getCartbutton().click();
	Thread.sleep(3000L);
		driver.navigate().back();
		 
}
	
}
