package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownListPage {
    WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownListPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectOptions(){
        List<WebElement> selectedElments = findDropDownElement().getAllSelectedOptions();
        return selectedElments.stream().map(e->e.getText()).collect(Collectors.toList());
    }


    public void editDropdown(){
        //WebElement dropdownElement = driver.findElement(dropdown);
        String script = "arguments[0].setAttribute('multiple','')";
        ((JavascriptExecutor)driver).executeScript(script,findDropDownElement());

    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }


}
