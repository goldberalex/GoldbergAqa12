import java.util.concurrent.TimeUnit;

public class TestBase {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void clickOnDropdown() {
        wd.findElement(By.linkText("Selenium WebDriver")).click();
    }

    public void typeAnyThing() {
        wd.findElement(By.id("lst-ib")).click();
        wd.findElement(By.id("lst-ib")).clear();
        wd.findElement(By.id("lst-ib")).sendKeys("selenium ");
    }

    public void openGoogle() {
        wd.get("https://www.google.co.il/");
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
