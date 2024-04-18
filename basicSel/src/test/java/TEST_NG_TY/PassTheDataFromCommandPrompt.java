package TEST_NG_TY;

import org.testng.annotations.Test;

@Test
public class PassTheDataFromCommandPrompt
{
	
	public void method1()
	{
		String Browser = System.getProperty("browser");
		String URL = System.getProperty("url");
		String User = System.getProperty("username");
		String Pass = System.getProperty("password");
		
		System.out.println(Browser);
		System.out.println(URL);
		System.out.println(User);
		System.out.println(Pass);
		
		
	}

}
