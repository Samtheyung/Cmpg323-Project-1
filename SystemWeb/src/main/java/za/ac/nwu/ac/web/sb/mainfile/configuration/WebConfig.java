package za.ac.nwu.ac.web.sb.mainfile.configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.ac.Logic.Config.LogicConfig;

@Import({LogicConfig.class})
@Configuration
@ComponentScan(basePackages = {
                "za.ac.nwu.ac.web.sb.exception",
                "za.ac.nwu.ac.web.sb.mainfile.controller"
})
public class WebConfig {
}
