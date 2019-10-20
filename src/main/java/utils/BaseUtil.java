package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BaseUtil {

    public static WebDriver driver;

    public static String browserName;
    public static String url;
    public static Properties projectProperties = PropertyFileReader.readPropertyFile();
}
