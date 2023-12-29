package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@data-cy='button-profile']")
	private WebElement afterloginaccountbutton;
	
	@FindBy(xpath = "//*[@id='__next']/div[1]/div[2]/div/div[2]/div/div[1]/a[2]")
	private WebElement Men;
	
	@FindBy(xpath = "//div[text()='Log out']")
	private WebElement logout;
	
	@FindBy(xpath = "//a[text()='Women']")
	private WebElement Women;
	
	@FindBy(xpath = "//a[text()='Kids']")
	private WebElement kids;
	

	@FindBy(xpath = "//a[text()='Shoes']")
	private WebElement shoes;
	
	@FindBy(xpath = "//*[@id='__next']/div[1]/div[2]/div/div[3]/div/div[3]/a")
	private WebElement accessoriesbutton;
	
	
	@FindBy(xpath = "//div[@data-cy='add-to-cart']")
	private WebDriver HUSHPUPPIESAddToCart;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div")
	private WebDriver Selectsizeradiobutton;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebDriver Addtocartbutton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/a[1]/*[name()='svg'][1]/*[name()='path'][2]")
private WebElement mainhomepage;	
	
	
	
	public WebElement getLogouttohomepage() {
		return mainhomepage;
	}


	public WebElement getAccessoriesbutton() {
		return accessoriesbutton;
	}


	public WebDriver getHUSHPUPPIESAddToCart() {
		return HUSHPUPPIESAddToCart;
	}


	public WebDriver getSelectsizeradiobutton() {
		return Selectsizeradiobutton;
	}


	public WebDriver getAddtocartbutton() {
		return Addtocartbutton;
	}


	public WebElement getAfterloginaccountbutton() {
		return afterloginaccountbutton;
	}


	public WebElement getMen() {
		return Men;
	}


	public WebElement getLogout() {
		return logout;
	}


	public WebElement getWomen() {
		return Women;
	}


	public WebElement getKids() {
		return kids;
	}


	public WebElement getShoes() {
		return shoes;
	}


	
}
