package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accessories {
	public WebDriver driver;
	public Accessories(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//div[@data-cy='add-to-cart']")
	private WebElement EMPORIOAddToCartButton;
	
	
	public WebElement getEMPORIOAddToCartButton() {
		return EMPORIOAddToCartButton;
	}
	
//	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div")
//	private WebElement Selectsizeradiobutton;
	
//	@FindBy(xpath = "//button[@type='submit']")
//	private WebElement Addtocartbutton;
//
//	@FindBy(xpath = "//a[@data-cy='button-cart']")
//	private WebElement cartbutton;
	
}
