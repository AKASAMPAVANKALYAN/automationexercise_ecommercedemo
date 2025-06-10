package automation_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {

    public void signUp(String name, String email) {
        DriverManager.driver.findElement(By.name("name")).sendKeys(name);
        DriverManager.driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);
        DriverManager.driver.findElement(By.xpath("//button[text()='Signup']")).click();
    }

    public void fillAccountDetails(String password, String day, String month, String year) throws InterruptedException {
        Thread.sleep(1000);
        DriverManager.driver.findElement(By.id("id_gender1")).click();
        DriverManager.driver.findElement(By.id("password")).sendKeys(password);

        new Select(DriverManager.driver.findElement(By.id("days"))).selectByVisibleText(day);
        new Select(DriverManager.driver.findElement(By.id("months"))).selectByVisibleText(month);
        new Select(DriverManager.driver.findElement(By.id("years"))).selectByVisibleText(year);
    }

    public void fillAddressDetails(String fname, String lname, String company, String addr1, String addr2, String state, String city, String zipcode, String mobile) {
        DriverManager.driver.findElement(By.id("first_name")).sendKeys(fname);
        DriverManager.driver.findElement(By.id("last_name")).sendKeys(lname);
        DriverManager.driver.findElement(By.id("company")).sendKeys(company);
        DriverManager.driver.findElement(By.id("address1")).sendKeys(addr1);
        DriverManager.driver.findElement(By.id("address2")).sendKeys(addr2);
        DriverManager.driver.findElement(By.id("state")).sendKeys(state);
        DriverManager.driver.findElement(By.id("city")).sendKeys(city);
        DriverManager.driver.findElement(By.id("zipcode")).sendKeys(zipcode);
        DriverManager.driver.findElement(By.id("mobile_number")).sendKeys(mobile);
    }

    public void continueAfterSignup() throws InterruptedException {
        DriverManager.driver.findElement(By.id("newsletter")).click();
        DriverManager.driver.findElement(By.id("optin")).click();
        DriverManager.driver.findElement(By.xpath("//button[text()='Create Account']")).click();
        Thread.sleep(1000);
        DriverManager.driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
        Thread.sleep(2000);
    }
}
