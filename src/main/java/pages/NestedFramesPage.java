package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private String topFrame = "frame-top";
    private By body = By.tagName("body");


    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }
    public String getTextFromLeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText();
        switchToMainArea(); // exit left to top
        switchToMainArea(); //exit top to main

        return text;
    }

    public String getTextFromBottomFrame(){
        driver.switchTo().frame(bottomFrame);
        String text = getFrameText();
        switchToMainArea();
        return text;
    }

    private String getFrameText(){
        return driver.findElement(body).getText();

    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();

    }


}
