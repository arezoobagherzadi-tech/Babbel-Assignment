package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    AppiumDriver<MobileElement> driver;

    public MainPage(AppiumDriver<MobileElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/chrome_search_hint_view")
    public MobileElement searchBar;

    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
    public MobileElement searchTextBar;

    @AndroidFindBy(xpath = "//*[@class = 'androidx.appcompat.app.ActionBar$Tab'][1]/android.widget.ImageView")
    public MobileElement homeSection;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.Button[2]")
    public MobileElement tv;

    @AndroidFindBy(xpath = "//android.view.View[4]")
    public MobileElement smartTv;

    @AndroidFindBy(xpath ="//android.widget.Button[@text='Add to Cart']")
    public MobileElement addToCartBtn;

    @AndroidFindBy(xpath = "android.view.View[@text='No Thanks']")
    public MobileElement noThanksBtn;

    @AndroidFindBy(xpath = "android.widget.TextView[@text='Done']")
    public MobileElement doneBtn;

    @AndroidFindBy(xpath = "//*[@class = 'androidx.appcompat.app.ActionBar$Tab'][3]//android.widget.ImageView")
    public MobileElement basketIcon;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Proceed to checkout']")
    public MobileElement proceedToCheckoutBtn;


}
