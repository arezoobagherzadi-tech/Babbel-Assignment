package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.drivers.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class BaseClass {

        public static AppiumDriver<MobileElement> driver;
        String developer_token = "pmIPlJ4zq0bZI3QLx3e3Q01Gdtf_8ImQkn3dlkxEu6w1";


    public BaseClass() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.UDID, "52003deb8c6bc5db");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.amazon.mShop.android.shopping");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.amazon.mShop.splashscreen.StartupActivity");

        try {
            driver = new AndroidDriver<>(developer_token, capabilities);
        } catch (Exception e){
            e.printStackTrace();
        };
    }

        @AfterTest
        public void tearDown(){
        driver.quit();
    }
}
