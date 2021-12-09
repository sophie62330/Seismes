package com.exoSpring.seismeLocation.configurations;

import com.exoSpring.seismeLocation.repositories.LocalisationRepository;
import com.exoSpring.seismeLocation.services.LocalisationService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalisationConfiguration {
    @Bean
    public LocalisationService postService(
            LocalisationRepository repository,
            ModelMapper mapper
    ) {
        return new LocalisationService(mapper, repository);
    }
}
