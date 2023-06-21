package com.tbp.theatre.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.tbp.theatre")
@EntityScan(basePackages = "com.tbp.theatre")
@ComponentScan("com.tbp.theatre")
@Configuration
public class JpaRespositoryConfiguration {
}
