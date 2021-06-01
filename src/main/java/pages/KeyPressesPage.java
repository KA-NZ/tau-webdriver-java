package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ARROW_RIGHT;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");
    private By horizontalSlider = By.id("slider");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }

    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "p") + "=3.14");
    }


}
