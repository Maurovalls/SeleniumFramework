package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private String titleLoginPageSauceDemo = "Swag Labs";
    private By inputUserName =  By.xpath("//input[contains(@id,'user-name')]");
    private By inputPassword = By.xpath("//input[contains(@id,'password')]");
    private By enterButton = By.xpath("//input[contains(@id,'login-button')]");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public boolean loginPageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleLoginPageSauceDemo);
    }

    public void loginCorrecto(String username, String password) throws Exception{
        this.sendKeys(inputUserName,username);
        this.sendKeys(inputPassword,password);
        this.click(enterButton);
    }

    public void loginIncorrecto(String username, String password) throws Exception{
        this.sendKeys(inputUserName,username);
        this.sendKeys(inputPassword,password);
        this.click(enterButton);
    }
}
