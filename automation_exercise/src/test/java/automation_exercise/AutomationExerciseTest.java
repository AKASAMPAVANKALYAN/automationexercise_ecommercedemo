package automation_exercise;

import org.testng.annotations.*;

public class AutomationExerciseTest {

    SignupPage signupPage;
    ProductPage productPage;
    CheckoutPage checkoutPage;

    @BeforeClass
    public void setup() {
        // Launch the browser and open the URL
        DriverManager.launchBrowser();
        DriverManager.driver.get("https://www.automationexercise.com/login");

        // Initialize page objects
        signupPage = new SignupPage();
        productPage = new ProductPage();
        checkoutPage = new CheckoutPage();
    }

    @Test
    public void fullTestFlow() throws InterruptedException {
        signupPage.signUp("pavan", "pavan51235@gmail.com");
        signupPage.fillAccountDetails("pavan@123", "15", "March", "1995");
        signupPage.fillAddressDetails("pavan", "kalyan", "GOAT", "hyd", "kphb", "ts", "hyderabad", "500020", "834165388");
        signupPage.continueAfterSignup();

        productPage.browseAndAddToCart();

        checkoutPage.placeOrder("pavan", "2345", "222", "9", "2999");
        checkoutPage.downloadInvoiceAndContinue();
        checkoutPage.deleteAccount();
    }

    @AfterClass
    public void teardown() {
        DriverManager.closeBrowser();
    }
}
