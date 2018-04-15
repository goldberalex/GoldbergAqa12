import org.openqa.selenium.*;
import org.testng.annotations.Test;

import static org.openqa.selenium.OutputType.*;
import static org.testng.Assert.*;

public class Firstest extends TestBase {

    @Test
    public void firstest() {
        openGoogle();
        typeAnyThing();
        wd.findElement(By.xpath("//div[@id='sbse3']//b[.=' webdriver']")).click();
        wd.findElement(By.linkText("Change to English")).click();
        clickOnDropdown();
    }

}
