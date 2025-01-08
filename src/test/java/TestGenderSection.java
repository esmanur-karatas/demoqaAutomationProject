import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGenderSection extends BaseTest{

    @Test
    public void checkMaleRadioButton(){
        DemoqaFormPages demoqaFormPages = new DemoqaFormPages(driver);
        demoqaFormPages.getGenderSection().clickRadioButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(demoqaFormPages.getGenderSection().isRadioButtonChecked(GenderSection.Genders.MALE),
                "Male radio button is not checked!");
    }

    @Test
    public void checkFemaleRadioButton(){
        DemoqaFormPages demoqaFormPages = new DemoqaFormPages(driver);
        demoqaFormPages.getGenderSection().clickRadioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(demoqaFormPages.getGenderSection().isRadioButtonChecked(GenderSection.Genders.FEMALE),
                "Female radio button is not checked!");
    }

    @Test
    public void checkOtherRadioButton(){
        DemoqaFormPages demoqaFormPages = new DemoqaFormPages(driver);
        demoqaFormPages.getGenderSection().clickRadioButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(demoqaFormPages.getGenderSection().isRadioButtonChecked(GenderSection.Genders.OTHER),
                "Other radio button is not checked!");
    }
}
