package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageValidation {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Henok Abrham\\Desktop\\bit_4th_year\\testing/chromedriver.exe");

        // Instantiate a WebDriver object
        WebDriver driver = new ChromeDriver();

        // Validate Amazon
        validateWebsite(driver, "Amazon", "https://www.amazon.com/", "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");

        // Validate Google
        validateWebsite(driver, "Google", "https://www.google.com/", "Google");

        // Close the browser
        driver.quit();
    }

    public static void validateWebsite(WebDriver driver, String websiteName, String url, String expectedTitle) {
        // Navigate to the website
        driver.get(url);

        // Get the actual page title and URL
        String pageTitle = driver.getTitle();
        String pageURL = driver.getCurrentUrl();

        // Compare page title
        if (pageTitle.equals(expectedTitle)) {
            System.out.println(websiteName + " - Page title is as expected: " + expectedTitle);
        } else {
            System.out.println(websiteName + " - Page title is not as expected. Expected: " + expectedTitle + ", Actual: " + pageTitle);
        }

        // Compare page URL
        if (pageURL.equals(url)) {
            System.out.println(websiteName + " - Page URL is as expected: " + url);
        } else {
            System.out.println(websiteName + " - Page URL is not as expected. Expected: " + url + ", Actual: " + pageURL);
        }
    }
}
