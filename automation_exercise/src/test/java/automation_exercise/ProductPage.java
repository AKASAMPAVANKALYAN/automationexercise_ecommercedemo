package automation_exercise;

import org.openqa.selenium.By;

public class ProductPage {

    public void browseAndAddToCart() throws InterruptedException {
        DriverManager.driver.findElement(By.xpath("//a[text()=' Products']")).click();
        Thread.sleep(2000);

        DriverManager.driver.findElement(By.cssSelector("a[href='/product_details/2']")).click();
        Thread.sleep(2000);

        DriverManager.driver.findElement(By.cssSelector("button.cart")).click();
        Thread.sleep(2000);

        DriverManager.driver.findElement(By.linkText("View Cart")).click();
        Thread.sleep(2000);

        DriverManager.driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(2000);
    }
}
