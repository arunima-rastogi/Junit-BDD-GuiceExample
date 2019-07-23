package configuration;

import com.google.inject.Provider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxDriverFactory implements Provider<WebDriver> {

    public WebDriver get() {
        return new FirefoxDriver();
    }
}