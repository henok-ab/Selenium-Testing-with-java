package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Henok Abrham\\Desktop\\bit_4th_year\\testing/chromedriver.exe");

        // Instantiate a WebDriver object
        WebDriver driver = new ChromeDriver();

        // Navigate to Amazon
        driver.get("https://www.amazon.com");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Find the sign-in link and click it
        WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
        signInLink.click();

        // Find the email/phone number input element and enter the username
        WebElement emailInput = driver.findElement(By.id("ap_email"));
        emailInput.sendKeys("abrhaamhenok@gmail.com");

        // Find the continue button and click it
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Find the password input element and enter the password
        WebElement passwordInput = driver.findElement(By.id("ap_password"));
        passwordInput.sendKeys("henok206");

        // Find the sign-in button and click it
        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();

        // Wait for some time to see if login is successful
        try {
            Thread.sleep(2000); // Increase wait time if necessary
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if we are still on the sign-in page or if we successfully logged in
        if (driver.getCurrentUrl().equals("https://www.amazon.com/ap/signin")) {
            System.out.println("Login failed. Invalid username or password.");
        } else {
            System.out.println("Login successful.");
            // Automation of the search bar
            WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox")); // Assuming the search bar's name is "q"
            searchInput.sendKeys("nike shoes");
            searchInput.submit(); // Submit the search query

            // Wait for search results to load
            try {
                Thread.sleep(2000); // Adjust this wait time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Perform scroll down
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

            // Wait for some time after scrolling
            try {
                Thread.sleep(2000); // Adjust this wait time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Perform scroll up
            js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");


            //Function to open a new tab
            ((JavascriptExecutor) driver).executeScript("window.open()");


            //  to navigate to Amazon
            // Switch to the new tab
            driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
            // Navigate to Amazon
            driver.get("https://www.amazon.com/s?k=nike+shoes&ref=nav_bb_sb");

            // Wait for some time after scrolling
            try {
                Thread.sleep(2000); // Adjust this wait time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        // Close the browser
        driver.quit();
    }


}
