package com.spbpu.bi;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.spbpu.bi")
@EnableJpaRepositories("com.spbpu.bi")
@EntityScan("com.spbpu.model")
public class BiToolsConfiguration {
}
