package slidertests;

import base.BaseTests;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testSlideToNumber(){
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        String actualValue = sliderPage.getSliderValue();

        assertEquals(actualValue,value);


    }
}
