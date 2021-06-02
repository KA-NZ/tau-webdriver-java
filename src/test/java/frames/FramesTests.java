package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {

    @Test
    public void testFrameInput(){

        var wysiwygPage = homePage.clickWysiwgEditor();
        wysiwygPage.clearTextArea();
        wysiwygPage.setTextArea("hello ");
        wysiwygPage.increaseIndention();
        wysiwygPage.setTextArea("world");
        assertEquals(wysiwygPage.getTextFromEditor(), "hello world", "Editor text incorrect");


    }

    @Test
    public void testNestedFrames(){
        var nestedFramesPage = homePage.clickFramesPage();
        var leftText = nestedFramesPage.getTextFromLeftFrame();
        var bottomText = nestedFramesPage.getTextFromBottomFrame();

        assertEquals(leftText+ " " + bottomText, "LEFT BOTTOM", "Text not correct");


    }
}
