package com.example.Vaccination;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.Vaccination")
public class VaccinationConfig {

    @Bean
    public CreateStudent createBean(){
        return new CreateStudent();
    }
}
