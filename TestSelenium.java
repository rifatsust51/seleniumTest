package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class TestSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String Url = "https://www.saucedemo.com/";
        driver.get(Url);
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        username.clear();
        System.out.println("Entering the username");
        username.sendKeys("standard_user");

        password.clear();
        System.out.println("Entering the password");
        password.sendKeys("secret_sauce");

        System.out.println("Clicking login button");
        loginButton.click();

        String title = "Swag Labs";

        String actualTitle = driver.getTitle();

        System.out.println("Verifying the page title has started");
        Assert.assertEquals(actualTitle,title,"Page title doesnt match");

        System.out.println("The page title has been successfully verified");

        System.out.println("User logged in successfully");
//
        System.out.println("Adding Sauce Labs Backpack to the cart");
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        System.out.println("Adding Sauce Labs Fleece Jacket to the cart");
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();

        System.out.println("Item added to the cart successfully");
////
        System.out.println("Navigation to cart");
        driver.get("https://www.saucedemo.com/cart.html");
        System.out.println("Clicking CHECKOUT button");
        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Rifat");
        System.out.println("First name added successfully");
        driver.findElement(By.id("last-name")).sendKeys("Riaz");
        System.out.println("Last name added successfully");
        driver.findElement(By.id("postal-code")).sendKeys("2000");
        System.out.println("ZIP code added successfully");

       System.out.println("Clicking CONTINUE button");
       driver.findElement(By.id("continue")).click();

        System.out.println("Clicking FINISH button");
        driver.findElement(By.id("finish")).click();


    }
}
