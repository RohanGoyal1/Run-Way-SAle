package Utilites;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility {

	public void selectDropDownByVisibleText(String textofOption,WebElement selectTagOfDropDown) {
	Select select=new Select(selectTagOfDropDown); 
	select.selectByVisibleText(textofOption);
}
	public void selectDropDownByValueattributeValue(String ValueattributeValue,WebElement selectTagofDropDown) {
	Select select=new Select(selectTagofDropDown); 
	select.selectByValue(ValueattributeValue);
	}

	public void selectDropDownBIndex(int index,WebElement selectTagofDropDown){
	Select select=new Select(selectTagofDropDown); 
	select.selectByIndex(index);
	}
	
	public void deselectDropDownByVisibleText(String textofoption, WebElement selectTageofdropdown) {
	Select select=new Select(selectTageofdropdown);
	select.deselectByVisibleText(textofoption);
	}
	
	
	public void deselectDropDownByValueattributeValue(String ValueattributeValue,WebElement selectTageofdropdown) {
		Select select=new Select(selectTageofdropdown);
		select.deselectByValue(ValueattributeValue);
	
	}
	public void deselectDropDownBIndex(int index, WebElement selectTagofDropDown) {
		Select select=new Select(selectTagofDropDown);
		select.deselectByIndex(index);
	
	}
	public ArrayList<String> ToGetAlloptionsText(WebElement selectTagOfDropDown) {
	Select select=new Select(selectTagOfDropDown);
	List<WebElement> alloptions = select.getOptions();
	ArrayList<String> alloPtionsTexts = new ArrayList<String>();
	for (WebElement ele:alloptions) {
		alloPtionsTexts.add(ele.getText());
	
	}
	return alloPtionsTexts;
	}
	

	public WebElement ToGetPerticularOptiononIndex(WebElement selectTagOfDropDown, int indexofOption) {
		Select select = new Select(selectTagOfDropDown);
List<WebElement> alloptions = select.getOptions();
	WebElement perticularOptionWebElement=alloptions.get(indexofOption);
	return perticularOptionWebElement;

	}

}
