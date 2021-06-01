package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlertButton();
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getResultText(),"You successfully clicked an alert", "Alert not correct");

    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirmButton();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();

        assertEquals(text,"I am a JS Confirm", "Alert text is incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPromptButton();
        String text = "TAU rocks";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getResultText(), "You entered: " + text, "Results text not correct");
    }
}
