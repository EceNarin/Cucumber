package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags="@wip or @wip1",
        dryRun = false

        )
public class Runner {
    /*
    Bir frameWork'te tek bir runner class'i yeterli olabilir
    Runner class'in class bodys'inde hicbir sey olmaz
    Runner class'imizi onemli yapan 2 tane notation vardir
    @RunWith(Cucumber.class) nostation'u class'imiza calisma ozelligi katar
    Bu notasyon icin cucumber FrameWork'umuzde jUnit'i tercih ediyoruz
     */


}
