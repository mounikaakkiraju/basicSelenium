package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Intialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(name="user-name")
	private WebElement UserText;
	
	@FindBy(name="password")
	private WebElement Pass;
	
	@FindBy(id="login-button")
	private WebElement Login;
	
	//Getter methods
	public WebElement getUserText()
	{
		return UserText;
	}
	public WebElement getPass()
	{
		return Pass;
	}
	public WebElement getLogin()
	{
		return Login;
	}
	
	public void LoginIntoApp(String username,String password)
	{
		UserText.sendKeys(username);
		Pass.sendKeys(password);
		Login.click();
	}

}
