package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverFactory {
    public static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    static PropertiesReader propertiesReader = new PropertiesReader();

    public static void setDriver() {
        WebDriverManager.chromedriver().clearDriverCache();
        WebDriverManager.chromedriver().clearResolutionCache();
        WebDriverManager.chromedriver().setup();
        driverThreadLocal.set(new ChromeDriver());
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(propertiesReader.getImplicityWait()));
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(propertiesReader.getImplicityWait()));
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().get(propertiesReader.getUrl());
    }

    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    public static void quitDriver() {
        driverThreadLocal.get().quit();
        driverThreadLocal.remove();
    }

}
