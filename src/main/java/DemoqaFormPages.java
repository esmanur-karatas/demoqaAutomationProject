import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoqaFormPages extends BasePage{


    private final By nameLocater = By.id("firstName");
    private final By lastNameLocator = By.id("lastName");
    private final By emailLocator = By.id("userEmail");

    private GenderSection genderSection;


    public DemoqaFormPages(WebDriver driver) {
        super(driver);
        driver.get(baseUrl.concat("automation-practice-form"));
        genderSection = new GenderSection(driver);

    }

    public GenderSection getGenderSection() {
        return this.genderSection;
    }


    public void setName(String nameText) {
        type(nameLocater, nameText);

    }


    public void setLastName(String lastNameText) {
        type(lastNameLocator, lastNameText);

    }


    public void setEmail(String emailText) {
        type(emailLocator, emailText);

    }

    public String getName()
    {
       return find(nameLocater).getAttribute("value");
        //getAttiribute ile inputlara girdiğimiz metinleri alabiliriz. eğer text yooksa kodların içinde

    }

    public String getSurname()
    {
        return find(lastNameLocator).getAttribute("value");
    }

    public String getEmail()
    {
        return find(emailLocator).getAttribute("value");
    }
}
