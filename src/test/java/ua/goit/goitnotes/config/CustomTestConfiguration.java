package ua.goit.goitnotes.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import ua.goit.goitnotes.service.ValidationService;

@TestConfiguration
public class CustomTestConfiguration {
    @Bean
    public ValidationService validationService(){
        return new ValidationService();
    }
}