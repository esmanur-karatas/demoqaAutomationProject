import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
@TestInstance(TestInstance.Lifecycle.PER_METHOD) // static yapmamıza gerek kalmamamıs için bunu kullandık


public class BaseTest {

    protected  WebDriver driver;

@BeforeAll
    public static void setUp() {
    WebDriverManager.chromedriver().setup();
}

@BeforeEach //her metottan yani testen önce chrome açar
public void beforeMethod() {
    driver = new ChromeDriver();
}

@AfterEach
public void afterMethod() throws InterruptedException {
    //Thread.sleep(4000);
    driver.quit();
}
@AfterAll
    public static void tearDown(){

   // driver.quit ();
}
}
