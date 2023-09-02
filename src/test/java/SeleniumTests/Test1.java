package SeleniumTests;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        System.setProperty("webdriver.chrome.driver","C://Webdriver//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");

    }
}
