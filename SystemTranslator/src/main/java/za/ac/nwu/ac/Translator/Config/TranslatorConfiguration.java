package za.ac.nwu.ac.Translator.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.ac.Repository.config.RepoConfig;

@Import({RepoConfig.class})
@Configuration

public class TranslatorConfiguration {
}
