package test.com.bitrix.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null){
            String browser = ConfigurationReader.getProperty("browser");

            switch (browser) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
                    driver = new FirefoxDriver();
                    break;
                case "chrome-headles":
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
                    //WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox-headles":
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));

            }
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
