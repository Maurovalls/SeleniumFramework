package steps;

import org.openqa.selenium.WebDriver;
import pom.*;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);

}
