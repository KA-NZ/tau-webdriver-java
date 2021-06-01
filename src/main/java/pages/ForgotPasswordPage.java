package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By forgotPasswordLink = By.linkText("Forgot Password");
    private By retrievePasswordButton = By.cssSelector("#form_submit > i");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){

        driver.findElement(forgotPasswordLink).sendKeys(email);
    }

    //public void setPassword(String password){
    //   driver.findElement(passwordField).sendKeys(password);
  //  }

    public EmailSentPage clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailSentPage(driver);

    }


}
