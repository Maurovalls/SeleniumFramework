package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.LogHelper;

import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = ("steps"),
        tags = {"@Login"},
        plugin = {"json:test/report/cucumber_report.json"}
)
public class Testrunner {

    private static final Logger LOGGER = LogHelper.getLogger(Testrunner.class);

    @BeforeClass()
    public static void setUp(){
        LOGGER.log(Level.INFO, "Test execution begins...");
    }

    @AfterClass
    public static void finish(){
        try{
            LOGGER.log(Level.INFO, "Generando Reporte...");
            String[] cmd = {"cmd.exe", "/C" , "npm run report"};
            Runtime.getRuntime().exec(cmd);
            LOGGER.log(Level.INFO, "Reporte generado exitosamente");
        }catch(Exception e){
            LOGGER.log(Level.WARNING, "No se pudo generar el reporte");
            e.printStackTrace();
        }
    }

}
