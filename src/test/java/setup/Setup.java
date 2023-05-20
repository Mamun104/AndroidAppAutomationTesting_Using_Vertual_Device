package setup;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {


    public AndroidDriver driver;

    public static final String PACKAGE_ID ="com.google.android.calculator";

    @BeforeTest
    public AndroidDriver setup() throws InterruptedException, MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "My Device");
        cap.setCapability("platformName", "Android");
        cap.setCapability("uuid", "YOF031010588");
        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        cap.setCapability("app", System.getProperty("user.dir")+"/src/test/resources/Calculator.apk");
        cap.setCapability("autoGrantPermissions", true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    @AfterTest
    public void closeApp() {
        driver.quit();
    }


}
