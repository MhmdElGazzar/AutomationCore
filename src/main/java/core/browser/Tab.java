package core.browser;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.Validations;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class Tab {
     WebDriver driver;
     ArrayList<String> newTb;
    public Tab(WebDriver driver) {
     this.driver= driver;
    }
    public void goToSecondTab()
    {  newTb = new ArrayList<>(driver.getWindowHandles());
       driver.switchTo().window(newTb.get(1));
    }
    public void getBack()
    {
        driver.close();
        driver.switchTo().window(newTb.get(0));
    }
    public  String getTitle()
    {return BrowserActions.getCurrentWindowTitle(driver);}
    public  void shouldHaveTitle(String expectedTitle)
    { Validations.assertThat().object(getTitle()).
            isEqualTo(expectedTitle).perform();}
}
