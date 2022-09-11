package util;

import base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends BaseClass {

     TouchAction action = new TouchAction(driver);

        public boolean waitForElement(MobileElement element, int timeOut){
        try {
            WebDriverWait wait= new WebDriverWait(driver, timeOut);
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

        public boolean waitForEnabledElement(MobileElement element, int timeOut){
        try {
            WebDriverWait wait= new WebDriverWait(driver, timeOut);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return element.isDisplayed();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public void scroll(){
        Dimension screenSize = driver.manage().window().getSize();
        int startPoint = (int)(screenSize.height*0.8);
        int endPoint = (int)(screenSize.height*0.2);
        int width = (int)(screenSize.width/2);
        action.longPress(PointOption.point(width, startPoint)).moveTo(PointOption.point(width,endPoint)).release().perform();
    }

    public void scrollToElement(MobileElement element){
            boolean isElementInView = false;
            while (!isElementInView){
                scroll();
                try {
                    if(element.isDisplayed()){
                        isElementInView = true;
                    }
                }catch (NoSuchElementException exception){
                    System.out.println("Trying to find the element ...");
                }
            }
    }

}
