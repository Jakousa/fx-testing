package ohtu;

import javafx.application.Application;
import javafx.stage.Stage;
import org.junit.*;
import org.testfx.framework.junit.ApplicationTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCukesTest extends ApplicationTest {

    @BeforeClass
    public static void setupHeadlessMode() throws Exception {
        ApplicationTest.launch(Main.class);
    }
}
