package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_assign2
{
	public POM_assign2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="_30XB9F")
	private WebElement popup;
	
	@FindBy(name="q")
	private WebElement search;
	
	@FindBy(linkText = "Small 5 L Backpack Basketball Cross Body Bag")
	private WebElement ProductName;
	
	@FindBy(xpath = "//div[text()='₹1,809']")
	private WebElement price;
	
	//***getter methods***
	
	public WebElement getpopup()
	{
		return popup;
	}
	public WebElement getsearch()
	{
		return search;
	}
	public WebElement getProductName()
	{
		return ProductName;
	}
	public WebElement getprice()
	{
		return price;
	}
	
	//******business class***
	
	public void flipkart(String data)
	{
		popup.click();
		search.sendKeys(data);
		search.submit();
		System.out.println(ProductName.getText());
		System.out.println(price.getText());
	}
	

}
