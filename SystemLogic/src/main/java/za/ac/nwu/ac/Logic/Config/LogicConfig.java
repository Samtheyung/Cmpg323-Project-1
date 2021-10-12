package za.ac.nwu.ac.Logic.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.ac.Translator.Config.TranslatorConfiguration;

@Import({TranslatorConfiguration.class})
@Configuration

public class LogicConfig {
}
