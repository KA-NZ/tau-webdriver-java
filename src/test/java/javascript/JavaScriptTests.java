package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }
    @Test
    public void testScrollToFightParagraph(){
        homePage.clickInfiniteScroll().scrollToParagrap(5);
    }
    @Test
    public void testSetAttribute(){
        homePage.clickDropdownList().editDropdown();
    }

    @Test
    public void testAddMultipAttributeToDropdown(){
        var dropDownPage = homePage.clickDropdownList();
        dropDownPage.editDropdown();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);

        var selectedOptions = dropDownPage.getSelectOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected options not correct");
    }
}
