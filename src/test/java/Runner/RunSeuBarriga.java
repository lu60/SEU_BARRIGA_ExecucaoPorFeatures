package Runner;

import Pages.AcessoContaPage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/seuBarriga.json", "html:target/reports/"},
        features = {"classpath:/features"},
        glue = {"Steps"},
        tags = {"@cenarioCompleto"}
)

public class RunSeuBarriga extends RunBase{
    private static AcessoContaPage acessoContaPage = new AcessoContaPage();
    @BeforeClass
    public static void inicializa(){
        acessoContaPage.AcessarConta("lu.pocebon@gmail.com", "P@alito176");
    }

    @AfterClass
    public static void stop() {
        driver.quit();
    }
}
