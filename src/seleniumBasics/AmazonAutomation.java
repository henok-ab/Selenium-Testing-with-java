package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AmazonAutomation {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Henok Abrham\\Desktop\\bit_4th_year\\testing/chromedriver.exe");

        // Instantiate a WebDriver object
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // 1. User Registration/Login
        userRegistrationAndLogin(driver);

        // 2. Product Browsing
        browseProducts(driver);

        // 3. Add to Cart Functionality
        addToCart(driver);

        // 4. Checkout Process
        checkout(driver);

        // 5. Search Functionality
        searchProducts(driver);

        // 6. Account Management
        manageAccount(driver);

        // 7. Payment Processing
        processPayment(driver);

        // 8. Order Tracking
        trackOrder(driver);

        // 9. Recommendation System
        viewRecommendations(driver);

        // 10. Customer Reviews and Ratings
        viewReviewsAndRatings(driver);

        // Close the browser
        driver.quit();
    }

    // User Registration/Login
    public static void userRegistrationAndLogin(WebDriver driver) {
        // Implement user registration and login steps
    }

    // Product Browsing
// Product Browsing
    public static void browseProducts(WebDriver driver) {
        // Navigate to Amazon homepage
        driver.get("https://www.amazon.com");

        // Find the search bar and enter a query
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop"); // Example query, you can change it as per your requirement

        // Submit the search query
        searchBox.submit();

        // Wait for search results to load (You may need to implement proper wait strategies here)
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-component-type='s-search-result']")));

        // Choose a product from the search results (For example, let's click on the first product)
        WebElement firstProduct = driver.findElement(By.xpath("//div[@data-component-type='s-search-result']//h2/a"));
        firstProduct.click();

        // Wait for the product details page to load (You may need to implement proper wait strategies here)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTitle")));

        // At this point, you are on the product details page. You can perform further actions if needed.
        // For example, you can retrieve product details like title, price, etc., and perform assertions.
        // Alternatively, you can add more actions like adding the product to the cart, viewing reviews, etc.
    }


    // Add to Cart Functionality
    public static void addToCart(WebDriver driver) {
        // Implement add to cart functionality
    }

    // Checkout Process
    public static void checkout(WebDriver driver) {
        // Implement checkout process steps
    }

    // Search Functionality
    public static void searchProducts(WebDriver driver) {
        // Implement search functionality
    }

    // Account Management
    public static void manageAccount(WebDriver driver) {
        // Implement account management steps
    }

    // Payment Processing
    public static void processPayment(WebDriver driver) {
        // Implement payment processing steps
    }

    // Order Tracking
    public static void trackOrder(WebDriver driver) {
        // Implement order tracking steps
    }

    // Recommendation System
    public static void viewRecommendations(WebDriver driver) {
        // Implement viewing recommendations steps
    }

    // Customer Reviews and Ratings
    public static void viewReviewsAndRatings(WebDriver driver) {
        // Implement viewing reviews and ratings steps
    }
}
