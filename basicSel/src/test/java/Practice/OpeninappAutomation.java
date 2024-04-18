package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class OpeninappAutomation {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Part A
            // 1. Login to Openinapp via mobile number and read OTP automatically from message
            loginToOpeninapp(driver, "7416590887");

            // 2. Create a Smart link for YouTube
            createSmartLinkForYouTube(driver);

            // 3. Add the created Smart link in Instagram’s bio
            addSmartLinkToInstagramBio(driver);

            // 4. Measure the time taken for redirection from Instagram to YouTube
            measureRedirectionTime(driver);

            // 5. Document it on a sheet (You can use external libraries for Excel or CSV handling)

        } finally {
            // Close the browser
            driver.quit();
        }
    }

    private static void loginToOpeninapp(WebDriver driver, String mobileNumber) {
        // Implement code to navigate to Openinapp login page
        driver.get("https://dogstore.com/login");

        // Enter the mobile number
        WebElement mobileNumberInput = driver.findElement(By.id("mobileNumber"));
        mobileNumberInput.sendKeys(mobileNumber);

        // Submit the form (You might need to trigger OTP sending here)

        // Wait for OTP to be received (You might need to use external libraries for OTP reading)

        // Automatically read OTP from message and submit
        WebElement otpInput = driver.findElement(By.id("otp"));
        otpInput.sendKeys("read_otp_from_message");

        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        // Wait for the login to complete (Use appropriate wait conditions)
    }

    private static void createSmartLinkForYouTube(WebDriver driver) {
        // Implement code to navigate to Smart link creation section
        driver.get("https://dogstore.com/createSmartLink");

        // Input details for creating a Smart link for YouTube
        WebElement linkNameInput = driver.findElement(By.id("linkName"));
        linkNameInput.sendKeys("YouTube Smart Link");

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
        bioTextarea.sendKeys("Check out my YouTube Smart Link: [paste_smart_link_here]");

        // Save changes
        WebElement saveButton = driver.findElement(By.xpath("//button[text()='Save']"));
        saveButton.click();

        // Wait for changes to be saved
    }

    private static void measureRedirectionTime(WebDriver driver) {
        // Implement code to click on the Smart link in Instagram bio
        driver.get("https://instagram.com/yourprofile");

        // Locate the Smart link in the bio and click on it
        WebElement smartLinkInBio = driver.findElement(By.linkText("YouTube Smart Link"));
        smartLinkInBio.click();

        // Measure the time taken for redirection to YouTube
        long time = System.currentTimeMillis();

        // Wait for the YouTube page to load (Use appropriate wait conditions)

        long endTime = System.currentTimeMillis();
        long redirectionTime = endTime - time;

        System.out.println("Redirection time to YouTube: " + redirectionTime + " milliseconds");
    }
}

