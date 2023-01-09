package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage  {

    private String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    private By titleComicsLocator = By.cssSelector("li[id='menu-item-2008']");
    private By titleMyTutorialsAndTalksLocator = By.cssSelector("li[id='menu-item-2007']");
    private By optionHome = By.cssSelector("li[id='menu-item-263']");
    private By optionAutomation = By.cssSelector("li[id='menu-item-257']");
    private By optionSelenium = By.cssSelector("li[id='menu-item-258']");
    private By optionSeleniumTestingTutorials = By.cssSelector("li[id='menu-item-261']");
    private By optionTheWaiterLibrary = By.cssSelector("li[id='menu-item-1299']");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnLink(String link) throws Exception {
        switch (link) {

            case "The tittle tester comics":
                this.click(titleComicsLocator);
                break;

            case "My tutorials and talks":
                this.click(titleMyTutorialsAndTalksLocator);
                break;

            default:
                System.out.println("No existe esa opcion !!");
                break;

        }
    }

    public void clickOnOption(String modulo) throws Exception {

        switch (modulo){

            case "Home":
                this.click(optionHome);
                break;

            case "Automation":
                this.click(optionAutomation);
                break;

            case "Selenium":
                this.click(optionSelenium);
                break;

            case "Selenium testing tutorials":
                this.click(optionSeleniumTestingTutorials);
                break;

            case "The waiter library":
                this.click(optionTheWaiterLibrary);
                break;

            default:
                System.out.println("No existe esa opcion !!");
                break;
        }

    }

}
