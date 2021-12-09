package com.exoSpring.seismeLocation.configurations;

import com.exoSpring.seismeLocation.repositories.SeismeRepository;
import com.exoSpring.seismeLocation.services.SeismeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeismeConfiguration {
    @Bean
    public SeismeService seismeService(
            SeismeRepository repository,
            ModelMapper mapper
    ) {
        return new SeismeService(mapper,repository);
    }
}
