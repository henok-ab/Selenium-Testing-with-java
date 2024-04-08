package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCaptcha {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Henok Abrham\\Desktop\\bit_4th_year\\testing/chromedriver.exe");

        // Instantiate a WebDriver object
        WebDriver driver = new ChromeDriver();

        // Navigate to Amazon
        driver.get("https://www.amazon.com");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Handle CAPTCHA
        handleCaptcha(driver);

        // Close the browser
        driver.quit();
    }


    // Function to handle CAPTCHA
    public static void handleCaptcha(WebDriver driver) {
        try {
            // Find the CAPTCHA input field and attempt to input text
            WebElement captchaInput = driver.findElement(By.id("captchacharacters"));
            captchaInput.sendKeys("SampleText"); // Attempt to input text into the CAPTCHA field
            // Wait for some time to see if CAPTCHA validation error occurs
            Thread.sleep(3000);
            // Check if CAPTCHA validation error occurs
            if (driver.getPageSource().contains("CAPTCHA validation failed")) {
                System.out.println("Error: CAPTCHA validation failed");
            } else {
                System.out.println("CAPTCHA validation successful");
                System.out.println("but you can't pass it because the sampleText ");


                try {
                    Thread.sleep(200000); // Adjust this wait time as needed
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Unable to find CAPTCHA input field");
        }
    }
}
