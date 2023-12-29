package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Utilites.BaseClass;
import pomclass.Accessories;
import pomclass.Homepage;
import pomclass.MenPage;

public class VerifyMenshoesAddtocart1item_TC_002 extends BaseClass
{
	@Test
	public void TC_Login_002() throws Throwable  {
		System.out.println("Secound Test case");
		
		
		Homepage hp=new Homepage(driver);
		
		hp.getMen().click();
		Thread.sleep(3000L);
		hp.getShoes().click();
		Thread.sleep(3000L);
		
		MenPage MN=new MenPage(driver);
		MN.getHUSHPUPPIESshoesAddToCartButton().click();
		Thread.sleep(2000L);
		MN.getSelectsizeradiobutton().click();
		Thread.sleep(2000L); 
		MN.getAddtocartbutton().click();
		Thread.sleep(3000L);
		MN.getCartbutton().click();
		Thread.sleep(3000L);
		
		driver.navigate().back();
		 
}

	
}
