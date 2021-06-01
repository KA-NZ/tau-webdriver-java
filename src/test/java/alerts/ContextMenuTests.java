package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightclickContextMenu();
        String alertMessage = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();
        assertEquals(alertMessage, "You selected a context menu", "Alert text not correct");

    }
}
