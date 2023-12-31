package com.tbp.movie.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.tbp.movie")
@EntityScan(basePackages = "com.tbp.movie")
@ComponentScan("com.tbp.movie")
@Configuration
public class JpaRespositoryConfiguration {
}
