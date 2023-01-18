package Zadatak1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        WebElement userName = driver.findElement(By.id("userName"));
        String fullName = "Bojan Radivojevic";
        userName.sendKeys(fullName);
        System.out.println("Unos imena:" + fullName);

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        String emailAddress = "bojanradivojevic1503@gmail.com";
        userEmail.sendKeys(emailAddress);
        System.out.println("Unos email: " + emailAddress);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Kopernikova 9, Novi Sad");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Kopernikova 9, Novi Sad");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.sendKeys(Keys.ENTER);

        WebElement name = driver.findElement(By.id("name"));
        System.out.println("Rezultat unosa imena: " + name.getText());
        WebElement email = driver.findElement(By.id("email"));
        System.out.println("Rezultat unosa email - a: " + email.getText());

        if (fullName.equals(name.getText().substring(5)) &&
                emailAddress.equals(email.getText().substring(6))) {
            System.out.println("Unos je identican sa rezultaom.");
        } else {
            System.out.println("Unos nije identican sa rezultatom.");
        }


        driver.quit();
    }
}
