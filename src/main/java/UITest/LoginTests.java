package UITest;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Message;

public class LoginTests {
    public void verifyValidLogin()
    {
        /* 1.open home page https://www.saucedemo.com user should be on home page
        find browser exe
        open browser
        provide url in address bar
        2. enter valid user name standard_user
        find username field in home page
        type/enter valid user name
        3. enter valid password secret_sauce
        find password input field in homepage
        type/enter valid password
        4.click login button user should be redirected to products page -Products heading text
        find login button
        click login button
        verify redirected page*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com");
driver.findElement(By.id("user-name")).sendKeys( "standard_user");
driver.findElement(By.name("password")).sendKeys("secret_sauce");
driver.findElement(By.id("Login - button")).click();
String expectedPageHeading = "PRODUCTS";
String actualPageHeading = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(expectedPageHeading,actualPageHeading);

        public void verifyInValidLogin()
        {
            {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.saucedemo.com");
                driver.findElement(By.id("user-name")).sendKeys( "standard_user_inv");
                driver.findElement(By.name("password")).sendKeys("secret_sauce_inv");
                driver.findElement(By.id("Login-button")).click();
                String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";/
                String actualErrorMessage = driver.findElement(By.xpath(html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3)"title")).getText();
                Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
            }}



