package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgottenPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword() {
        ForgotPasswordPage resetPasswordPage = homePage.clickForgotPassword();

        resetPasswordPage.setEmail("bob@bob.com");
        EmailSentPage emailSentPage = resetPasswordPage.clickRetrievePasswordButton();
        assertEquals(emailSentPage.getMessage(), "Your email's been sent!", "Message is incorrect");


        //assertTrue(resetPasswordPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");


    }
}
