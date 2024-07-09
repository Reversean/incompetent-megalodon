package com.spbpu.core;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Slf4j
@Component
@RequiredArgsConstructor
public class TestComponent {

    final DataSource dataSource;
    final DataSource projectDataSource;

    @PostConstruct
    void init() {
        log.info("Primary data source {}", dataSource);
        log.info("Project data source: {}", projectDataSource);
    }
}
