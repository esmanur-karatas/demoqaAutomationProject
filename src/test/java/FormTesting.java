import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormTesting extends BaseTest{



    @Test
    public void test_SetName() {
        DemoqaFormPages demoqaFormPages = new DemoqaFormPages(driver);
        demoqaFormPages.setName("Esmanur");
        Assertions.assertEquals("Esmanur",demoqaFormPages.getName(), "Name value is not currect!");
    }

    @Test
    public void test_LastName() {
        DemoqaFormPages demoqaFormPages = new DemoqaFormPages(driver);
        demoqaFormPages.setLastName("Karataş");
        Assertions.assertEquals("Karataş", demoqaFormPages.getSurname(), "Surname value is not currect!");
    }

    @Test
    public void test_Email() {
        DemoqaFormPages demoqaFormPages = new DemoqaFormPages(driver);
        demoqaFormPages.setEmail("esmanur@gmail.com");
        Assertions.assertEquals("esmanur@gmail.com", demoqaFormPages.getEmail(), "Email value is not currect!");
    }
}

