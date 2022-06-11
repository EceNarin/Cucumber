package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags="@calistir",
        dryRun = false

        )
public class TestRunner {
    /* CTRL+ENTER
    Bir frameWork'te tek bir runner class'i yeterli olabilir
    TestRunner class'in class bodys'inde hicbir sey olmaz
    TestRunner class'imizi onemli yapan 2 tane notation vardir
    @RunWith(Cucumber.class) nostation'u class'imiza calisma ozelligi katar
    Bu notasyon icin cucumber FrameWork'umuzde jUnit'i tercih ediyoruz
     */


}
