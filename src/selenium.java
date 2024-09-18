import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\atuls\\Downloads\\Java\\selenium\\selenium\\src\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("atulkumarsuthar421@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Qwerty@123");
        driver.findElement(By.id("js-login-btn")).click();

        driver.wait(2000);
        // driver.quit();
        
    }
}