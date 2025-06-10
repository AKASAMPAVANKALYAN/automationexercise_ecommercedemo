package automation_exercise;

import org.openqa.selenium.By;

public class CheckoutPage {

    public void placeOrder(String nameOnCard, String cardNumber, String cvv, String expiryMonth, String expiryYear) throws InterruptedException {
        DriverManager.driver.findElement(By.linkText("Place Order")).click();
        Thread.sleep(2000);

        DriverManager.driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input")).sendKeys(nameOnCard);
        Thread.sleep(1000);

        DriverManager.driver.findElement(By.name("card_number")).sendKeys(cardNumber);
        Thread.sleep(1000);

        DriverManager.driver.findElement(By.name("cvc")).sendKeys(cvv);
        Thread.sleep(1000);

        DriverManager.driver.findElement(By.name("expiry_month")).sendKeys(expiryMonth);
        Thread.sleep(1000);

        DriverManager.driver.findElement(By.name("expiry_year")).sendKeys(expiryYear);
        Thread.sleep(1000);

        DriverManager.driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
    }

    public void downloadInvoiceAndContinue() throws InterruptedException {
        DriverManager.driver.findElement(By.linkText("Download Invoice")).click();
        Thread.sleep(2000);

        DriverManager.driver.findElement(By.linkText("Continue")).click();
        Thread.sleep(2000);
    }

    public void deleteAccount() {
        DriverManager.driver.findElement(By.linkText("Delete Account")).click();
    }
}
