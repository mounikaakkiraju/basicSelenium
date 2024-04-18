package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_ASSGIN1 
{
	

    //***INtialization**
	public POM_ASSGIN1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//***Declaration**
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement submit;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro']/descendant::span[text()='Mens Cricket Classicat Cricket Shoe']")
	private WebElement ProductName;
	
	@FindBy(xpath="//span[text()='2,869']")
	private WebElement Price;
	
	
	
	//***Getter methods***
	public WebElement getsearch()
	{
		return search;
	}
	
	public WebElement getsubmit()
	{
		return submit;
	}
	
	public WebElement getProductName()
	{
		return ProductName;
	}
    public WebElement  getPrice()
    {
    	return Price;
    }
    
    //***Business class***
    public void ProductPrice(String data)
    {
    	search.sendKeys(data);
    	submit.click();
    	System.out.println(ProductName.getText());
    	System.out.println(Price.getText());
    }
}
