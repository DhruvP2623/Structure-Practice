package org.example;

// importing a package of chromeDriver
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

// extends shows inheritance concept that DriverManger(child class) and Utils (Parent class)
public class DriverManager extends Utils {
    public static final String USERNAME = LoadProp.getProperty("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_KEY = LoadProp.getProperty("BROWSERSTACK_ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    String browserName = LoadProp.getProperty("Browser");
    //    String browserName = System.getProperty("browser");
    boolean runIncloud = Boolean.parseBoolean(LoadProp.getProperty("cloud"));
    MutableCapabilities capabilities = new MutableCapabilities();


    public void openBrowser(){

        //run in cloud=======================================================================================================================
       if (runIncloud)
       {
           System.out.println("Running in the cloud");
           //connect to cloud
           if (browserName.equalsIgnoreCase("Edge")) {
               ///connect with browserstack
               capabilities.setCapability("browserName", "Edge");
               capabilities.setCapability("browserVersion", "106.0");
               HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
               browserstackOptions.put("os", "Windows");
               browserstackOptions.put("osVersion", "10");
               browserstackOptions.put("local", "false");
               browserstackOptions.put("seleniumVersion", "4.1.0");

               capabilities.setCapability("bstack:options", browserstackOptions);

           } else if (browserName.equalsIgnoreCase("Firefox"))
           {
               ///connect with browserstack
               capabilities.setCapability("browserName", "firefox");
               capabilities.setCapability("browserVersion", "106.0");
               HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
               browserstackOptions.put("os", "Windows");
               browserstackOptions.put("osVersion", "11");
               browserstackOptions.put("local", "false");
               browserstackOptions.put("seleniumVersion", "4.1.0");

               capabilities.setCapability("bstack:options", browserstackOptions);
           } else if (browserName.equalsIgnoreCase("Chrome"))
           {
               ///connect with browserstack
               capabilities.setCapability("browserName", "Chrome");
               capabilities.setCapability("browserVersion", "107.0");
               HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
               browserstackOptions.put("os", "Windows");
               browserstackOptions.put("osVersion", "11");
               browserstackOptions.put("local", "false");
               browserstackOptions.put("seleniumVersion", "4.1.0");

               capabilities.setCapability("bstack:options", browserstackOptions);
           } else {
               System.out.println("Your browser name is wrong or missing implementation:" + browserName);
           }
           try {
               driver = new RemoteWebDriver(new URL(URL), capabilities);
           } catch (MalformedURLException e) {
               throw new RuntimeException(e);
           }
       }else
       {
           System.out.println("Running locally");
           //run in locally
           if (browserName.equalsIgnoreCase("Chrome"))
           {

               System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
               driver = new ChromeDriver();
           }
           else if (browserName.equalsIgnoreCase("Firefox"))
           {
               System.setProperty("webdriver.gecko.driver", "src/test/java/Drivers/geckodriver.exe");
               driver = new FirefoxDriver();

           }
           else if (browserName.equalsIgnoreCase("Edge"))
           {
               System.setProperty("webdriver.edge.driver", "src/test/java/Drivers/msedgedriver.exe");
               driver = new EdgeDriver();
           }
           else
           {
               System.out.println("Your browser name is wrong or missing:" + browserName);
           }
       }


        // To maximize a browser window
        driver.manage().window().maximize();
        //set application URL to navigate
        driver.get(LoadProp.getProperty("url"));
    }
    // creating method for close browser
    public void closeBrowser()
    {
        driver.close();
    }
}
