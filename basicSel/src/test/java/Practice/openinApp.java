package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class openinApp {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Login to Openinapp
            loginToOpeninapp(driver, "your_username", "your_password");

            // 2. Create a Smart link for Amazon
            createSmartLinkForAmazon(driver);

            // 3. Add the created Smart link in Instagram’s bio
            addSmartLinkToInstagramBio(driver);

            // 4. Measure the time taken for redirection from Instagram to Amazon
            measureRedirectionTime(driver);

            // 5. Document it on a sheet (You can use external libraries for Excel or CSV handling)

        } finally {
            // Close the browser
            driver.quit();
        }
    }

    private static void loginToOpeninapp(WebDriver driver, String username, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void loginToOpeninapp(WebDriver driver, String username, int password) {
        // Implement code to navigate to Openinapp login page
        driver.get("https://openinapp.com/");

        // Enter username and password
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys("testassignment@openinapp.com");
        passwordInput.sendKeys("0000");

        // Submit the form
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        // Wait for the login to complete (Use appropriate wait conditions)
    }

    private static void createSmartLinkForAmazon(WebDriver driver) {
        // Implement code to navigate to Smart link creation section
        driver.get("https://example.com/createSmartLink");

        // Input details for creating a Smart link for Amazon
        WebElement linkNameInput = driver.findElement(By.id("linkName"));
        linkNameInput.sendKeys("Amazon Smart Link");

        // Other input fields...

        // Submit the form
        WebElement createButton = driver.findElement(By.id("createButton"));
        createButton.click();

        // Wait for the Smart link to be created
    }

    private static void addSmartLinkToInstagramBio(WebDriver driver) {
        // Implement code to log in to Instagram
        driver.get("https://instagram.com/login");

        // Enter Instagram credentials and login

        // Navigate to the bio section
        driver.get("https://instagram.com/yourprofile/edit");

        // Add the Smart link to the bio
        WebElement bioTextarea = driver.findElement(By.tagName("textarea"));
        bioTextarea.sendKeys("Check out my Amazon Smart Link: [paste_smart_link_here]");

        // Save changes
        WebElement saveButton = driver.findElement(By.xpath("//button[text()='Save']"));
        saveButton.click();

        // Wait for changes to be saved
    }

    private static void measureRedirectionTime(WebDriver driver) {
        // Implement code to click on the Smart link in Instagram bio
        driver.get("https://instagram.com/yourprofile");

        // Locate the Smart link in the bio and click on it
        WebElement smartLinkInBio = driver.findElement(By.linkText("Amazon Smart Link"));
        smartLinkInBio.click();

        // Measure the time taken for redirection to Amazon
        long startTime = System.currentTimeMillis();

        // Wait for the Amazon page to load (Use appropriate wait conditions)

        long endTime = System.currentTimeMillis();
        long redirectionTime = endTime - startTime;

        System.out.println("Redirection time to Amazon: " + redirectionTime + " milliseconds");
    }
}

