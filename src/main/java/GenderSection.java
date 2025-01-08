import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection extends BasePage{

    private final By maleRadioLabelLocator = By.xpath("//label[@for='gender-radio-1']");
    private final By femaleRadioLabelLocator = By.xpath("//label[@for='gender-radio-2']");
    private final By otherRadioLabelLocator = By.xpath("//label[@for='gender-radio-3']");

    private final By maleRadioButtonLocator = By.id("gender-radio-1");
    private final By femaleRadioButtonLocator =By.id("gender-radio-2");
    private final By otherRadioButtonLocator =By.id("gender-radio-3");

    public enum Genders {MALE, FEMALE, OTHER}

    public GenderSection(WebDriver driver) {
        super(driver);
    }

    public void clickRadioButton(Genders gender) {
        switch (gender) {
            case MALE:
                click(maleRadioLabelLocator);
                break;
            case FEMALE:
                click(femaleRadioLabelLocator);
                break;
            case OTHER:
                click(otherRadioLabelLocator);
                break;
        }
    }

    public boolean isRadioButtonChecked (Genders gender) {
        boolean isChecked = false;
        switch (gender) {
            case MALE:
                isChecked = isSelected(maleRadioButtonLocator);
                break;
            case FEMALE:
                isChecked = isSelected(femaleRadioButtonLocator);
                break;
            case OTHER:
                isChecked = isSelected(otherRadioButtonLocator);
                break;
        }
        return isChecked;
    }
}
