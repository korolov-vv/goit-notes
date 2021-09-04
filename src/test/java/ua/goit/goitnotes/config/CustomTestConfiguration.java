package ua.goit.goitnotes.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import ua.goit.goitnotes.note.service.processors.MarkdownProcessorCommonMarkdownImplementation;
import ua.goit.goitnotes.validation.ValidationService;

@TestConfiguration
public class CustomTestConfiguration {
    @Bean
    public MarkdownProcessorCommonMarkdownImplementation markdownConverterCommonMarkdownImplementation() {
        return new MarkdownProcessorCommonMarkdownImplementation();
    }


    @Bean
    public ValidationService validationService() {
        return new ValidationService();
    }
}
