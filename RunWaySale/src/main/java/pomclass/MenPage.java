package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage {
	public WebDriver driver;
	public MenPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[@data-cy='add-to-cart']")
	private WebElement HUSHPUPPIESshoesAddToCartButton;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div")
	private WebElement Selectsizeradiobutton;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Addtocartbutton;
	
	@FindBy(xpath = "//a[@data-cy='button-cart']")
	private WebElement cartbutton;

	public WebElement getHUSHPUPPIESshoesAddToCartButton() {
		return HUSHPUPPIESshoesAddToCartButton;
	}

	public WebElement getSelectsizeradiobutton() {
		return Selectsizeradiobutton;
	}

	public WebElement getAddtocartbutton() {
		return Addtocartbutton;
	}
	

	public WebElement getCartbutton() {
		return cartbutton;
	}
	

	

	
}
