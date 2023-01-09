package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HU03Step extends TestBase {


    @Given("^El usuario navega al sitio web de sauce demo$")
    public void el_usuario_navega_al_sitio_web_de_sauce_demo() throws Throwable {
        Assert.assertTrue(loginPage.loginPageIsDisplayed());
    }

    @When("^El usuario ingresa las credenciales correctas$")
    public void el_usuario_ingresa_las_credenciales_correctas() throws Throwable {
        loginPage.loginCorrecto("standard_user","secret_sauce");
    }

    @Then("^El usuario deberia ver que se logueo correctamente$")
    public void el_usuario_deberia_ver_que_se_logueo_correctamente() throws Throwable {
        Assert.assertEquals("PRODUCTS", driver.findElement(By.xpath("//span[@class='title'][contains(.,'Products')]")).getText());
    }

    @When("^El usuario ingresa las credenciales incorrectas$")
    public void el_usuario_ingresa_las_credenciales_incorrectas() throws Throwable {
        loginPage.loginIncorrecto("standard_use", "secret_sauc");
    }

    @Then("^El usuario deberia ver que se loguea incorrectamente$")
    public void el_usuario_deberia_ver_que_se_loguea_incorrectamente() throws Throwable {
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", driver.findElement(By.xpath("//h3[@data-test='error'][contains(.,'Epic sadface: Username and password do not match any user in this service')]")).getText());
    }

}
