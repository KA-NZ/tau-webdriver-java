package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By contextMenuBox = By.xpath("//*[@id=\"hot-spot\"]");

    public ContextMenuPage(WebDriver driver){
        this.driver =driver;
    }

    public void rightclickContextMenu() {
        WebElement contextMenu = driver.findElement(contextMenuBox);
        Actions actions = new Actions(driver);
        actions.contextClick(contextMenu).perform();

    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_clickToAccept(){

        driver.switchTo().alert().accept();


    }


}
