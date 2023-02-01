package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/seuBarriga.json", "html:target/reports/"},
        features = {"classpath:/features"},
        glue = {"Steps"},
        tags = {"@cenarioCompleto"}
)

public class RunSeuBarriga extends RunBase{
    @AfterClass
    public static void stop() {
        driver.quit();
    }
}
